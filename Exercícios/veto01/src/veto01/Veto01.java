/*
 * Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve 
executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5]
do vetor e 
mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */
package veto01;


public class Veto01 {

    public static void main(String[] args) {
       int[] A = new int[6];
       A[0] = 1;
       A[1] = 0;
       A[2] = 5;
       A[3] = -2;
       A[4] = -5;
       A[5] = 7;
   int soma = A[0]+ A[1] +A[5];  
   System.out.println("O valor é "+ soma);
   A[4] = 100;
        System.out.println("posição [0] "+A[0]);
        System.out.println("posição [1] "+A[1]);
        System.out.println("posição [2] "+A[2]);
        System.out.println("posição [3] "+A[3]);
        System.out.println("posição [4] "+A[4]);
        System.out.println("posição [5] "+A[5]);
          
         
        
    }
    
}
