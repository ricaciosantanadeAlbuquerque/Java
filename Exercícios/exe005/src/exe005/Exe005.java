
package exe005;
import java.util.Scanner;
/*Faça um programa para receber 5 valores e depois receba dois valores e faça 
* um incremento de dois em dois ou um decremento de dois em dois */
public class Exe005 {
 
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
         int numa,numb;
         numa= 0; numb = 0; 
         for(int valor =1;valor<=5;valor++){
             System.out.println(" na posição "+valor+" digite dois valores um para A e outro para B");
             numa = ler.nextInt();
             numb = ler.nextInt();
             if(numa<numb){
                 for(int cont = numa; cont<=numb;cont++){
                     System.out.println();
                     if(cont%2==0){
                         System.out.println(cont+"--");
                     }
                 }
             }else if(numa>numb){
                 for(int cont = numa; cont>=numb;cont--){
                     System.out.println("");
                     if(cont%2==0){
                         System.out.println(cont+"--");
                     }
                 }
             }
         }
    }
    
}
