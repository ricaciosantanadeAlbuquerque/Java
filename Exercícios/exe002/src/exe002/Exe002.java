
package exe002;
// importação da classe Scanner
import java.util.Scanner;

public class Exe002 {
    /* Faça um programa que permita abrir um conta de banco, esse programa deve ser capaz
    * de permitir depósitos, saques e consultas de saldo */
    public static void main(String[] args) {
     
          //declaração do objeto Scanner! (in)
          Scanner in = new Scanner(System.in);
 
         double saldo = 0;
        System.out.println(" Para abrir uma conta por favor digite seu nome !");
          String nome = in.nextLine();
          System.out.println(" senhor "+nome+" seu saldo é "+saldo+" $ ");
          System.out.println();
          System.out.println("Você deseja fazer um deposito ? ");
          System.out.println(" se sim digite [1] se não digite [2]");
            int numero = in.nextInt();
   // trecho do códifo aonde é realida uma operação condicional,
   
            if(numero==1){
                System.out.println("Por favor digite um valor $ ");
                  double valor = in.nextDouble();
                  saldo = valor;
                  System.out.println(" O seu saldo atual é "+saldo+" $ ");
           
           
            //fim da primra estrutua  condicional.
            
            System.out.println(" Você deseja realizer mais alguma operação ? ");
            System.out.println("[1] para sim e [2] para não ");
           int pergunta = in.nextInt();
              if(pergunta == 1){
                  System.out.println("SALDO! digite [1]");
                  System.out.println("DEPÓSITO! digite [2]");
                  System.out.println("SAQUE! digite [3]");
                   int escolha = in.nextInt();
                   /* aque foi criada uma estrutura condicional para testar
                    os valores escolhidos pelo usuário no painel acima. */
                   if(escolha == 1){
                       System.out.println(" O seu saldo atual é "+saldo);
                       
              }else{
                       if(escolha == 2 ){
                 System.out.println(" Por favor digite o valor do deposito! ");
                            double deposito = in.nextDouble();
                             saldo = saldo+deposito;
                             System.out.println("O seu saldo atual é "+saldo);
                       }else{
                           if(escolha == 3){
                   System.out.println(" Por favor digite o valor do saque");
                     double saque = in.nextDouble();
                     if(saque<saldo){
                          double valor1 = saldo-saque;
                          System.out.println("O seu saldo final é "+valor1);
                     }else{
                         System.out.println("ERRO! VOCÊ NÃO POSSUI ESSE VALOR EM CAIXA!");
                     }
                     if (escolha>3){
                         System.out.println("ERRO! VOCÊ ESCOLHEU UM NÚMERO");
                         System.out.println("INVALIDO!");
                     }
                           }
    }
    
}
              }
            }
    }
}