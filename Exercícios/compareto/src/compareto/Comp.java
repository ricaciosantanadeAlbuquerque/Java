package compareto;
import java.util.Scanner;
public class Comp {
	
/*3 - Utilizando o m�todo compareTo() encontre o menor nome 
 * (mais pr�ximo da letra A) num grupo de 5 nomes */
	
	public static void main(String[] args) {
	String nome1,nome2,nome3,nome4,nome5;
	Scanner in = new Scanner(System.in);
	System.out.println(" Digite o 1� nome ");
	nome1 = in.nextLine();
	System.out.println("Digite 2� nome");
	nome2 = in.nextLine();
	System.out.println("Digite 3� nome");
	nome3 = in.nextLine();
	System.out.println("Digite 4� nome");
	nome4 = in.nextLine();
	System.out.println("Digite 5� nome");
	nome5= in.nextLine();
	
	if(nome1.compareTo(nome2) < 0){
		System.out.println("O nome "+nome1+" � mais proximo de A");
	}else if(nome1.compareTo(nome3) < 0){
		System.out.println("O nome "+nome1+" � mais proximo de A");
	
	}else if(nome1.compareTo(nome4) < 0) {
		System.out.println("O nome "+nome1+" � mais proximo de A");
		
	}else if(nome1.compareTo(nome5) < 0 ) {
		System.out.println("O nome "+nome1+" � mais proximo de A");
		
	}else if(nome2.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome2+" � mais proximo de A");
		
	}else if(nome2.compareTo(nome3) < 0) {
		System.out.println("O nome "+nome2+" � mais proximo de A");
		
	}else if(nome2.compareTo(nome4)< 0) {
		System.out.println("O nome "+nome2+" � mais proximo de A");
		
	}else if(nome2.compareTo(nome5)< 0){
		System.out.println("O nome "+nome2+" � mais proximo de A");
		
	}else if(nome3.compareTo(nome2)< 0) {
		System.out.println("O nome "+nome3+" � mais proximo de A");
		
	}else if(nome3.compareTo(nome4) < 0) {
		System.out.println("O nome "+nome3+" � mais proximo de A");
		
	}else if(nome3.compareTo(nome5) < 0) {
		System.out.println("O nome "+nome3+" � mais proximo de A");
		
	}else if(nome3.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome3+" � mais proximo de A");
		
	}else if(nome4.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome4+" � mais proximo de A");
		
	}else if(nome4.compareTo(nome2) < 0) {
		System.out.println("O nome "+nome4+" � mais proximo de A");
		
	}else if(nome4.compareTo(nome3) < 0) {
		System.out.println("O nome "+nome4+" � mais proximo de A");
		
	}else if(nome4.compareTo(nome5) < 0) {
		System.out.println("O nome "+nome4+" � mais proximo de A");
		
	}else if(nome5.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome5+" � mais proximo de A");
		
	}else if(nome5.compareTo(nome2) < 0) {
		System.out.println("O nome "+nome5+" � mais proximo de A");
		
	}else if(nome5.compareTo(nome3)< 0) {
		System.out.println("O nome "+nome5+" � mais proximo de A");
		
	}else if(nome5.compareTo(nome4)< 0) {
		System.out.println("O nome "+nome5+" � mais proximo de A");

  }
	in.close();
	} // ESTUDAR A TABELA ASC JAVA
}