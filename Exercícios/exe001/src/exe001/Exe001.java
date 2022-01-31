
package exe001;

import java.util.Scanner;
public class Exe001 {
/*Faça uma programa que receba 10 valores do usuário, se o valor for par ele deve ser somado
 * se o valor for impar ele  deve ser multiplicado */
  
    public static void main(String[] args) {
       
      int i,num1,soma,mult;
       Scanner in = new Scanner(System.in);
       num1 = 0;
       mult =1;
       soma = 0;
       i =0;
       
       do{
            
           System.out.println("Digite um número !");
           num1 = in.nextInt();
           System.out.println(i);
     
           if(num1%2==0){
               soma +=num1; //soma = soma+num1;
               System.out.println("PAR "+soma);
           }else{
               mult = mult*num1; // mult*=num1;
               System.out.println("impar "+mult);
           }
             i++;
       }while(i<10);
       in.close();
       System.out.println("O valor da soma  é: "+soma);
       System.out.println("O valor da multiplicação  é "+mult);
    }
    }
    



    
    

