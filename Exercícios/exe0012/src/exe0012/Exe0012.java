

package exe0012;
import java.util.Scanner;
public class Exe0012 {
/*Faça um programa que mostre  A soma de todos os números digitados
 * A quantidade dos números Digitados 
 * A média dos numeros digitados ! 
 * O maior número !
 * O menor número ! 
 * A média dos numeros pares 
 * a perecentagem dos números impares entre todos os digitados
 *     */
   
    public static void main(String[] args) {
        int impar, valorF;
       impar=0;valorF=0;
         Scanner in = new Scanner(System.in);
         double mediapares,media=0;
         double percento =0; mediapares = 0;
          int x = 1;
          int soma,contador,num1,maior,menor,soma1,cont1,contInpar;
          maior =0; menor = 1000000000; soma1=0;cont1=0; contInpar=0;
          soma =0; contador = 0; num1 = 0;
          while(x!=0){
              System.out.println("Digite um valor por favor !");
              x = in.nextInt();
              soma+=x;
              valorF = contador++;
              media = (int)soma/contador; // média de todos os numeros digitados
              if(x>maior){ // maior valor
                  maior = x;
              }
              if(x<menor && x!=0){ // menor valor
                  menor = x;
              }
              if(x%2==0){ // capturando os valores pares
                  soma1+=x;
                  cont1++;
                   
              }else{
                 impar = contInpar++;
                  System.out.println(contInpar);
              }
              
          }
          System.out.println("cont"+valorF);
          System.out.println("Impar"+impar);
          mediapares = soma1/cont1; // média dos pares
            System.out.println ("V :");
        System.out.println("A soma de todos os números digitados "+soma);
        System.out.println();
        System.out.println("A quantidade dos números Digitados "+contador);
        System.out.println();
        System.out.println("A média dos numeros digitados ! "+ media);
        System.out.println();
        System.out.println("O maior número ! "+maior);
        System.out.println();
        System.out.println("O menor número ! "+menor);
        System.out.println("A média dos numeros pares "+mediapares);
        System.out.println();
        System.out.println("a perecentagem dos números impares entre todos os\n"+
                "digitados "+valorF*impar/100);
        in.close();
    }
    
}

    
    

