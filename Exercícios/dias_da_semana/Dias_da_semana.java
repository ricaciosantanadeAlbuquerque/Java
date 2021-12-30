/*
6 - Faça um programa que receba um número e exiba o dia correspondente (1 – domingo, 2 – segunda, 3 – terça, 
4 – quarta, 5 – quinta, 6 – sexta e 7 – sábado).

 */
package dias_da_semana;
import java.util.Scanner;
public class Dias_da_semana {

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Digite [1] para o domingo ");
        System.out.println("Digite [2] para a segunda ");
        System.out.println("Digite [3] para a terça ");
        System.out.println("Digite [4] para a quarta ");
        System.out.println("Digite [5] para a quinta ");
        System.out.println("Digite [6] para a sexta ");
        System.out.println("Digite [7] para o sábado ");
        int op = in.nextInt();
        in.close();
        switch(op){
            case 1:
                System.out.println(" Domingo ");
                break;
            case 2:
                System.out.println(" Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6 : 
                System.out.println("Sexta-feira");
               break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor fora da faixa ! ");
        }
        System.exit(0);
    }
    
}
