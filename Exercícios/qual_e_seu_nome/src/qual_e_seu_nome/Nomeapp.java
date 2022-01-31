package qual_e_seu_nome;
import java.util.Scanner;
public class Nomeapp {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Por favor digite seu nome !!");
		  System.out.println(" OlÁ "+entrada.nextLine()+" é um prazer conhece-ló! ");
		  /*
		   * NÃO É NECESSÁRIO NESTE CASO CRIAR UMA VARIÁVEL STRING PARA ARMAZENAR O DADO DE ENTRADA
		   * DADO PELO USUÁRIO. JÁ QUE É SÓ PARA MOSTRAR O VALOR !! ENTÃO NESTE CASO, PODEMOS
		   * MOSTRAR A VARIÁVEL OBJETO ENTRADA + O METODO QUE ELA EVOCA, POIS ELES CAPTURAM OS DADOS
		   * DIGITADOS, PORTANTO ASSIM PODEM SER MOSTRADOS TAMBÉM.
		   * SEM FALAR QUE ESTAMOS ECONOMIZANDO ESPAÇO NA MEMÓRIA. */
		  entrada.close();
	}

}
