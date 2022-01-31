package salario;
import java.util.Scanner;
public class Minimo {
 /* Crie uma constante chamada salário mínimo e inicialize o valor dela com 937,00
  * em seguida pergunte ao usuário qual o seu salário e armazene o valor digitado na variável
  *  salário.
  *   Apresente ao usuário a diferença entre o salário dele e o salário minimo*/
	public static void main(String[] args) {
		final double SALARIOMINIMO = 937.00;
		 Scanner in = new Scanner(System.in);
		 float salario = 0f;
		 
		 System.out.println("Digite o seu Salário atual ! ");
		 salario = in.nextFloat();
		 //-------------------------------------------------------------------
		 System.out.println("O valor do salário mínimo é "+SALARIOMINIMO+"\n"+
		 " O valor do seu salário é "+salario+".\n A diferença entre "
		 +salario+" e "+SALARIOMINIMO+" é "+ (salario - SALARIOMINIMO));
		 
		 in.close();
		 // para zerar o buff de entrada use o in.nextLine(); antes de ler outro tipo de dados
		 
		
 
	}

}
