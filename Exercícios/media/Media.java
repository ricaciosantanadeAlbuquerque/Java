/*
 *  Faça um programa que calcula a média de 3 notas de 10 alunos.
    ps! RECEBA AS NOTAS COMO STRING E CONVERTA PARA FLOAT
 */
package media;

import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
       Scanner b1 = new Scanner(System.in);
       float num1 = 0.f,num2 = 0.f,num3 = 0.f;
       String nome = "";
       for(int i =0; i<10;i++){
        System.out.println("Digite seu nome");
        nome = b1.nextLine();
        System.out.println("Por favor digite a primeira nota !");
         num1 = Float.parseFloat(b1.next());
        System.out.println("Por favor, digite a segunda  nota !");
        num2 = Float.parseFloat(b1.next());
        System.out.println("Digite a terceira nota ! ");
        num3 = Float.parseFloat(b1.next());
        float media = (num1+num2+num3)/3;
        
       System.out.printf("O aluno %s tirou a média  %.1f  \n",nome,media);
       b1.nextLine();
       }
    }
    
}
