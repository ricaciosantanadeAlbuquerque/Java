package dias_da_semana;
import java.util.Scanner;
public class Semana {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		  int dia = 0;
		  System.out.println("Digite um numero de [1] h� [7]"
		  		+ " para escolher um dia da semana");
		         dia = in.nextInt();
		  switch(dia) {
		  case 1:
			  System.out.println("Domingo");
			  break;
		  case 2:
			  System.out.println("Segunda");
			  break;
		  case 3:
			  System.out.println("Ter�a");
			  break;
		  case 4:
			  System.out.println("Quarta");
			  break;
		  case 5:
		      System.out.println("Quinta");
			  break;
		  case 6:
			  System.out.println("Sexta");
			  break;
		  case 7:
			  System.out.println("S�bado");
			  break;
		 default:
			 System.out.println("O valor escolhido est� fora da faixa !!");
		  }
		  in.close();
	}
		
}
