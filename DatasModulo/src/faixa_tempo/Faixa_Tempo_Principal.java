package faixa_tempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Faixa_Tempo_Principal {

	public static void main(String[] args) {

		LocalDate start = LocalDate.of(2022, 01, 01);
		LocalDate end = LocalDate.now();

		long dias = ChronoUnit.DAYS.between(start, end);
		long meses = ChronoUnit.MONTHS.between(start, end);
		long horas = ChronoUnit.HOURS.between(start, end);
		
		System.out.println("dias: " + dias + " meses: " + meses + " horas: " + horas);
		
		/*
		 * long dias = ChronoUnit.DAYS.between( LocalDate.parse("2022-01-01"),
		 * LocalDate.now()); long meses =
		 * ChronoUnit.MONTHS.between(LocalDate.parse("2022-01-01"), LocalDate.now());
		 * //long horas = ChronoUnit.HOURS.between(LocalDate.parse("2022-01-01"),
		 * LocalDate.now());
		 * 
		 * System.out.println("Possui " + dias + " dias entre as datas ");
		 * System.out.println("Possui " + meses + " meses entre as datas ");
		 * //System.out.println("Possui " + horas + " horas entre as datas ");
		 * 
		 */
	}

}
