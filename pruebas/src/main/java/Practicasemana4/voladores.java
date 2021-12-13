package Practicasemana4;

public abstract class voladores {

protected String nombre;//por ser protetecte los hijos lo pueden heredar con private


public voladores(String nombre) {
	this.nombre=nombre;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
