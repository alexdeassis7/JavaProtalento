package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

//		PersonaVO p1 = new PersonaVO("Alex", 27, "profesor", 112255);
//
//		PersonaDAO pdao = new PersonaDAO();
//
//		pdao.registrarPersona(p1);

		int opcionIngresada;

		do {

			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("Ingrese la opcion deseaada \n 1)Crear persona\n 2)Borrar Persona"));

			switch (opcionIngresada) {

			case 1:
				JOptionPane.showMessageDialog(null, "ingrese a la opcion 1");
				// pedir los datos para carga un objeto persona y luego persistirlo
				// pdao.registrarPersona(p1);
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "ingrese a la opcion 2");
				// pedir un id para borrar un objeto persona (validar que dicho id exista en al
				// db )
				// pdao.borrarPersona(1);
				break;
				
//				un case 3, y la condición sea System.exit(); pa salir no se...

			}

		} while (opcionIngresada != 1 && opcionIngresada != 2);

	}

}
