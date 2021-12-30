/*
 *  Faça um programa que leia três valores inteiros A, B e C e diga se a soma de A + B é menor que C.
 */
package abc;
import java.util.Scanner;
public class Abc {

    public static void main(String[] args) {
       Scanner a1 = new Scanner(System.in);
       int A =0, B =0,C=0;
        System.out.println("Digite uma valor para [A].");
        A = a1.nextInt();
        System.out.println("Digite um valor para [B]. ");
        B = a1.nextInt();
        System.out.println("Digite um valor para [C]");
        C = a1.nextInt();
        a1.close();
        int soma = A + B;
        
        if(soma < C){
            System.out.printf("A soma de %d mais %d é menor do que %d \n",A,B,C);
            System.out.println("O valor da soma é de "+soma);
    
        }else{
           System.out.printf("A soma de %d mais %d é maior do que %d \n",A,B,C);
            System.out.println("O valor da soma é de "+soma); 
    }
    
}
}
