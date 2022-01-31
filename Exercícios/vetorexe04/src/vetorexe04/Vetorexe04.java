/*
 * 3 - Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
Exiba os elementos do vetor 
e, em seguida mostre qual é o maior elemento e a posição que ele
se encontra dentro do vetor
 */
package vetorexe04;
import java.util.Scanner;
public class Vetorexe04 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int num1 = 0;
      int posicao =0;
      int maior =0;
      int[] vetor = new int[10]; 
      for(int i =0; i<10;i++){
          System.out.println("Digite um valor ");
          num1 = entrada.nextInt();
          vetor[i] = num1;
          if(vetor[i]> maior){
              maior = vetor[i];
              posicao = i; 
          }
      }
      int j = 0;
      for(; j<10;j++){
          System.out.println("Posição "+j+" == "+vetor[j]);
      }
      entrada.close();
        System.out.println("O maior valor do vetor é "+ maior+" e está na posição "+posicao);
    }
    
}
