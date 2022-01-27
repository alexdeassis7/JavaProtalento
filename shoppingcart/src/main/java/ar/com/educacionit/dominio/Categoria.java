package ar.com.educacionit.dominio;

public class Categoria {
	
	
	//caracteristicas
	private Long identifcacion;
	private String descripcion;
	private String codigo;
	public Categoria(Long identifcacion, String descripcion, String codigo) {
		
		this.identifcacion = identifcacion;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	
	public Categoria(String descripcion, String codigo) {
	
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	public Long getIdentifcacion() {
		return identifcacion;
	}


	public void setIdentifcacion(Long identifcacion) {
		this.identifcacion = identifcacion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	@Override
	public String toString() {
		return "Categoria [identifcacion=" + identifcacion + ", descripcion=" + descripcion + ", codigo=" + codigo
				+ "]";
	}
	
	
	
	
	
	
	

}
