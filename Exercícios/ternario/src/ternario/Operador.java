package ternario;
import java.util.Scanner;
public class Operador {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		 int a = 0,b = 0;
		 System.out.println("Digite um número");
		 a = Integer.parseInt(in.next());
		 b = Integer.parseInt(in.next());
		  int maior = (a>b)?a:b;
		  System.out.println(maior);
		  in.close();
	}

}
