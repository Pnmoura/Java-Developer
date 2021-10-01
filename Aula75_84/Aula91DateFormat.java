package Aula75_84;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());
		
		//Locale.setDefault(new Locale("en", "US"));
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println("Primeiro format: getInstance ");
		System.out.println(hojeFormatado);
		System.out.println();
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println("Segundo format: getTimeInstance ");
		System.out.println(hojeFormatado);
		System.out.println();
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println("Terceiro format: getDateInstance");
		System.out.println(hoje);
		System.out.println();

		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println("Quarto format: getDateTimeInstance");
		System.out.println(hoje);
		System.out.println();
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println("5° format: getTimeInstance(DateFormat.SHORT)");
		System.out.println(hojeFormatado);
		System.out.println();
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println("6° format: getTimeInstance(DateFormat.MEDIUM)");
		System.out.println(hojeFormatado);
		System.out.println();
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println("7° format: getTimeInstance(DateFormat.LONG)");
		System.out.println(hojeFormatado);
		System.out.println();
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println("8° format: (DateFormat.SHORT, DateFormat.SHORT)");
		System.out.println(hojeFormatado);
		
		String data = "12-02-2017 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			
			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
