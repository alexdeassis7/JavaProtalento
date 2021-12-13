package Practicasemana4;

public class Main {

	public static void main(String[] args) {
		Avion a= new Avion("boy",21,"447",123);
		Superman b=new Superman("superman ","el hombre de acero",3000000);
		
		Helicoptero c=new Helicoptero("elis","prive",1333);
		
		
		//creamos un  vector de voladores
		voladores[] volador=new voladores[] {a,b,c};
		
		//recorremos el vector
		
		for(voladores unVolador: volador) {
			//verificamos contrato
			if(unVolador.getClass().isAssignableFrom(Aterrizable.class)) {
				
				
				//nos  aseguramos de que unVolador tiene el metodo
				Aterrizable at=(Aterrizable)unVolador;
				resultado res=at.aterrizar();				
				
				
				//evaluamos que pasa yes/no
				
			if(res.isExitoso()) {
				System.out.println("todo esta correcto");
				
			}} else {
			 System.out.println("hay fallas");
			}
		}
				
		
				
				

	}

}
