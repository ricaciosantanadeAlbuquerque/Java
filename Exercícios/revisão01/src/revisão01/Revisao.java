package revisão01;

import java.util.Scanner;
/*Receba duas notas de uma aluno e veja se ele está aprovado ou em recuperação ou reprovado*/
public class Revisao {

	public static void main(String[] args) {
		double num1,num2,media;
		media = 0;
		Scanner in = new Scanner(System.in);
		num1 =0; num2 =0;
		System.out.println("Digite sua primeira nota !");
		 num1 = Double.parseDouble(in.next());
		 System.out.println("Digite sua segunda nota !!");
		 num2 = Double.parseDouble(in.next());
		 media = (num1+num2)/2;
		 
		 if(media>=7) {
			 System.out.println("Você está aprovado !!"+media);
		 }else if((media>=5) && (media<7)) {
			 System.out.println("Você está em recuperção e vai para prova final "+media);
		 }else {
			 System.out.println("Você foi reprovado !!");
		 }
		 
		 
		 in.close();
	}
      
}
