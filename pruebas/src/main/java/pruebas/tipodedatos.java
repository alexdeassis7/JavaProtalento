package pruebas;
import java.util.Scanner;
public class tipodedatos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//ahora se pueden leer los datos desde el teclado
		//f5,f6,f7,f8
		System.out.println("iungrese un valor para a");
		int a,suma,b;
		a=teclado.nextInt();
		//f6
		System.out.println("ingrese el valor de b");
		//f6
		b=teclado.nextInt();
		//f6
		suma= a +b;
		System.out.println("la suma es\n"+ suma);
		//cierre de teclado f8
		teclado.close();
		
		
		

	}

}
