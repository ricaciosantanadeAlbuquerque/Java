/*
 *  Faça um programa que sorteie 6 números entre 1 e 60.
 */
package sorteio;

import java.util.Random;
public class Sorteio {

    
    public static void main(String[] args) {
      Random  a = new Random();
      int valor = 0;
      for(int i=0; i<6;i++){
          valor = a.nextInt(60)+1;
          System.out.println(valor+"Valor gerado "+valor);
      }
      
    }
    
}
