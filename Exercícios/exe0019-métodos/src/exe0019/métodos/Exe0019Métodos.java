
package exe0019.métodos;
import java.util.Scanner;
public class Exe0019Métodos {

    public static void main(String[] args) {
     
         Scanner in = new Scanner(System.in);
        System.out.println("Olá  por favor  para começar  digite um numero !");
       int x = in.nextInt();
        System.out.println(" Por favor digite outro número !");
        int y = in.nextInt();
          int respota = soma(x,y);
          System.out.println("A soma é "+ respota);
    
    
        
    }
    
    public static int soma (int a,int b ){
       int valor1=0;
      Scanner in = new Scanner(System.in);
        System.out.println("   digite 1 para somar ");
        System.out.println(" Digite 2 para  subitrair ");
        System.out.println("Digite 3 para multiplicar ");
        System.out.println("Digite 4 para Divisão ");
         int x = in.nextInt();
    switch(x){
        case 1:
               valor1 = a+b;
            break;
             
        case 2:
            valor1 = a-b;
            break;
        case 3:
            valor1 = a*b;
            break;
        case 4:
            valor1 = a/b;
            break;
        default:
             break;
             
    }
     return  valor1;
 }
    
}
