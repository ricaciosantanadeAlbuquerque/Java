/*
 * Faça um programa que peça ao usuário para cadastrar uma senha. Na sequência, deve pedir ao usuário que 
digite dois números inteiros e calcular a divisão do primeiro pelo segundo. O programa deve solicitar ao usuário 
a senha e, caso esteja correta, mostrar o resultado da divisão. Caso a senha esteja incorreta, mostrar uma 
mensagem de erro e encerrar o aplicativo (sem mostrar o resultado da divisão). OBS: Para encerrar seu aplicativo, 
utilize o método System.exit(0).
 */
package senha_soma;

import java.util.Scanner;
public class Senha_soma {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int num1 = 0,num2=0;
       String senha = "";
        System.out.println("Por favor digite uma  senha. ");
         senha = entrada.nextLine();
         System.out.println("Digite uma número ! ");
         num1 = entrada.nextInt();
         System.out.println("Digite outro número ! ");
         num2 = entrada.nextInt();
         int divisao = num1/num2;
         System.out.println("Por favor digite uma senha !");
         entrada.nextLine(); // erro de leitura após  a leitura de dados inteiros 
         // foi corrigida com a  instrução entrada.nextline() antes de ler outro dado
         String senha2 = entrada.nextLine();
          entrada.close();
         if(senha.equals(senha2)){ // se o valor de  senha for igual a senha 2
             System.out.println(" O resultado é "+divisao);
         }else{
             System.out.println("Erro senha inválida");
             System.exit(0);
         }
        
    }
    
}
