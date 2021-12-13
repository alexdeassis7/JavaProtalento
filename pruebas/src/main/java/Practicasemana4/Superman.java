package Practicasemana4;

public class Superman extends voladores {
    private String marca;
    private int velocidad;
	public Superman(String nombre,String marca,int velocidad) {
		super(nombre);
		this.marca=marca;
		this.velocidad=velocidad;
		
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
