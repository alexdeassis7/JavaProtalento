package com.educacionit.modelos;

//import lombok.Data;

//VO = Value Objest, DTO= Data Transfer Object
//@Data
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
	
	
	
}
