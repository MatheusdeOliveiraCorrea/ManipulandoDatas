package afterBefore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparacao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimento = dateFormat.parse("30/08/2022");
		Date dataAtual = dateFormat.parse("30/08/2022");


		//se a data de vencimento é posterior a data atual, se sim,
		//então ainda não venceu
		if (dataVencimento.after(dataAtual)) {  //métodos after() ou before()

			System.out.println("Nao vencido");

		} else {

			System.out.println("Vencido, passou da data de vencimento");

		}

	}

}
