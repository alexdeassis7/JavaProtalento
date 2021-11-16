package clase3;
import java.util.Scanner;
public class utilizacionif2 {

	public static void main(String[] args) {
		//ingrese contraseña y usuario
		//si copntraseña="1234" y usuario =admin=>"ok"
		//de lo contrario "fail"
		
		String usuario,contraseña;
		usuario="jose";
		contraseña="12345";
		//primera forma
		if(contraseña=="1234"&&usuario=="admin") {
			System.out.println("ok");
		}else {
			System.err.println("fail");
		}
		if(usuario=="admin") {
			if(contraseña=="1234") {System.out.println("ok");
				
			}else {
				System.err.println("fail");
			}
		}else {
			System.err.println("fail");
		}
		
		}
		
		
		
		

	}


