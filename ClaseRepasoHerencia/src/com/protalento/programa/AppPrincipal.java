package com.protalento.programa;

import java.util.ArrayList;
import java.util.List;

import com.protalento.models.Entrenador;
import com.protalento.models.Futbolista;
import com.protalento.models.Masajista;
import com.protalento.models.SeleccionFutbol;

public class AppPrincipal {

	// array list de objetos SeleccionFutbol. independientemente de la clase hija a
	// la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 0, "asd");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, "9", "Interior Izquierdo");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Lisenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println(
				"----------------------Todos los integrantes comienzan una concentracion . (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println(
				"----------------------Todos los integrantes viajan a jugar un partido  . (Todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println(
				"--------------------Entrenamiento: solamente el entrenador y el futbolista tienen metodos para entrenar ");
		System.out.print(delBosque.getNombre() + "" + delBosque.getApellido());
		delBosque.dirigirEntrenamiento();
		System.out.print(iniesta.getNombre() + "" + iniesta.getApellido());
		iniesta.Entrenar();

		// MASAJE
		System.out.println("-----------Masaje : solo el masajista tiene el metodo para dar un masaje ");
		System.out.print(raulMartinez.getNombre() + "" + raulMartinez.getApellido());
		raulMartinez.darMasaje();

		// PARTIDO DE FUTBOL
		System.out.println(
				"--------------------Entrenamiento: solamente el entrenador y el futbolista tienen metodos para el partido de futbol  ");
		System.out.print(delBosque.getNombre() + "" + delBosque.getApellido());
		delBosque.dirigirPartido();
		System.out.print(iniesta.getNombre() + "" + iniesta.getApellido());
		iniesta.jugarPartido();
	}

}
