package data_hora;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class Data_hora {
	
  /* Utilizando a classe LocalDate  para capturar a data e hora atual */
	
	public static void main(String[] args) {
		LocalDate n1 = LocalDate.now();
		System.out.println("A data atual é "+ n1);
		LocalDateTime n2 = LocalDateTime.now();
		System.out.println("Data e hora "+n2);
		LocalTime n3 = LocalTime.now();
		System.out.println("Horas!!"+n3);
		 

	}

}
