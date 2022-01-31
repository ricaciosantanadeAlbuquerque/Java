package vota_brasil_ja;

import java.time.LocalDate;
import java.util.Scanner;

public class Vota {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	LocalDate d = LocalDate.now();
		System.out.println("Digite sua data de nascimento !!");
		int data = in.nextInt();
		int anoAtual = d.getYear();
		int idade =  anoAtual- data;
		if(idade >=18 && idade<=65) {
			System.out.println("Voto Obrigatório !!"+idade);
		}else if((idade>=16) && (idade<18)||(idade>65)){
			System.out.println("Voto opcional !!"+idade);
		}else {
			System.out.println("Você não tem idade para votar !!"+ idade);
			
		}
		 in.close();
	}

}
