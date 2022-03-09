
package busca.em.arrays02;

/* faça um programa que gere mil números aleatórios inteiros entre 1 e 1000
 * e armazeneosem um array de 50 linhas e 20 colunas  A seguir, peça para o usuário
 * peça para o ususário  digitar um número para ser pesquisado no array.
 * informe ao usuário se o número existe ou não no array.
*/
import java.util.*;
public class BuscaEmArrays02 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ale = new Random();
      int[][] array = new int[50][20];
      
      for(int i = 0; i <50;i++){
         for(int j = 0;j <20;j++ ){
             array[i][j] = ale.nextInt(1000)+1; // valor entre 1 e 1000;
             System.out.print(" "+array[i][j]+" ");
         }
          System.out.println();
      }
      //pesquisa
      int cont = 0;
      int valor = 0, valorArray = 0;
     System.out.println(" Digite um valor !");
              valor = in.nextInt();
        for (int[] resultado : array) {// foreach
            /*Para cada elemento da minha matriz "array' jogue os valores  para dentro do meu vetor resultado
             * ps! resultado terá o tamanho necessário para conter todos os valores automaticamente */
            for (int j = 0; j < resultado.length; j++) { // enquanto j for menor do que o comprimento do vetor faça
                valorArray = resultado[j];
                if(valorArray == valor){ // comparando cada  valor do vetor com o valor digitado
                    cont++;
                    if(cont == 1){ // se cont for igual a 1 é porque dentro da minha matriz array há pelomenos um valor igual ao digitado
                        System.out.println("Sim é igual,  valor array: "+valorArray+" valor digitado "+valor);
                        break;
                    }
                    
                }
            }
        }
    in.close();
    System.exit(0);
}
}


