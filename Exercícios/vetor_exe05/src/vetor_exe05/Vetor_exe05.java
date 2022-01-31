/*
 *  - Crie um programa que lê 6 valores inteiros pares e, em seguida, mostre na tela os valores lidos na ordem 
inversa. Atenção: caso o usuário digite um valor ímpar, deve desconsiderá-lo e
fazer novamente a leitura até 
atingir a leitura dos valores inteiros pares.
 */
package vetor_exe05;
import java.util.Scanner;
public class Vetor_exe05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 0;
       int[] par = new int[6];
       for(int i =0;i<6;){
           System.out.println("Digite uma valor ");
           valor = input.nextInt();
           if(valor%2==0){
               par[i] = valor;
               i++;
           }else{
               System.out.println("ERRO! digite um novo valor");
           }
       }
        System.out.println("====================================================");
       for(int j =5 ;j>=0;j--){
           System.out.println(par[j]);
       }
     
}
}