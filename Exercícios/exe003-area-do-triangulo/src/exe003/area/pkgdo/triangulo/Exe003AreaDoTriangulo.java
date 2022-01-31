
package exe003.area.pkgdo.triangulo;
import java.util.Scanner;
public class Exe003AreaDoTriangulo {
  /*Calculando a área de um triângulo retângulo*/  
    public static void main(String[] args) {
    
           Scanner in =  new Scanner( System.in);
         System.out.println("CALCULANDO A ÁREA DE UM TRIÂNGULO RETÂNGULO !");
         System.out.println();
      System.out.println("Digite  um valor ! ");
       int A = in.nextInt();
       System.out.println("Digite o segundo valor !");
        int B = in.nextInt();
        System.out.println("Diugite o terceiro valor!");
         int C = in.nextInt();
          if(((A>B)&&(A>C))||((B>A)&&(B>C)||(C>A)&&(C>B))){
              
  // para ser conciderado um triângulo retangulo um dos lados deve ser maior que os outros dois
  
        System.out.println("É um triângula retângulo"); 
              System.out.println();
              System.out.println("Digite a altura!");
              float altura = in.nextFloat();
              System.out.println("Digite a base !");
                float base = in.nextFloat();
                    if(altura < base){
                    float resultado = (base*altura)/2;
                    System.out.println("A área do triângulo é "+resultado);
          }else{
            System.out.println(" erro a base não pode ser menor do que a altura! ");
            }
          
        }else{
              System.out.println(" Não é um triângulo retângulo");
          }
    
    }
    
}
