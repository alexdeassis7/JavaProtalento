package com.educacionit.programa;

import java.lang.Math;
import java.util.Scanner;

public class ArcSeno {
	
	public static void funcionArcoseno() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el ángulo: ");
		
		double angulo = teclado.nextDouble();
		
		double anguloRad = Math.toRadians(angulo);
		
		System.out.println("El arcseno de "+ angulo +" es "+ Math.asin(anguloRad));
		
		teclado.close();

	}
	
	public static void main(String[] args) {
		funcionArcoseno();
	}
	
}
