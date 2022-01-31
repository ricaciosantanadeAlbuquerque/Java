package soma_de_A_b_c;

import java.util.Scanner;

public class Abc {
//7 - Faça um programa que leia três valores inteiros A, B e C e
	//diga se a soma de A + B é menor que C.
	public static void main(String[] args) {
	int num1,num2,num3;
	Scanner in = new Scanner(System.in);
	num1 = 0;
	num2 =0;
	num3 =0;
	System.out.println("Digite oprimeiro valor !!");
	num1 = Integer.parseInt(in.next());
	System.out.println("Digite o segundo valor !!");
	num2 = Integer.parseInt(in.next());
	System.out.println("Digite o terceiro valor !!");
	num3 = Integer.parseInt(in.next());
	
		if(num1 + num2 < num3) {
			System.out.println("Sim a soma de A + B é "+(num1 +num2 )+" O valor de C "
					+ " é "+num3);
		}else{
	    System.out.println("Não a soma de A + B  não é  menor que C ");
	    	
	    in.close();
	}

}
}
