package media;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float media = 0;
		System.out.println("Digite sua m�dia por favor !!");
		 media = in.nextFloat();
		 if(media>=7) {
			 System.out.println("Aprovado !!");
			 
		 }else if((media>=5) && (media <7)) {
			 System.out.println("Recupera��o");
		 }else {
			 System.out.println("Reprovado !!");
		 }
      in.close();
	}
 // Aten��o ao digitar um valor float n�o use Ponto use virgula
}
