package clase3;
import java.util.Scanner;
public class utilizacionif2 {

	public static void main(String[] args) {
		//ingrese contrase�a y usuario
		//si copntrase�a="1234" y usuario =admin=>"ok"
		//de lo contrario "fail"
		
		String usuario,contrase�a;
		usuario="jose";
		contrase�a="12345";
		//primera forma
		if(contrase�a=="1234"&&usuario=="admin") {
			System.out.println("ok");
		}else {
			System.err.println("fail");
		}
		if(usuario=="admin") {
			if(contrase�a=="1234") {System.out.println("ok");
				
			}else {
				System.err.println("fail");
			}
		}else {
			System.err.println("fail");
		}
		
		}
		
		
		
		

	}


