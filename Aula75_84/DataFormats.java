package Aula75_84;

import java.util.Calendar;

public class DataFormats {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //singleton
		
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		//Exibe somente o ano 
		System.out.println(ano);
		
		/*Formatações
		 * 
		 * Na formatação dos meses, se faz necessario a inclusão do argumento
		 * +1 após a declaração do mes, pois o Java por padrão inicia suas 
		 * contagens do 0
		 * */
		//Exibe ano e mes com formatação
		System.out.printf("Hoje é: %d/%d ", (mes+1), ano);
		
		//Exibe dia, ano e mes com formatação
		System.out.printf("Hoje é: 0%d/%d/%d ", dia, (mes+1), ano);
		
		//Exibe dia, ano, mes e hora com formatação
		System.out.printf("Hoje é: 0%d/%d/%d %d", dia, (mes+1), ano, hora);
		
		//Exibe dia, ano, mes com horas e minutos
		System.out.printf("Hoje é: 0%d/%d/%d %d:%d", dia, (mes+1), ano, hora, minutos);
		
		//Exibe dia, ano e mes com as hora, minutos e segundos
		System.out.printf("Hoje é: 0%d/%d/%d %d:%d:%d", dia, (mes+1), ano, hora, minutos, segundos);
				
		//Adiciona mais 1 dia do formato do dia atual
		hoje.add(Calendar.DAY_OF_MONTH, 1);
		//podendo tambem, retirar um dia do atual (ou mais dependendo do valor inserido)
		//hoje.add(Calendar.DAY_OF_MONTH, -1);

		System.out.println();
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		
	}

}
