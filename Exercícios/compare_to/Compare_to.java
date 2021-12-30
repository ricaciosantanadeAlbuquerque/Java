/*
 * Utilizando o método compareTo() encontre o menor nome (mais próximo da letra A) num grupo de 5 nomes.
 */
package compare_to;

import java.util.Scanner;
public class Compare_to {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       String nome =  "A";
       String nome1 = "";
       String nome2 =" ",nome3=" ",nome4=" ",nome5=" ";
       System.out.println(" Digite o primeiro nome");
       nome1 = a.nextLine();
       System.out.println("Digite o segundo nome ");
        nome2 = a.nextLine();
       System.out.println("Digite o terceiro nome");
        nome3 = a.nextLine();
        System.out.println("Digite o quarto nome ");
         nome4 = a.nextLine();
         System.out.println("Digite o quinto nome ");
         nome5 = a.nextLine();
         if(nome1.compareTo(nome)== 1){
             System.out.println(" O nome mais próximo de A é  "+nome1);
         }else if(nome2.compareTo(nome)== 1){
             System.out.println("O nome mais próximo de A é "+nome2);
         }else if(nome3.compareTo(nome)== 1){
             System.out.println("O nome mais próximo de A é "+nome3);
         }else if(nome4. compareTo(nome)== 1){
             System.out.println("O nome mais próximo de A é "+nome4);
         }else if(nome5.compareTo(nome) == 1){
             System.out.println("O nome mais próximo de A é"+nome5);
    
    
}
    }
}