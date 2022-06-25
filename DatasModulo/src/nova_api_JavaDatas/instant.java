package nova_api_JavaDatas;

import java.time.Duration;
import java.time.Instant;

public class instant {

	public static void main(String[] args) {
		
		Instant instant = Instant.now();
				
		Instant finalinstant = Instant.now();
		
		Duration duracao = Duration.between(instant, finalinstant);
		
		System.out.println(duracao.toNanos());
		

	}

}
