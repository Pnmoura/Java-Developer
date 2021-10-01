package Aula75_84;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {

		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		//System.out.println(hoje);
		
		imprimirData(hoje);
		
		System.out.println(hoje.isLeapYear(2021)); 
		//Metodo que retorna caso o ano informado seja bissexto 
		
		GregorianCalendar hoje2 = new GregorianCalendar(2021, 0, 1);
		//Pedindo para passar o primeiro dia de 2021
		imprimirData(hoje2);
		
		GregorianCalendar hoje3 = new GregorianCalendar(2021, 0, 1, 14, 30);
		
		imprimirData(hoje3);
	}
	
	private static void imprimirData(Calendar hoje) {
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: 0%d/%d/%d %d:%d:%d", dia, (mes+1), ano, hora, minutos, segundos);
		
		System.out.println();
	}

}
