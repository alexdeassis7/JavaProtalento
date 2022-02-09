package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.dao.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		PersonaVO p1 = new PersonaVO("Joel", 23, "Ing. Mecanico", 31322132);

		PersonaDAO pDao = new PersonaDAO();
		pDao.registrarPersona(p1);

		int opcionIngresada;
		do {

			opcionIngresada = Integer.parseInt(
					JOptionPane.showInputDialog("Ingresa la opcion deseada \n 1. Crear persona \n 2. Borrar persona"));
			
			switch (opcionIngresada) {
			case 1:
				JOptionPane.showMessageDialog(null, "Ingrese a la opcion 1");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Ingrese a la opcion 2");
				break;
			}

		} while (opcionIngresada != 1 && opcionIngresada != 2);

	}

}
