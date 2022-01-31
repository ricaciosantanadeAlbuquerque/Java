/*
 * 10 – Faça um programa que repita as instruções abaixo (utilizando o do...while como estrutura mais externa e um 
for interno):
1. Ler o sexo e a altura de 10 pessoas.
2. Contar o número de homens e mulheres.
3. O programa deverá executar 10 vezes.
4. Após a execução do laço, o programa deverá escrever a altura da pessoa mais 
alta e a quantidade de homens 
e mulheres.
 */
package ex10homem_mulher;

import  java.util.Scanner;
public class Ex10homem_mulher {

  
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String sexo = "";
       double altura=0,altura1=0;
       int cont =0,cont1=0;
       for(int i =0; i<10;i++){
           System.out.println("Digite seu sexo por favor ");
           sexo  = in.next();
           System.out.println("Digite sua altura por favor ");
           altura = in.nextDouble();
           if(sexo.equalsIgnoreCase("masculino")){
               cont++;
           }else if(sexo.equalsIgnoreCase("feminino")){
               cont1++;
           }
           if(altura>altura1){
               altura1 = altura;
           }
       }
        System.out.println("A quantidade de homens  é "+cont);
        System.out.println("A quantidade de mulheres é "+cont1);
        System.out.println("A Altura da pessoa mais alta é "+altura1);
    }
    
}
