package salariominimo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 final float SALARIOMINIMO = 937.00F;
		 System.out.println("Digite o seu salário atual !");
		 float  salario = in.nextFloat();
		 System.out.println(" A diferença entre o  seu salário e"
		 		+ " o salário mínimo é "+(salario - SALARIOMINIMO)+" Reais$$$");
		 in.close();
	}

}
