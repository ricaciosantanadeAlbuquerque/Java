
package arrays.unidimensional;
import java.util.Random;
public class ArraysUnidimensional {

    public static void main(String[] args) {
      Random ale = new Random();
    
      int[] numeros = new int[10]; // array unidimensional indice varia de 0 a 9
      for(int j =0; j<numeros.length;j++ ){ // equanto j for menor do que o  comprimento do vetor, "j será incrementado em mais uma unidade"
          numeros[j] = ale.nextInt(100)+1; // será gerado valores entre 1 e 100
          System.out.println(numeros[j]);
      }
      System.exit(0);
    }
    
}
