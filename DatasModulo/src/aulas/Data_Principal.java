package aulas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data_Principal {

	public static void main(String[] args) throws ParseException {
		
		
		/*Métodos do objeto do tipo Date*/
		Date date = new Date();
		
		System.out.println("data em milissegundos: " + date.getTime());	
		System.out.println("dia do mes: " + date.getDate());
		System.out.println("dia da semana:  " + date.getDay());
		System.out.println("hora do dia:  " + date.getHours());
		System.out.println("minuto do dia:  " + date.getMinutes());
		System.out.println("segundos do dia: " + date.getSeconds());
		System.out.println("Ano:  " + date.getYear());
		
		
		
		/*                   Simple date format                   */
		
		
		//formato para banco de dados: ano-mês-dia Hora:minuto.segundo
		SimpleDateFormat formatBD = new SimpleDateFormat("yyyy-MM-dd HH:mm.s");  
		//formato para usuário: dia/mês/ano Hora:minuto.segundo
		SimpleDateFormat formatUs = new SimpleDateFormat("dd/MM/yyyy HH:mm.s");
		
		/*Mostrando na tela cada um dos formatos:  */
		System.out.println("usuario: " + formatUs.format(date));
		System.out.println("banco de dados: " + formatBD.format(date));
		
		
		/*Vendo informações de uma data apartir de uma String usando o parse("string"); */
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Formato de uma data especifica: " + format.parse("02/06/2004"));
		
		
	}
	
	

}
