package ar.com.educacionit.dominio;
import java.util.Date;
public class ArticuloTest {



	public static void main(String[] args) {
		//assert
		Articulos miArticulo = new Articulos("titulo1", new Date(), "0001", 2500d, 5, 1l, 1l);
		
		//f3
		//alt <-
		//alt ->
		String titulo = miArticulo.getTitulo();
		
		boolean iguales = titulo.equals("TITULO1");
		
		if(iguales) {
			System.out.println("ok");
		}else {
			System.out.println("fail");
		}
		
	}
}


