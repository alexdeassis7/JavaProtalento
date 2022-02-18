package com.educationit.modelos;

//VO =  Value Object 
//Al utilizar este tipo de clases, aplicamos el patrón Value Object o VO
//(Anteriormente conocidas como DTO Data Transfer Object) en el que representamos las entidades (Tablas) 
//de la base de datos, la tabla persona tiene los campos id, nombre, edad, profesión , teléfono  entonces
//nuestra clase Vo tendrá estos mismos atributos y de esta manera podremos transportar un objeto persona con 
//todos estos valores por medio de los métodos set y get de cada atributo.
//
//Este patrón nos facilita enormemente el transporte de la información, evitando que se envíen gran
//cantidad de parámetros a un método cuando queremos hacer un registro o actualización, también en caso de 
//que se modifique la tabla de la BD, nuestra clase deberá ser modificada así como los métodos que obtienen la 
//información, mas no los métodos que la transportan.
public class PersonaVO {

	private Integer idPersona;
	private String nombrePersona;
	private Integer edadPersona;
	private String profesionPersona;
	private Integer telefonoPersona;

	public PersonaVO() {
	}

	public PersonaVO(String nombrePersona, Integer edadPersona, String profesionPersona, Integer telefonoPersona) {
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona
				+ ", profesionPersona=" + profesionPersona + ", telefonoPersona=" + telefonoPersona + "]";
	}

}
