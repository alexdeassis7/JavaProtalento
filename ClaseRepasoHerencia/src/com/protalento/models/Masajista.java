package com.protalento.models;

//clase hija de SeleccionFutbol
public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public Masajista(int id) {
		super();
	}

	public void darMasaje() {
		System.out.println("Clase Masajista darMasaje()");
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

}
