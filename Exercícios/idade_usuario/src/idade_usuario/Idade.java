package idade_usuario;
import java.util.Calendar;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	 Scanner idade = new Scanner(System.in);
	 Calendar c1 = Calendar.getInstance();
	// System.out.println(c1.get(Calendar.YEAR));
	 int nascimento;
	 System.out.println("====Verificando sua idade====");
	 System.out.println("Digite a data de seu nascimento !");
	 nascimento = idade.nextInt();
	 int idadeAtual = c1.get(Calendar.YEAR) - nascimento;
	 System.out.println("Sua idade atual � "+idadeAtual+"\n\n");
	 idade();
	 idade.close();
	}
public static void idade() {
	
	Calendar c2 = Calendar.getInstance();// escrever isso a m�o 30 vezes
	Scanner in = new Scanner(System.in);
	 int idade, idadeAtual;
	 
	 System.out.println("Digite seu ano de nascimento !!");
	 idade = in.nextInt();
	 idadeAtual = (c2.get(Calendar.YEAR) - idade);
	 System.out.println("Sua idade atual � de " +idadeAtual);
	 
	 in.close();
	
}
}
