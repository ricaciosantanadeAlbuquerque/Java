
package exe008.entrada.de.dados;
import java.util.*;
public class Exe008EntradaDeDados {

    public static void main(String[] args) {
      
        Scanner rick = new Scanner(System.in);
      System.out.println(" CALCULANDON  A MÉDIA ARITIMÉTICA! ");
        System.out.println();
      System.out.println("Digite a primeira nota !");
      float nota1 = rick.nextFloat(); 
      System.out.println("Digite a segunda  nota!");
        float nota2 = rick.nextFloat();
        System.out.println("Digite a terceira nota!");
         float nota3 = rick.nextFloat();
         
            float media = (nota1+nota2+nota3)/3;
            System.out.println("O valor da sua média anual foi de "+media);
    }
    
}
