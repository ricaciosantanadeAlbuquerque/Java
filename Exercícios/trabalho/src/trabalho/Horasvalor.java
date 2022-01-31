package trabalho;

import java.util.Scanner;

public class Horasvalor {

	public static void main(String[] args) {
		String nome = " ";
		double qhoras, valorhoras;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome por favor !");
		nome = in.nextLine();
		System.out.println("Digite a quantidade de horas trabalhadas");
		qhoras = Double.parseDouble(in.next()); // DEVEMOS RECEBER OS DADOS COMO STRING
		System.out.println("Digite o valor das horas trabalhadas !");
		valorhoras = Double.parseDouble(in.next());
		System.out.println("\nFuncionário:"+nome+"\n");
		System.out.println("Valor da Hora: "+valorhoras+"| horas trabalhadas "+qhoras);
		
		System.out.println("Valor a receber: R$ "+(valorhoras * qhoras));
		in.close();

	}

}
