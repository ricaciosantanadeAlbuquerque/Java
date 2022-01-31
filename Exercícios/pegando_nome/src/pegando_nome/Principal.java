package pegando_nome;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String nome = "";
	System.out.println("Por favor digite seu nome !");
	 nome = in.nextLine();
	 System.out.println("Olá "+nome);
	 in.close();

	}

}
