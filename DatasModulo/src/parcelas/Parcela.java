package parcelas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;  

public class Parcela {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		Date dateInicial = new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2009");//data inicial

		calendar.setTime(dateInicial);

		for (int parcela = 1; parcela <= 24; parcela++) {

			calendar.add(Calendar.MONTH, 1);
			System.out.println("Parcela de numero " + parcela + " vencimento eh em "
					+ new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		}

	}

}
