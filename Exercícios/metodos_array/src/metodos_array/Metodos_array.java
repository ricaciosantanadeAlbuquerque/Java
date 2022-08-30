
package metodos_array;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Metodos_array {

 
    public static void main(String[] args) {
       
        double[] num1 = {1,12.5,22,33.3,12.6,55.50,66.70,100,14};
        String[] frase = {"Z","d","f","c","b","a"};
         
        double valor = buscarMaior(num1);
        System.out.println(valor);
        
        String [] correto = ordenaPalavras(frase);
        
        for(String p : correto){
        
            System.out.println(p);
        }
        
        
    }
    public static double buscarMaior(double[] numeros){
        double maior = numeros[0]; 
        
        for(int i = 1; i < numeros.length; i++){
        
            maior = Math.max(maior,numeros[i]); // irá comparar o valor da posição zero com  todas as demais posições 
            // e retornar o maior valor 
        }
       
        return maior;
    }
    public static String[] ordenaPalavras(String[] palavra){
        
        Arrays.sort(palavra);
        return palavra;
    
    }
    
    
}
