package mercadinho;
import java.util.Scanner;
public class Caixa {
/*Faça uma programa que recebe do usuário o preço do produto e  valor do mesmo
 * e retorna o troco */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double preco,valor,troco;
		System.out.println("Digite o preço do produto !!");
		preco = Double.parseDouble(in.next());
		System.out.println("Digite o valor pago !");
		valor = Double.parseDouble(in.next());
		
		troco = valor - preco;
		System.out.printf("O valor de troco é %.2f ",troco);
		in.close();

		
		
		
		
	}

}
