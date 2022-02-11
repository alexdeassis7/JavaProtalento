
//		ATAJOS UTILES
//		ctrl + shift + f = identado de codigo
//		ctrl + shift + o = auto import
//		ctrl + shift +c = comentario
//		ctrl + m = cerrar y abrir package explorer
//		alt + shift + s : abrir pestaña para crear contructores , toString , get /set ...etc
//		ctrl + d = delete line
//		ctrl + space = intelisense
//		ctrl +shift + r = atajo para buscar una clase 
//		alt + Flecha arriba o abajo = mover codigo seleccionado
//		Shift + alt + A escribir en varias líneas :)
//		ctrl + shift + L = listado de atajos 
//		ctrl + f11, corres la app,
//		ctrl + t, para ver las clases con las que estas relacionadas también sirven
//		ctrl + m abrir y cerrar project explorer
package com.educacionit.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//Clase que permite el acceso a datos 
//Cuando utilizamos estas clases, aplicamos el patrón Data Access Object o DAO,
//básicamente este patrón consiste en centralizar los procesos de acceso a la base de datos
//evitando inconsistencias y posibles problemáticas cuando esto se realiza a lo largo de la aplicación.
//Con este patrón independizamos la lógica de negocio de la lógica de acceso a datos obteniendo mayor 
//organización y flexibilidad en el sistema.
public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		Statement estatuto = null;

		try {
			// El objeto estatuto me sirve para procesar sentencial SQL y obtener lo
			// resultados de la misma
			estatuto = conex.getConnection().createStatement();

			estatuto.execute("INSERT INTO persona (nombre , edad , profesion , telefono) VALUES ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");
			JOptionPane.showMessageDialog(null, "Se ah Registrado Exitosamente a " + miPersona.getNombrePersona(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);

			estatuto.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "no se registro a " + miPersona.getNombrePersona());
		} finally {
			try {
				conex.getConnection().close();
				System.out.println("Se cerro la conexion");
				if (estatuto != null)
					estatuto.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void eliminarPersona(Long id) {
		Conexion connection = new Conexion();
		Statement estatuto = null;

		if (id != null) {
			try {
				if (validarSiElIdExisteEnLaTablaPersona(id)) {
					estatuto = connection.getConnection().createStatement();
					estatuto.execute("DELETE FROM persona WHERE id = " + id);
					JOptionPane.showMessageDialog(null, "Se ah Eliminado Correctamente", "Informacion",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"No Se ah Eliminado Correctamente por que el id : " + id + " no existe en la base ",
							"Informacion", JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null,
						"no se ejecuto validarSiElIdExisteEnLaTablaPersona con el id :" + id);
			} finally {
				try {
					connection.getConnection().close();
					System.out.println("Se cerro la conexion");
					if (estatuto != null)
						estatuto.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "No Se ah Eliminado por que el id era null", "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public boolean validarSiElIdExisteEnLaTablaPersona(Long id) {
		Conexion conex = new Conexion();
		boolean encontrado = false;
		Statement estatuto = null;

		if (id != null) {
			try {
				estatuto = conex.getConnection().createStatement();
				ResultSet resultSet = estatuto.executeQuery("SELECT count(*) FROM persona WHERE id = " + id);

				if (resultSet.next()) {
					if (resultSet.getInt(1) > 0) {
						encontrado = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null,
						"no se ejecuto validarSiElIdExisteEnLaTablaPersona con el id :" + id);
			} finally {
				try {
					conex.getConnection().close();
					System.out.println("Se cerro la conexion");
					estatuto.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}
		return encontrado;
	}

	public static PersonaVO buscarPersona(int id) {
		Conexion conex = new Conexion();
		PersonaVO personaVO = null;
		ResultSet res = null;
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ?");
			consulta.setInt(1, id);
			res = consulta.executeQuery();

			personaVO = (res.next()) ? new PersonaVO(res.getString("nombre"), res.getInt("edad"),
					res.getString("profesion"), res.getInt("telefono")) : null;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "no se ejecuto validarSiElIdExisteEnLaTablaPersona con el id :" + id);
		} finally {
		
			try {
				conex.getConnection().close();
				System.out.println("Se cerro la conexion");
				if (res != null)
					res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return personaVO;
	}
	
	public static void main(String[] args) {
		System.out.println(buscarPersona(5));
	}

}

/*
 * //condicional doble String nombre = null; boolean condicion = false;
 * if(condicion) { nombre= "es true"; }else { nombre= "es false"; }
 * 
 * 
 * //operador ternario - if else inline nombre = (condicion ) ? "es true" :
 * "es false";
 */