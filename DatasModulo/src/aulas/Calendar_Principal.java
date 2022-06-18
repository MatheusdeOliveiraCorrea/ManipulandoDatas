package aulas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_Principal {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("calendar em milissegundos: " + calendar.getTimeInMillis());	
		System.out.println("dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("dia da semana:  " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("hora do dia:  " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("minuto do dia:  " + calendar.get(Calendar.MINUTE) );
		System.out.println("segundos do dia: " + calendar.get(Calendar.SECOND));
		System.out.println("Ano:  " + calendar.get(Calendar.YEAR));
		
		
		
		/*            Simple Date Format                   */
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd - MM - yyyy"); 
		
		
		
		System.out.println("data formatada: " + dateFormat.format(calendar.getInstance().getTime()) );
		
		
		
		
		
	}

}
