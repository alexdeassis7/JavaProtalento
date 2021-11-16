package clase3;

public class Mayor {

	public static void main(String[] args) {
		// determminar de tres numeros cual es el mayor
		// necesito 3 variables
		// if
		//mostrar
		double a,b,c;
		a=12;
		b=12;
		c=12.3;
		//a>b y a>c caso 1
		//b>a y b>c caso 2
		//c>a y c>b caso 3
		//a==b y a==c
				if(a > b && a > c) {
					System.out.println("es mayor"+a);
					
				}if(b>a && b >c) {
					System.out.println("el mayor \n "+b);
					
				}if(c>a && c> b) {
					System.out.println("el mayor es\n"+c);
					
				}if(a==b && a==c) {
					System.out.println("son iguales\n"+a+ "," + b+"," + c );
					
				}
				

	}

}
