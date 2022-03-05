package com.protalento.modelos;

public class Passenger {

	// atributos : bolsos , bolsosPagos ,tarifaXBolso, totalAPagar , totalEquipaje

	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalApagar;
	private double totalEquipaje;

	public Passenger() {
	}

	// constructor 2 :
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totalApagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;

	}

	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		this.totalEquipaje = bolsos + bolsosPagos;
		totalApagar = bolsos * tarifaXbolso;
	}

	private Passenger(double tarifaXBolso) {
		this.tarifaXbolso = tarifaXBolso;
	}

	public int getBolsosGratis() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}
	
	//crear metodo que permita mostrar una array de pasajeros 

}
