package pooExcepciones.ejemplo;

import javax.swing.JOptionPane;

public class EjemploExcepciones {
	public static void main(String[] args) {
		
		Calculadora cal=new Calculadora();
		
		String numerador= JOptionPane.showInputDialog("Ingrese un entero numerador:");
		String denominador= JOptionPane.showInputDialog("Ingrese un entero denominador:");
	
		
		try {
		
		
			double division2=cal.dividir(numerador,denominador);
			System.out.println("Division2="+division2);
		
		} catch (FormatoNumeroException e) {
			System.out.println("Ingrese un numero valido:"+e.getMessage());
			e.printStackTrace(System.out);
		}
		catch (DivisionPorZeroException ae) {// si por la clase creada extiende de exception obliga su manejo
			System.out.println("Capturamos la excepcion en tiempo de ejecución"+ae.getMessage());
		}finally {
			System.out.println("Es opcional. se ejecuta con o sin excpecioón.");
		}	
			System.out.println("Continuamos con el flujo de nuestra aplicación.");
		
	}
}
