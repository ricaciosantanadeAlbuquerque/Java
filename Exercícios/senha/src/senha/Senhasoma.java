package senha;

import java.util.Scanner;

public class Senhasoma {

	public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
             String senha= "";
             String valorVerdade = "";
             int num1=0; 
             int num2=0;
             System.out.println("Por favor cadastre uma senha !!");
              senha = in.nextLine();
              System.out.println("Por favor digite um valor ");
              num1 = Integer.parseInt(in.next());
              System.out.println("Digite outro valor !!");
              num2 = Integer.parseInt(in.next());
              
              int div = num1 / num2;
              
            System.out.println(" Digite sua senha por favor !!");
            in.nextLine();
             valorVerdade = in.nextLine();
             
             if(senha.equals(valorVerdade)) {
            	 System.out.println("O resultado da divisão é "+div);
             }else {
            	 System.out.println("Erro digite senha correta ! ");
            	 
             }
             in.close();
             System.exit(0);
	}

}
