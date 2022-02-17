package com.educacionit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.exeption.GenericException;
import com.educacionit.modelos.PersonaVO;

public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		// Ctrl + shift + o
		Conexion conexion = new Conexion();
		Statement st = null;
		try {
			// El objecto estatuto me sirve para procesar sentencias SQL y obtener los
			// resultados de la misma
			st = conexion.getConnection().createStatement();
			st.execute("INSERT INTO persona(nombre, edad, profesion, telefono) VALUES('" + miPersona.getNombrePersona()
					+ "', '" + miPersona.getEdadPersona() + "', '" + miPersona.getProfesionPersona() + "', '"
					+ miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "Se ah Registrado Exitosamente a " + miPersona.getNombrePersona(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showConfirmDialog(null, "No se registro a " + miPersona.getNombrePersona());
		} finally {
			try {
				conexion.getConnection().close();
				st.close();
				System.out.println("Se cerro la conexion");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void eliminarPersona(Integer id) {

		Conexion conexion = new Conexion();

		if (id != null) {
			try (Statement st = conexion.getConnection().createStatement()) {
				if (validarSiElIdExisteEnLaTablaPersona(id)) {
					st.execute("DELETE FROM persona WHERE id = " + id);
					JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente", "Informacion",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"No se ha eliminado porque el id: " + id + "no existe en la base de datos");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showConfirmDialog(null, "No se ha eliminado porque el id ingresado es null");
			} finally {
				try {
					conexion.getConnection().close();
					System.out.println("Se cerro la conexion");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public boolean validarSiElIdExisteEnLaTablaPersona(Integer id) {

		Conexion conexion = new Conexion();
		boolean encontrado = false;

		if (id != null) {

			Statement st = null;
			try {
				st = conexion.getConnection().createStatement();
				ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM persona WHERE id = " + id);
				if (rs.next()) {
					if (rs.getInt(1) > 0) {
						encontrado = true;
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null,
						"Nose se ejecuto validarSiElIdExisteEnLaTablaPersona con el id : " + id);
			} finally {
				try {
					conexion.getConnection().close();
					st.close();
					System.out.println("Se cerro la conexion");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return encontrado;
	}

	public PersonaVO buscarPersona(int id) {

		Conexion conexion = new Conexion();
		String sql = "SELECT * FROM persona WHERE id = ?";
		PersonaVO persona = new PersonaVO();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = conexion.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				persona.setIdPersona(rs.getInt(1));
				persona.setNombrePersona(rs.getString(2));
				persona.setEdadPersona(rs.getInt(3));
				persona.setProfesionPersona(rs.getString(4));
				persona.setTelefonoPersona(rs.getInt(5));
			} else {
				persona = null;
			}

			JOptionPane.showMessageDialog(null,
					"Se encontro persona con id: " + id + "\n " + persona,
					"Informacion", JOptionPane.INFORMATION_MESSAGE);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Nose se ejecuto buscarPersona con el id : " + id);
		} finally {
			try {
				conexion.getConnection().close();
				ps.close();
				rs.close();
				System.out.println("Se cerro la conexion");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return persona;
	}

	public void actualizarPersona(int id, PersonaVO persona) throws GenericException {

		Conexion conexion = new Conexion();
		String sql = "UPDATE persona SET nombre = ?, edad = ?, profesion = ?, telefono = ? WHERE id = ?";
		PreparedStatement ps = null;
		persona.setIdPersona(id);
		
		if (validarSiElIdExisteEnLaTablaPersona(id)) {
			
			try {
				ps = conexion.getConnection().prepareStatement(sql);
				ps.setString(1, persona.getNombrePersona());
				ps.setInt(2, persona.getEdadPersona());
				ps.setString(3, persona.getProfesionPersona());
				ps.setInt(4, persona.getTelefonoPersona());
				ps.setInt(5, persona.getIdPersona());
				
				ps.executeUpdate();
				
				JOptionPane.showMessageDialog(null,
						"Se ah actualizado correctamente datos de id " + id + "\n " + persona,
						"Informacion", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Nose se ejecuto  actualizarPersona para id: " + id);
			} finally {
				try {
					conexion.getConnection().close();
					ps.close();
					System.out.println("Se cerro la conexion");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			throw new GenericException("No existe el id: " + id);
		}
		

	}

}
