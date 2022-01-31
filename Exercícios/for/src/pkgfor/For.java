/*
 * 3 – Faça um programa que receba a idade de 10 pessoas e escreva 
a quantidade de pessoas com idades entre 0 
e 12 anos.

 */
package pkgfor;

import java.util.Scanner;
public class For {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        int cont = 0;
        for(int i =0; i<10;i++){
            System.out.println("Por favor digite sua idade !");
            idade = in.nextInt();
            if(idade>=0 && idade<=12){
                cont++;
            }
        } 
        System.out.println("A quantidade de pessoas com a idade entre 0 e 12 é ["+ cont+"]");
    }
    
}
