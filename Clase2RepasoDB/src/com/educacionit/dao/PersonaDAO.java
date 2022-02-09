package com.educacionit.dao;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		// Ctrl + shift + o
		Conexion conexion = new Conexion();

		try {
			// El objecto estatuto me sirve para procesar sentencias SQL y obtener los
			// resultados de la misma
			Statement st = conexion.getConnection().createStatement();
			st.execute("INSERT INTO persona(nombre, edad, profesion, telefono) VALUES('" + miPersona.getNombrePersona() + "', '"
					+ miPersona.getEdadPersona() + "', '" + miPersona.getProfesionPersona() + "', '"
					+ miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "Se ah Registrado Exitosamente a " + miPersona.getNombrePersona(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showConfirmDialog(null, "No se registro a " + miPersona.getNombrePersona());
		} finally {
			try {
				conexion.getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
