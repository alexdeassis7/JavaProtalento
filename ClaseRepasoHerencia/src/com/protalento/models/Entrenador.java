package com.protalento.models;

//clase hija de SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Clase Entrenador dirigirPartido()");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Clase Entrenador dirigirEntrenamiento()");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}	
	
}
