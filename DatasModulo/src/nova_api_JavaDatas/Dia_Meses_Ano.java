package nova_api_JavaDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dia_Meses_Ano {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		
		System.out.println("Data atual " + localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		System.out.println("\nDia da semana: " + localDate.getDayOfWeek());
		System.out.println("Dia do mes: " + localDate.getDayOfMonth());
		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		
		System.out.println("\nMes: " + localDate.getMonthValue() + " - " + localDate.getMonth());
		
		System.out.println("Ano: " + localDate.getYear());
		
	}

}
