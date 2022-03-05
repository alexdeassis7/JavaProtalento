package com.protalento.models;

//clase hija de SeleccionFutbol
public class Futbolista extends SeleccionFutbol {

	private String dorsal;
	private String demarcacion;

	public Futbolista(int id, String nombre, String apellido, int edad, String dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public Futbolista() {
		super();
	}

	public void jugarPartido() {
		System.out.println("Clase Futbolista jugarPartido()");
	}

	public void Entrenar() {
		System.out.println("Clase Futbolista Entrenar()");
	}

	public String getDorsal() {
		return dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
