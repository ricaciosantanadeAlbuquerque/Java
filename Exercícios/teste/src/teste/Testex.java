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
		    * ESTE PROGRAMA N�O VAI COMPILAR !!  PORQUE  b  S� � VIS�VEL DENTRO DO ESCOPO IF(){
		    * }
		    *  E 2, H� REDUNDANCIA DE VARI�VEL, UM ERRO GRAVE! N�O � POSS�VEL UTILIZAR O MESMO 
		    *  IDENTIFICADOR  DENTRO DESTE M�TDODO PORR�MMMMMM
		    *  SERIA POSS�VEL FAZ�-LO DENTRO DE OUTRO M�TODO PERTENCENTE A EST� CLASSE*/
	}
 public static void possivel() {
	 int a = 100;
 }
}
f4