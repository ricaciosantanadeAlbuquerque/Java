package ternario1;
import java.util.Scanner;
public class Operacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o primeiro valor !!");
		a = Integer.parseInt(in.next());
		System.out.println("Digite o segundo valor !!");
		b = Integer.parseInt(in.next());
		System.out.println("O maior número é: "+(a>b?a:b));//É POSSÍVEL JÁ MOSTRA O RESULTADO DA OPERÇÃO.
		in.close();
	}

}
