/*
  - Faça um programa que fique recebendo números inteiros
e contando quantos números foram iguais a 2. Caso 
o usuário digite o número zero, o programa deverá parar 
de receber valores e exibir quantos números foram 
iguais a 2;
 */
package contando_numeros_2;

import java.util.Scanner;
public class Contando_numeros_2 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int num1 =1;
       int contador=0;
       while(num1 !=0){
           System.out.println("Digite um número por favor. ");
           num1 = entrada.nextInt();
           if(num1 == 2){
               contador++;
           }
           
    }
        System.out.println("A Quantidade de números iguais a 2 é "+contador);
}
}