package com.educationit.programa;

import javax.swing.JOptionPane;

import com.educationit.daos.PersonaDAO;
import com.educationit.excepciones.GenericException;
import com.educationit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		

		int opcionIngresada;
		PersonaDAO pdao = new PersonaDAO();

		do {

			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("Ingrese la opcion deseaada \n 1)Crear persona \n 2)Borrar Persona \n 3)Actualizar Persona \n 4) Buscar Persona \n 0)Salir"));

			switch (opcionIngresada) {
			case 1:
				pdao.registrarPersona(ObtenerDatos.solicitarDatosPersona());
				break;
			case 2:
				pdao.eliminarPersona(ObtenerDatos.solicitarIdDePersona());
				
				break;
				
			case 3:
				try {
					pdao.actualizarPersona(ObtenerDatos.solicitarIdDePersona(), ObtenerDatos.solicitarDatosPersona());
				} catch (GenericException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				pdao.buscarPersona(ObtenerDatos.solicitarIdDePersona());
				break;
			case 0:
				//System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese opcion valida", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}

		} while (opcionIngresada != 0);
	}
}