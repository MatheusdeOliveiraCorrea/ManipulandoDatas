package calculo_dia_ano_mes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataJava_Principal {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		//seta calendario no formato correto
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("19-06-2022")); 
		
		calendar.add(Calendar.DAY_OF_MONTH, 16); //soma mais alguns dias
		calendar.add(Calendar.YEAR, 2); //soma mais alguns anos
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		System.out.println(calendar.getTime());
		
	}

}
