package Practicasemana4;

public class Avion extends voladores implements Aterrizable {

	private int cantasientos;
	private String marca;
	private int velocidad;
	public Avion(String nombre,int cantasientos,String marca,int velocidad) {
		super(nombre);
		this.cantasientos=cantasientos;
		this.marca=marca;
		this.velocidad=velocidad;
	}
	public resultado aterrizar() {
		
		if(velocidad<3000000) {
			System.out.println("el avion puede aterrizar");
		}else {
			System.out.println("el avion no puede aterrizar");
		}
		return null;
	}
	public int getCantasientos() {
		return cantasientos;
	}
	public void setCantasientos(int cantasientos) {
		this.cantasientos = cantasientos;
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
