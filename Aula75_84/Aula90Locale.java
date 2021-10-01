package Aula75_84;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		
		//dd/MM/yyyy - Brasil
		//MM/dd/yyyy - EUA
		
		//1.000,02 - Brasil
		//1,000.02 - EUA
		
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName()); //Nome da lingua falada pelo país
			System.out.println("Código da língua: " + loc.getLanguage()); //Código da lingua
			System.out.println("Língua: " + loc.getDisplayLanguage()); //Vai informar a língua
			System.out.println("Língua: " + loc.getDisplayCountry()); // Nome di Pais
			
			System.out.println("*********************************");
		}
		
		Locale br = new Locale("pt", "Brazil");
		
		System.out.println(br);
		
		Locale.setDefault(br);
		
		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d)); //Formato BR
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d)); //Formato EUA
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf3.format(5000000000d));
		
	}

}
