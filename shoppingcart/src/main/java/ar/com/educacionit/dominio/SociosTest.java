package ar.com.educacionit.dominio;

import ar.com.educacionit.services.CategoriaService;
import ar.com.educacionit.services.SociosService;
import ar.com.educacionit.services.impl.CategoriaServiceImpl;
import ar.com.educacionit.services.impl.SociosServiceImpl;
public class SociosTest {
	


		public static void main(String[] args) {
			//alguien cargo los datos desde teclado
			String nombre = "JUAN";
			String apellido = "PEREZ";
			String dni = "123456789";
			String email = "unmail@mail.com";
			String direccion  = "calle 13";
			Long pais = 1l;//1=ARG/2=COL/3=BRA ETC ETC
			
			SociosService service = new SociosServiceImpl();		
			Socios socio = new Socios(nombre, apellido, email, direccion, pais);		
			service.save(socio);
			
			CategoriaService cservice = new CategoriaServiceImpl();		
			Categoria categorias = new Categoria("televisore", "abc1234");		
			cservice.save(categorias);
		}
	}
	
	
	


