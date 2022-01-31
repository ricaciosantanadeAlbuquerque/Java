package pokemon2;
import java.util.Scanner;
public class Jogo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = 0;
		String nome = " ";
		System.out.println("Digite seu nome !!");
		nome = in.nextLine();
		System.out.println("Digite um número !!");
		n1 =  in.nextInt();
		
		in.nextLine(); // limpando o buff de entrada
		System.out.println("Digite seu nome !!");
		nome = in.nextLine();
		System.out.println("O numero digitado foi "+n1+" E  o nome é "+nome);
/* PELO JEITO O PROBLEMA SÓ OCORRE SE EU LER PRIMEIRO UM DADO INTEIRO E DEPOIS UM CARACTERE
 *  SE FOR AO CONTRARIO ESSE PROBLEMA NÃO OCORRE !!*/
		in.close();
	}

}
