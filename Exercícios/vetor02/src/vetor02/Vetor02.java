/*
 *2 - Faça um programa que receba do usuário um vetor com 10 posições. 
Em seguida deverá ser exibido o maior 
e o menor elemento do vetor.

 */
package vetor02;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Vetor02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int[] numeros = new int[10];
       int maior = 0;
        int num1 =0;
       int menor =1000000000;
       for( int i = 0;i<10;i++){
           System.out.println("Digite um número ! ");
            num1 = entrada.nextInt(); // o valor e zerado 
              
           numeros[i] = num1;
           if(numeros[i]>maior){
               maior = numeros[i];
           }
           if(numeros[i]<menor)
               menor = numeros[i];
       }
     
        System.out.println("O maior valor do vetor numeros é "+ maior);
        System.out.println(" O menor valor do vetor numeros é "+ menor);
      entrada.close();
    }
    
}
