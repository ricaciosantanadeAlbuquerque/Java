package calcular;
import java.util.Scanner;
public class Maquinaanalitica {
/* fa�a um programa que recebe dois valores do usu�rio e  calcule a divis�o multiplica��o
 *  soma e subtra��o, 
 *  e ao final do processo exiba as respostas.
 *  */
	public static void main(String[] args) {
		 double num1= 0,num2=0,soma=0,sub=0,div=0,mult=0;
		 
		 Scanner in = new Scanner(System.in);
		 System.out.println("Digite o primeiro n�mero !!");
		 num1 = in.nextDouble();
		 System.out.println("Digite o segundo n�mero !!  ");
		 num2 = in.nextDouble();
		  soma = num1 + num2;
		  sub = num1 - num2;
		  mult = num1 * num2;
		  div = num1 / num2 ;
		  System.out.println(" A soma de "+soma);
		  System.out.println("A subtra��o "+sub);
		  System.out.println("A multiplica��o "+mult);
		  System.out.println("A divis�o "+div);
		  in.close();
	}

}
