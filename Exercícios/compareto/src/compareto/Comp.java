package compareto;
import java.util.Scanner;
public class Comp {
	
/*3 - Utilizando o método compareTo() encontre o menor nome 
 * (mais próximo da letra A) num grupo de 5 nomes */
	
	public static void main(String[] args) {
	String nome1,nome2,nome3,nome4,nome5;
	Scanner in = new Scanner(System.in);
	System.out.println(" Digite o 1º nome ");
	nome1 = in.nextLine();
	System.out.println("Digite 2º nome");
	nome2 = in.nextLine();
	System.out.println("Digite 3º nome");
	nome3 = in.nextLine();
	System.out.println("Digite 4º nome");
	nome4 = in.nextLine();
	System.out.println("Digite 5º nome");
	nome5= in.nextLine();
	
	if(nome1.compareTo(nome2) < 0){
		System.out.println("O nome "+nome1+" é mais proximo de A");
	}else if(nome1.compareTo(nome3) < 0){
		System.out.println("O nome "+nome1+" é mais proximo de A");
	
	}else if(nome1.compareTo(nome4) < 0) {
		System.out.println("O nome "+nome1+" é mais proximo de A");
		
	}else if(nome1.compareTo(nome5) < 0 ) {
		System.out.println("O nome "+nome1+" é mais proximo de A");
		
	}else if(nome2.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome2+" é mais proximo de A");
		
	}else if(nome2.compareTo(nome3) < 0) {
		System.out.println("O nome "+nome2+" é mais proximo de A");
		
	}else if(nome2.compareTo(nome4)< 0) {
		System.out.println("O nome "+nome2+" é mais proximo de A");
		
	}else if(nome2.compareTo(nome5)< 0){
		System.out.println("O nome "+nome2+" é mais proximo de A");
		
	}else if(nome3.compareTo(nome2)< 0) {
		System.out.println("O nome "+nome3+" é mais proximo de A");
		
	}else if(nome3.compareTo(nome4) < 0) {
		System.out.println("O nome "+nome3+" é mais proximo de A");
		
	}else if(nome3.compareTo(nome5) < 0) {
		System.out.println("O nome "+nome3+" é mais proximo de A");
		
	}else if(nome3.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome3+" é mais proximo de A");
		
	}else if(nome4.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome4+" é mais proximo de A");
		
	}else if(nome4.compareTo(nome2) < 0) {
		System.out.println("O nome "+nome4+" é mais proximo de A");
		
	}else if(nome4.compareTo(nome3) < 0) {
		System.out.println("O nome "+nome4+" é mais proximo de A");
		
	}else if(nome4.compareTo(nome5) < 0) {
		System.out.println("O nome "+nome4+" é mais proximo de A");
		
	}else if(nome5.compareTo(nome1) < 0) {
		System.out.println("O nome "+nome5+" é mais proximo de A");
		
	}else if(nome5.compareTo(nome2) < 0) {
		System.out.println("O nome "+nome5+" é mais proximo de A");
		
	}else if(nome5.compareTo(nome3)< 0) {
		System.out.println("O nome "+nome5+" é mais proximo de A");
		
	}else if(nome5.compareTo(nome4)< 0) {
		System.out.println("O nome "+nome5+" é mais proximo de A");

  }
	in.close();
	} // ESTUDAR A TABELA ASC JAVA
}