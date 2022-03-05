package com.protalento.models;

//Clase Padre - NO Abstracta
public class SeleccionFutbol {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public SeleccionFutbol() {
		super();
	}

	public void concentrarse() {
		System.out.println("Clase SeleccionFutbol concentrarse()");
	}

	public void viajar() {
		System.out.println("Clase SeleccionFutbol viajar()");
	}

	protected int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

//clase padre con 'n' lineas de codigo 
//
//tres clases hijas con 'a' , 'b' y 'c' lines de codigo 
//
//reducimos nuestro codigo en '2n' lineas de codigo 
//
//antes teniamos '(n+a) + (n+b) + (n+c)' lineas de codigo 
//
//y tras aplicar herencia tendremos  'n+a+b+c' lineas 
