
package metodo_array;

import java.util.Arrays;

public class Array {
    
    public static double buscaMaior(double[]numeros){
     double maior = numeros[0];
     
     for(int i = 1; i < numeros.length;i++){
         maior = Math.max(maior, numeros[i]);
         // A posição 0 condita em maior será comparado com todas as demais posições de 1 até n;
     }
     return maior;
    }
    
    public static String[] ordenaPalavras(String[] palavras){
      Arrays.sort(palavras);
    return palavras;
    }
}
