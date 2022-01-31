/*
 * 10 – Faça um programa para sortear 5 números diferentes entre 1 e 10.
Armazene os valores sorteados num 
vetor de 5 posições e, em seguida, exiba-os.
Atenção: os valores armazenados não podem se repetir.
 */
package vetorexe010;

import java.util.Random;
public class Vetorexe010 {

    public static void main(String[] args) {
      Random sorte = new Random();
      int[]sena = new int[5];
      int[] sorte1 = new int[5];
      int num1;
     
       for(int j = 0; j<5;j++){
           num1 = sorte.nextInt(10)+1;
           sena[j]= num1;
           
          
       }

      
       for(int i = 0;i<4;i++){
          for(int j = i+1, y =4;j<5;j++,y--){
                if((sena[i] == sena[j])|| (sena[i] == sena[y] || (sena[i] == sena[2])||(sena[i] == sena[3]))){
                     num1 = sorte.nextInt(10)+1;
                     sena[i] = num1;
                    if((sena[0] == num1) || (sena[1] == num1 || (sena[3] == num1)||(sena[4] == num1))){
                     num1 = sorte.nextInt(10)+1;
                     sena[i] = num1-1;
                  
                } 
                }    
          }
       }
        for(int x = 0; x<5;x++){
            System.out.println(sena[x]);
        }
      
        
    }
    
}
