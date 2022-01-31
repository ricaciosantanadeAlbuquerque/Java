package peso_altura;

import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite seu peso por favor !");
		  float peso = entrada.nextFloat();
		  System.out.println("Digite A sua Altura !!");
		  float altura = entrada.nextFloat();
		  entrada.close();
		  
		  System.out.println("Peso: "+peso+" | Altura:  "+altura);

	}

}
