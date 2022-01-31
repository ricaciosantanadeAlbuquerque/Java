package idade_aula03;
import java.time.LocalDate;
import java.util.Scanner;
public class Anosidade {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 LocalDate d3 = LocalDate.now();
	 
	 int idade,ano,anoatual; // declaração de varíaveis
	 idade = ano = 0; // inicialização
	 System.out.println("Digite o ano do seu nascimento ");
	 
	 ano = in.nextInt();
	 
	 anoatual = d3.getYear();
	 idade = anoatual - ano;
	 System.out.println("Você possui "+idade+" anos");
	 	in.close();
	 	System.exit(0);
	}

}
