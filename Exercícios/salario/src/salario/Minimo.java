package salario;
import java.util.Scanner;
public class Minimo {
 /* Crie uma constante chamada sal�rio m�nimo e inicialize o valor dela com 937,00
  * em seguida pergunte ao usu�rio qual o seu sal�rio e armazene o valor digitado na vari�vel
  *  sal�rio.
  *   Apresente ao usu�rio a diferen�a entre o sal�rio dele e o sal�rio minimo*/
	public static void main(String[] args) {
		final double SALARIOMINIMO = 937.00;
		 Scanner in = new Scanner(System.in);
		 float salario = 0f;
		 
		 System.out.println("Digite o seu Sal�rio atual ! ");
		 salario = in.nextFloat();
		 //-------------------------------------------------------------------
		 System.out.println("O valor do sal�rio m�nimo � "+SALARIOMINIMO+"\n"+
		 " O valor do seu sal�rio � "+salario+".\n A diferen�a entre "
		 +salario+" e "+SALARIOMINIMO+" � "+ (salario - SALARIOMINIMO));
		 
		 in.close();
		 // para zerar o buff de entrada use o in.nextLine(); antes de ler outro tipo de dados
		 
		
 
	}

}
