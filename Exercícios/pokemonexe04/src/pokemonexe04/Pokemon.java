package pokemonexe04;
import java.util.Scanner;
public class Pokemon {
  // entrada e saida de dados
	public static void main(String[] args) {
		 String nome = " ";
		 Scanner in = new Scanner(System.in);
		 System.out.println("Qual é o seu nome ?");
		 nome =in.nextLine();
		 System.out.println("Boa noite "+nome+"\n "
		 		+ "Você já é um mestre pokemon ? ");
		 in.close();
	}

}
