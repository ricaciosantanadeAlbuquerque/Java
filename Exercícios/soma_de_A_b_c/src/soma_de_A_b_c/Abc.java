package soma_de_A_b_c;

import java.util.Scanner;

public class Abc {
//7 - Fa�a um programa que leia tr�s valores inteiros A, B e C e
	//diga se a soma de A + B � menor que C.
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
			System.out.println("Sim a soma de A + B � "+(num1 +num2 )+" O valor de C "
					+ " � "+num3);
		}else{
	    System.out.println("N�o a soma de A + B  n�o �  menor que C ");
	    	
	    in.close();
	}

}
}
