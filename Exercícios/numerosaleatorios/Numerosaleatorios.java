
package numerosaleatorios;

import java.util.Random;
public class Numerosaleatorios {

    public static void main(String[] args) {
      Random ale = new Random();
      float num1;
      for(int i =0;i<10;i++){
          num1 = ale.nextFloat()*1+1;
          System.out.printf("%.0f\n",num1);
      }
    }
    
}
