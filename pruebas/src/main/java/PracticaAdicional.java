import java.util.Scanner;
public class PracticaAdicional {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int cantAlumnos=0;
		int x=1;
		int n;
		int nota;
		int d=0;
		int alumnosP=0;
		int alumnosR=0;
		String nombres;
		System.out.println("cantidad de alumnos a procesar\n\n");
		n=teclado.nextInt();
		while(d<=n) {
		System.out.println("ingrese los nombres de los alumnos\n\n");
		nombres=teclado.nextLine();
		d++;}
		
		while(x<=n) {
			
			System.out.println("ingrese nota del alumno en el mismo orden que ha escrito los nombres\n\n");
					
			nota=teclado.nextInt();
			if(nota>=7) {
				System.out.println("el alumno es promocionado\n\n");
			
			}else{
				System.out.println("el alumno no es promocionado\n");
				
			}if(nota>=7 && nota <=10) {
				System.out.println("el alumno tiene  calificación alta\n");
				
			}else {
				System.out.println("el alumno tiene calificación baja\n");
			}
			
			x++;
		if(nota>=7) {
			alumnosP++;
		}else {
			alumnosR++;
		}
			
			
		}
		System.out.println("los alumnos promocionados son\n\n" + alumnosP );
		
		System.out.println("los alumnos repitentes son"+ alumnosR);
			
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	
		

	


