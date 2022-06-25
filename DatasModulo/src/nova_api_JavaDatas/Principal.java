package nova_api_JavaDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		
		LocalDate date =  LocalDate.now();
		
		System.out.println("local date: " + date);
		
		
		LocalTime localtime = LocalTime.now(); 
		
		System.out.println("local time: " + localtime);
		
		LocalDateTime localdatetime = LocalDateTime.now(); 
		
		System.out.println("local date time: " + localdatetime);
		
	}

}
