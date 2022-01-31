/*
  - Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida. Neste caso, o programa deverá mostrar uma mensagem
 */
package exe09;

import java.util.Scanner;
public class Exe09 {

    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   double num1 = 0;
   double num2 = 0;
   double num3=  0;
   System.out.println("Digite [1] para  calcular a média aritmética");
   System.out.println("Digite [2] para calculaar a média Ponderada ");
   System.out.println("Digite [3] para sair ");
   int op = entrada.nextInt();
    switch(op){
        case 1:
            System.out.println("Digite a primeira nota");
            num1 = entrada.nextInt();
            System.out.println("Digite a segunda nota ");
            num2 = entrada.nextInt();
            double media = (num1 + num2) / 2;
            System.out.println("O valor da média é "+media);
            break;
        case 2:
            System.out.println("Digite a primeira nota ");
                        num1 = entrada.nextInt();
            System.out.println("Digite o peso da nota ");
            int peso = entrada.nextInt();
            System.out.println("Digite a segunda nota "); 
                        num2 = entrada.nextInt();
            System.out.println("Digite o peso da nota ");
            int peso1 = entrada.nextInt();
            
            System.out.println("Digite a terceira nota ");
            num3 = entrada.nextInt();
            System.out.println("Digite o peso da nota ");
            int peso2 = entrada.nextInt();
            
            double mediaPonderada = ((num1*peso) + (num2*peso1) + (num3*peso2))/(peso + peso1 + peso2);
            System.out.printf("A média ponderada é %.2f ",mediaPonderada);
            break;
           case 3:
               System.exit(0);
               break;
    }
     entrada.close();  
    }
    
}
