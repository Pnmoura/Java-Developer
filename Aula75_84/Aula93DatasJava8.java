package Aula75_84;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Aula93DatasJava8 {

	private static final ZoneId SetZoneId = null;

	public static void main(String[] args) {

		// data dd MM yyyy
		// apresenta o dia mes e ano atual da maquina
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		System.out.println(LocalDate.of(2019, 2, 1)); //Exibe o dia informado 
		System.out.println(LocalDate.parse("2019-02-01")); //Exibe o dia informado 

		System.out.println(agora.plusDays(30)); //Adiciona 30 dias

		//Exibindo ano-mes-dia
		System.out.println(agora.minus(1, ChronoUnit.MONTHS)); 

		System.out.println(agora.getDayOfWeek()); // Informa o dia da semana
		System.out.println(agora.getDayOfMonth()); // Informa o dia do mes atual
		System.out.println(agora.getDayOfYear()); //Informa o dia do ano atual

		//Retorna se o ano informado é Bissexto 
		System.out.println(LocalDate.parse("2019-02-01").isLeapYear());

		//Exibe horas:minutos:segundos
		LocalTime hAgora = LocalTime.now(); 
		System.out.println(hAgora);

		System.out.println(LocalTime.of(20, 18)); //Exibe horas:minutos
		System.out.println(LocalTime.parse("20:18")); //Exibe horas:minutos

		System.out.println(hAgora.plusMinutes(60)); //Exibe horas:minutos:segundos
		System.out.println(hAgora.minus(40, ChronoUnit.HOURS)); //Exibe horas:minutos:segundos

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);

		Set <String> fusos = SetZoneId.getAvailableZoneIds();
		//		for(String f : fusos) {
		//			System.out.println(f);
		//		}

		ZoneId sp = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), sp);
		System.out.println(zdt);
		//ou
		System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-02:00[America/Sao_Paulo]"));

	}
}
