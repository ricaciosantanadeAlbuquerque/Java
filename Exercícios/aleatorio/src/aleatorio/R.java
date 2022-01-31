package aleatorio;
import java.util.Random;
public class R {
/* Gerando valores aleatórios entre 1 e 60  */
	public static void main(String[] args) {
		Random ale = new Random();
		int valor =0;
		int cont = 1;
		do{
			valor = ale.nextInt((60)+1); // 0 a 59 para que seja de 1 a 60 soma mais 1
			System.out.println("Os respectivos valores gerados! são "+cont+" === "+valor);
			cont++;
		}while(cont<=6);
	}

}
