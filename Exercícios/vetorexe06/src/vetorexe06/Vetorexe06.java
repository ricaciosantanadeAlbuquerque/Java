/*
 - Faça um programa que leia um vetor de 10 posições e verifique se existem
valores iguais e os escreva na tela.
 */
package vetorexe06;

public class Vetorexe06 {

    public static void main(String[] args) {
      int[]num1 ={10,8,4,4,5,6,7,8,9,10};
    
    for(int i = 0; i <10;i++){
       for(int j = i+1;j<10;j++){
           if(num1[i] == num1[j]){
               System.out.println("Os valores "+num1[i]+" é igual a "+num1[j]);
           }
       }
    }
    }
}
