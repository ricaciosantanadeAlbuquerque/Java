package qual_e_seu_nome;
import java.util.Scanner;
public class Nomeapp {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Por favor digite seu nome !!");
		  System.out.println(" Ol� "+entrada.nextLine()+" � um prazer conhece-l�! ");
		  /*
		   * N�O � NECESS�RIO NESTE CASO CRIAR UMA VARI�VEL STRING PARA ARMAZENAR O DADO DE ENTRADA
		   * DADO PELO USU�RIO. J� QUE � S� PARA MOSTRAR O VALOR !! ENT�O NESTE CASO, PODEMOS
		   * MOSTRAR A VARI�VEL OBJETO ENTRADA + O METODO QUE ELA EVOCA, POIS ELES CAPTURAM OS DADOS
		   * DIGITADOS, PORTANTO ASSIM PODEM SER MOSTRADOS TAMB�M.
		   * SEM FALAR QUE ESTAMOS ECONOMIZANDO ESPA�O NA MEM�RIA. */
		  entrada.close();
	}

}
