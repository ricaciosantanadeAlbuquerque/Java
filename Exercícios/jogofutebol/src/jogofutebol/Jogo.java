package jogofutebol;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 final String NOMEDOTIME1 = " Nacional de patos! "; 
		final String NOMEDOTIME2 = "Treze";
		int num1 =0; int num2 = 0;
		
		 
		 System.out.println("Digite o numero de gols para o "+ NOMEDOTIME1);
		 num1 = in.nextInt();
		 System.out.println("Digite o número de gols para o "+ NOMEDOTIME2);
		 num2 = in.nextInt();
		 
		 if(num1 > num2) {
			 System.out.println("O vencedor é "+NOMEDOTIME1);
		 }else if(num2>num1){
			 System.out.println("O vencedor é "+NOMEDOTIME2);
		 }else {
			 System.out.println("EMPATE !!");
		 }
		in.close();
	}

}
