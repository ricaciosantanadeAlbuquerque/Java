
package imc;

import java.util.Scanner;
public class Imc {

    /* - O índice de massa corpórea (IMC) de um indivíduo é obtido dividindo-se o seu peso (em Kg) pelo quadrado da 
altura (em metros). Assim, por exemplo, uma pessoa de 1,67m e pesando 55kg tem IMC igual a 19,73. Escreva um 
programa que solicite ao usuário o seu peso em kg e sua altura em metros e, a partir deles, calcule o índice de 
massa corpórea e apresente o resultado de acordo com a situação abaixo.
IMC Situação
< 18,5 Magro
18,5 – 24,9 Normal
25,0 – 29,9 Sobrepeso
30,0 – 34,9 Obeso
35,0 – 39,9 Obesidade mórbida
    PS! RECEBA OS VALORES COMO CARACTERE E CONVERTA 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double  peso = 0;
        double  altura =0;
        System.out.println("Por favor digite seu peso! ");
        peso = Double.parseDouble(in.next());
        System.out.println("Por favor digete sua altura! ");
        altura = Double.parseDouble(in.next());
        
        double imc =  peso/(altura*2);
        
        if(imc <18.5){
            System.out.printf(" Você  está  Magro de mais !  Seu IMC é de  %.2f \n",imc);
        }else if(imc >= 18.5 && imc<=24.9){
            System.out.printf("Seu peso é normal ! Seu IMC é de  %.2f  \n",imc);
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.printf("Você  está  com sobrepeso ! Seu IMC é de %.2f \n ",imc);
        }else if(imc >= 30.0 && imc <=34.9){
            System.out.printf("Você está obeso ! Seu IMC é de %.2f \n",imc);
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.printf("Você está  com obesidade Morbida, cuidado ! Seu IMC é de %.2f \n",imc);
        }
        in.close();
        
    }
    
}
