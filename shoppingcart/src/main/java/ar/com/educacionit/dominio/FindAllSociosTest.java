package ar.com.educacionit.dominio;

import ar.com.educacionit.dao.impl.SociosDaoimpl;

public class FindAllSociosTest {
	public static void main(String[] args) {
		//creo la implementacion que me per,mite accecder a la base de datos a crud
		
		
		SociosDaoimpl socioImpl=new SociosDaoimpl();
		
		Socios[] vectordesocios=socioImpl.findAll();
		for(Socios socio:vectordesocios) {
			System.out.println(socio);
		}
		
		
		
		
		
	}

}
