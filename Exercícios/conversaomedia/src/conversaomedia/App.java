package conversaomedia;

import java.util.Scanner;
/* Convertendo dados do tipo String para float */

public class App {

	public static void main(String[] args) {
		String num1=" ",num2=" ",num3=" ";
		float n1 = 0.0f,n2 = 0.0f,n3=0.0f;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a sua primeira nota !!");
		 num1 = in.next();
		 System.out.println("Digite a sua segunda nota !!");
		 num2 = in.next();
		 System.out.println("Digite a sua terceira nota !!");
		 num3 = in.next();
		 n1 = Float.parseFloat(num1);
		 n2 = Float.parseFloat(num2);
		 n3 = Float.parseFloat(num3);
		 float media = (n1+n2+n3)/3;
		 System.out.println("O valor da média do aluno é "+media);
		 segundaopcao(); // chamada ao método
		in.close();
		
     /*  OBSERVAÇÃO :SE A ENTRADA FOSSE NUMÉRICA A ENTRADA SERIA 7,7 
      *  MAS  COMO ESTAMOS DANDO ENTRADA DO TIPO STRING ESSE 7,7 DA ERROOOO
      * ENTÃO DEVEMOS USAR O PONTO 7.7*/
		
	}
	public static void segundaopcao() {
		float num1= 0,num2=0,num3=0;
		float n1 = 0.0f,n2 = 0.0f,n3=0.0f;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a sua primeira nota !!");
		 num1 = in.nextFloat();
		 System.out.println("Digite a sua segunda nota !!");
		 num2 = in.nextFloat();
		 System.out.println("Digite a sua terceira nota !!");
		 num3 = in.nextFloat();
		 n1 = (num1);
		 n2 = (num2);
		 n3 = (num3);
		 float media = (n1+n2+n3)/3;
		 System.out.println("O valor da média do aluno é "+media);
		
		in.close(); 
	}
}
