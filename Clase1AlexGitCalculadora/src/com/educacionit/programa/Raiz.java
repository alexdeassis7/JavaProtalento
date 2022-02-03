package com.educacionit.programa;

public class Raiz {
	float indice;
	float radical;
	float raiz;
	public float CalculaRaiz(float indice,float radical) {
		
		raiz=(float) Math.pow(radical, indice);
		
		
		return raiz;
		
	}
}
