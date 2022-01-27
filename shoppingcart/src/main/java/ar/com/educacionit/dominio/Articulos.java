package ar.com.educacionit.dominio;
import java.util.Date;
public class Articulos {
	
	private Long id;
	private String titulo;
	private Date fecha_Creacion;
	private String codigo;
	private double precio;
	private int existencias;
	private Long marcaId;
	private Long categoria;
	
	
	public Articulos(String titulo, Date fecha_Creacion, String codigo, double precio, int existencias, Long marcaId,
			Long categoria) {
		
		this.titulo = titulo;
		this.fecha_Creacion = fecha_Creacion;
		this.codigo = codigo;
		this.precio = precio;
		this.existencias = existencias;
		this.marcaId = marcaId;
		this.categoria = categoria;
	}


	public Articulos(Long id, String titulo, Date fecha_Creacion, String codigo, double precio, int existencias,
			Long marcaId, Long categoria) {
		
		this.id = id;
		this.titulo = titulo;
		this.fecha_Creacion = fecha_Creacion;
		this.codigo = codigo;
		this.precio = precio;
		this.existencias = existencias;
		this.marcaId = marcaId;
		this.categoria = categoria;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFecha_Creacion() {
		return fecha_Creacion;
	}


	public void setFecha_Creacion(Date fecha_Creacion) {
		this.fecha_Creacion = fecha_Creacion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getExistencias() {
		return existencias;
	}


	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}


	public Long getMarcaId() {
		return marcaId;
	}


	public void setMarcaId(Long marcaId) {
		this.marcaId = marcaId;
	}


	public Long getCategoria() {
		return categoria;
	}


	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Articulos [id=" + id + ", titulo=" + titulo + ", fecha_Creacion=" + fecha_Creacion + ", codigo="
				+ codigo + ", precio=" + precio + ", existencias=" + existencias + ", marcaId=" + marcaId
				+ ", categoria=" + categoria + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	


	
	
	
	

}
