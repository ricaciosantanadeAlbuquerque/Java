package salariominimo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 final float SALARIOMINIMO = 937.00F;
		 System.out.println("Digite o seu sal�rio atual !");
		 float  salario = in.nextFloat();
		 System.out.println(" A diferen�a entre o  seu sal�rio e"
		 		+ " o sal�rio m�nimo � "+(salario - SALARIOMINIMO)+" Reais$$$");
		 in.close();
	}

}
