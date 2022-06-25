package objeto_periodo;

import java.time.LocalDate;
import java.time.Period;

public class aula_12 {

	public static void main(String[] args) {
		/*Settando duas datas*/
	LocalDate dataAntiga = LocalDate.of(2002, 10, 25);
	LocalDate dataNova = LocalDate.of(2022, 3, 20);
	
	
	System.out.println("A data antiga eh maior que a nova? " + dataAntiga.isAfter(dataNova));
	System.out.println("A data antiga eh menor que a nova? " + dataAntiga.isBefore(dataNova));	
	System.out.println("A data antiga eh igual a data nova? " + dataAntiga.isEqual(dataNova));
	
	
	Period periodo =  Period.between(dataAntiga, dataNova);
	
	
	System.out.println("Periodo eh " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + 
	periodo.getDays() + " dias");
	
	
	}

}
