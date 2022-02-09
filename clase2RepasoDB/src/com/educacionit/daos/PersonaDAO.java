
//		ATAJOS UTILES
//		ctrl + shift + f = identado de codigo
//		ctrl + shift + o = auto import
//		ctrl + shift +c = comentario
//		ctrl + m = cerrar y abrir package explorer
//		alt + shift + s : abrir pesta�a para crear contructores , toString , get /set ...etc
//		ctrl + d = delete line
//		ctrl + space = intelisense
//		ctrl +shift + r = atajo para buscar una clase 
//		alt + Flecha arriba o abajo = mover codigo seleccionado
//		Shift + alt + A escribir en varias l�neas :)
//		ctrl + shift + L = listado de atajos 
//		ctrl + f11, corres la app,
//		ctrl + t, para ver las clases con las que estas relacionadas tambi�n sirven
//		ctrl + m abrir y cerrar project explorer
package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelos.PersonaVO;

//Clase que permite el acceso a datos 
//Cuando utilizamos estas clases, aplicamos el patr�n Data Access Object o DAO,
//b�sicamente este patr�n consiste en centralizar los procesos de acceso a la base de datos
//evitando inconsistencias y posibles problem�ticas cuando esto se realiza a lo largo de la aplicaci�n.
//Con este patr�n independizamos la l�gica de negocio de la l�gica de acceso a datos obteniendo mayor 
//organizaci�n y flexibilidad en el sistema.
public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();

		try {
			// El objeto estatuto me sirve para procesar sentencial SQL y obtener lo
			// resultados de la misma
			Statement estatuto = conex.getConnection().createStatement();

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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
