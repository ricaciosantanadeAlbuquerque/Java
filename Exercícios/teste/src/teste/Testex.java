package teste;
import java.util.Scanner;
public class Testex {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		   int a =2;
		   if(a>0) {
			   int b = 3;
			   System.out.println(a+b);
		   }
		   System.out.println(a);
		   System.out.println(b);
		   int a = 4;
		   /*
		    * ESTE PROGRAMA NÃO VAI COMPILAR !!  PORQUE  b  SÓ É VISÍVEL DENTRO DO ESCOPO IF(){
		    * }
		    *  E 2, HÁ REDUNDANCIA DE VARIÁVEL, UM ERRO GRAVE! NÃO É POSSÍVEL UTILIZAR O MESMO 
		    *  IDENTIFICADOR  DENTRO DESTE MÉTDODO PORRÉMMMMMM
		    *  SERIA POSSÍVEL FAZÊ-LO DENTRO DE OUTRO MÉTODO PERTENCENTE A ESTÁ CLASSE*/
	}
 public static void possivel() {
	 int a = 100;
 }
}
f4