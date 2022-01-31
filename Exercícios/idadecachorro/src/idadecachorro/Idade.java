package idadecachorro;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Digite a idade de seu cachorro !! ");
		int idade = in.nextInt();
		idade *=7;
		System.out.println("O seu cachorro tem "+idade+" anos");
		in.close();

	}

}
