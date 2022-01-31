package media_de_10_alunos;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 double num1,num2,num3,media;
		 String nome = " ";
		
		for(int cont = 1; cont <=10; cont++) {
			
			System.out.println();
			System.out.println("\n Por favor ! \n\"Digite o nome do aluno\"");
				
			 	nome = in.nextLine();
			System.out.println(" Digite sua primeira nota !! ");
				 num1 = in.nextDouble();
		    System.out.println("Digite sua segunda nota !!");
			   num2 = in.nextDouble();
			System.out.println("Digite a terceira nota !!");
			    num3 = in.nextDouble();
			    
			    media = (num1+num2+num3)/3;
			    
			    if(media >=7 ) {
			  System.out.printf("\n O aluno "+nome+" foi \"Aprovado\" com a média %.2f \n ",media);
			    
		}else if((media>=5)&&(media<7)) {
			System.out.printf("\n O aluno "+nome+"  está em \"Recuperação\" com a média %.2f \n",media);
		}else{
			System.out.printf("\n O aluno "+nome+" foi Reprovado !! e está coma média %.2f \n",media);
		}
		

		in.nextLine();
	}
			in.close();
}
}