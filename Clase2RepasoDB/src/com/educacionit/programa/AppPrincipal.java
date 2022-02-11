package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.dao.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		
		PersonaDAO pdao = new PersonaDAO();
		
		int opcionIngresada;
		do {

			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("Ingresa la opcion deseada \n 1. Crear persona \n 2. Borrar persona"));
			
			switch (opcionIngresada) {
			case 1:
				pdao.registrarPersona(ObtenerDatos.solicitarDatosPersona());
				break;
			case 2:
				pdao.eliminarPersona(ObtenerDatos.solicitarIdDePersona());
				break;
			}

		} while (opcionIngresada != 1 && opcionIngresada != 2);
	}
}
