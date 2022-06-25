package nova_api_JavaDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Formatando {

	public static void main(String[] args) {		
		
		LocalDate date =  LocalDate.now();
		
		System.out.println("local date: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		LocalTime localtime = LocalTime.now(); 
		
		System.out.println("local time: " + localtime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime localdatetime = LocalDateTime.now(); 
		
		System.out.println("local date time: " + localdatetime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss")));

	}

}
