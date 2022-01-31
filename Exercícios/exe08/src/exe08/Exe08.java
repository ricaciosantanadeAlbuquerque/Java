/*
 - Faça um programa que repita as seguintes tarefas, até que o número zero seja digitado:
a) Leia o código do produto.
b) Leia a quantidade adquirida.
c) Se o código for 1, escreva ‘Caderno – R$ 12.00’; Se for 2, escreva ‘Régua – R$ 2.50’; Se for 3, escreva ‘Borracha –
R$ 0.25’; Se for 4, escreva ‘Mochila – R$ 50.00’.
d) Calcule e exiba o total a ser pago (valor * quantidade).

 */
package exe08;

import java.util.Scanner;
public class Exe08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int codigo =0;
     int quantidade;
     double total=0;
     do{
         System.out.println("Digite o código do produto");
         codigo = entrada.nextInt();
         if(codigo !=0){
         System.out.println("Digite a quantidade");
         quantidade = entrada.nextInt();
         switch(codigo){
             case 1:
                  System.out.println("Caderno 12$$");
                  total += 12 * quantidade;
                  break;
             case 2:
                 System.out.println("Régua 2,50$$");
                 total += 2.50 * quantidade;
                 break;
             case 3:
                 System.out.println("Borracha a 0,25 $$ Centavos");
                 total+=0.25 * quantidade;
                 break;
             case 4:
                 System.out.println("Mochila á 50$$ ");
                 total+=50 * quantidade;
                 break;
             case 0:
                 break;
         }
         }
 
     }while(codigo !=0);
        System.out.println("Valor total A ser pago "+total);
     entrada.close();
    }
    
}
