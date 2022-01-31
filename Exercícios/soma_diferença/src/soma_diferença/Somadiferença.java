package soma_diferença;
import java.util.Scanner;
public class Somadiferença {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		// float num1 =0;
		  int num1 =0;
		 int soma =0;
		 //float soma =0;
		 //float sub = 0;
		 int sub =0;
		 int num2 = 0;
		// float num2 =0;
		 System.out.println("Digite um valor !! ");
		 num1 = entrada.nextInt();
		 System.out.println("Digite outro valor !!");
		 num2 = entrada.nextInt();
		 soma = (num1 + num2);
		 sub = num1 - num2;
		 System.out.println("A soma de "+num1+" e "+num2+" é "+soma);
		 System.out.println("A diferença de "+num1+" e "+num2+" é "+sub);
		 /*
		  *  não é possível guardar a soma de dois  valores float num1 e num2 para dentro
		  *  de uma variável soma do tipo primitivo int  seria necessário converte.
		  *  PORÉM O VALOR MOSTRADO SERÁ INTEIRO.
		  *  */
		 entrada.close();
	}

}
