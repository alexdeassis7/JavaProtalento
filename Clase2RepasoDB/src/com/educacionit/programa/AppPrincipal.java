package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.dao.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		PersonaDAO pdao = new PersonaDAO();

		int opcionIngresada;
		do {

			opcionIngresada = Integer.parseInt(JOptionPane.showInputDialog(
					"Ingresa la opcion deseada \n 1. Crear persona \n 2. Borrar persona \n 3. Actualizar persona"
							+ " \n 4. Buscar persona  \n 0. Salir"));

			switch (opcionIngresada) {
			case 1:
				pdao.registrarPersona(ObtenerDatos.solicitarDatosPersona());
				break;
			case 2:
				pdao.eliminarPersona(ObtenerDatos.solicitarIdDePersona());
				break;
			case 3:
				pdao.actualizarPersona(ObtenerDatos.solicitarIdDePersona(), ObtenerDatos.solicitarDatosPersona());
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
