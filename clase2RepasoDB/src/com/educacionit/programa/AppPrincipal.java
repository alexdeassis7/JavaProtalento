package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		int opcionIngresada;
		PersonaDAO pdao = new PersonaDAO();

		do {

			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("Ingrese la opcion deseaada \n 1)Crear persona\n 2)Borrar Persona"));

			switch (opcionIngresada) {

			case 1:				
				pdao.registrarPersona(ObtenerDatos.solicitarDatosPersona());
				break;
			case 2:
				pdao.eliminarPersona(ObtenerDatos.solicitarIdDePersona());
				break;
				//TAREA
//				un case 3, y la condición sea System.exit(); pa salir no se...
//				1-crear una exception personalizada si la persona que se desea buscar no existe y lanzarla
//				2-crear el case para actualizar persona con su respectivo metodo en el dao Modificar persona 
				//UPDATE persona set id = ? , ......
//				3-crear el case para poder buscar una persona por su id 
				
			}

		} while (opcionIngresada != 1 && opcionIngresada != 2);

	}

}
