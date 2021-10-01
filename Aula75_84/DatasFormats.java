package Aula75_84;

import java.util.Date;

public class DatasFormats {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 Jan de 1970 " +  hoje.getTime());
		
		System.out.println(hoje.getDate());
	}

}
