package media;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float media = 0;
		System.out.println("Digite sua média por favor !!");
		 media = in.nextFloat();
		 if(media>=7) {
			 System.out.println("Aprovado !!");
			 
		 }else if((media>=5) && (media <7)) {
			 System.out.println("Recuperação");
		 }else {
			 System.out.println("Reprovado !!");
		 }
      in.close();
	}
 // Atenção ao digitar um valor float não use Ponto use virgula
}
