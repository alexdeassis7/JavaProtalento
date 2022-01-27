package ar.com.educacionit.dominio;

public class Socios {
    private Long id;
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	private  Long pais_id;
	
	
	
	
	
	
	
	
	
public Socios(Long id, String nombre, String apellido, String correo, String direccion, Long paises_Id ) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.pais_id =paises_Id ;
	}


public Socios(String nombre, String apellido, String correo, String direccion, Long pais_id) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.direccion = direccion;
	this.pais_id = pais_id;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
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


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public Long getPais_id() {
	return pais_id;
}


public void setPais_id(Long pais_id) {
	this.pais_id = pais_id;
}


@Override
public String toString() {
	return "Socios [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion="
			+ direccion + ", pais_id=" + pais_id + "]";
}




	
	
	
	
	
	
	


	
	
	
	

	
	
	
	
	
	
	
	//se genera el metodo constructor
	
	
	
	
	
	
}
