package temperatura;

import java.util.Scanner;

public class Graus {

	public static void main(String[] args) {
		int gfari=0,gcel=0;
		 Scanner in= new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Fahrenheit");
		gfari =Integer.parseInt(in.next());
		gcel = (gfari-32)/9*5;
		System.out.println("A temperatura em Gruas Fahrenheit: "+gfari);
		System.out.println("Atemperatura em Celsius: "+gcel );
		in.close();

	}

}
