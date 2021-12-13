package Practicasemana4;

public class Helicoptero extends voladores {
    private String nombre;
    private String marca;
    
   private int velocidad;
	public Helicoptero(String nombre,String marca,int velocidad) {
		super(nombre);
		this.marca=marca;
		this.velocidad=velocidad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	

}
