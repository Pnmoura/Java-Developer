package Aula59;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; //import de todas as classes Math

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		System.out.println(Math.pow(a, b)); //Math.pow - Elevação de números
		
		System.out.println(Math.sqrt(c)); //Math.sqrt - Raiz quadrada
		
		System.out.println(pow(a, b)); //DECLARAÇÃO NO INICIO DO PROGRAMA import static java.lang.Math.pow;
		
		System.out.println(sqrt(c)); // DECLARAÇÃO NO INICIO DO PROGRAMA import static java.lang.Math.sqrt;
		
		
	}

}
