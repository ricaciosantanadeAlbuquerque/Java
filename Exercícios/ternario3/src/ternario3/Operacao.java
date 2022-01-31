package ternario3;

import java.util.Scanner;

public class Operacao {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Mostrando o menor valor !");
		System.out.println("Digite o primeiro valor !!");
		a = Integer.parseInt(in.next());
		System.out.println("Digite o segundo  valor !!");
		b = Integer.parseInt(in.next());
		System.out.println("Digite o terceiro valor !! ");
		c = Integer.parseInt(in.next());
		int x = (a<b)?a:b;
		int menor = (x<c)?x:c;
		System.out.println(menor);
        in.close();
	}

}
