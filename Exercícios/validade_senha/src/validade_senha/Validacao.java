package validade_senha;

import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String senha = "123456";
		String entrada = " ";
		System.out.println("Por favordigite uma senha !!");
		entrada = in.nextLine();
		if(senha.equals(entrada)){
			System.out.println("Acesso liberado !! ");
		}else {
			System.out.println("Acesso negado !!");
		}
		in.close();
	}
}
