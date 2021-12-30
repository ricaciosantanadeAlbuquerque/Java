/*
  Faça um programa para verificar a validade de uma senha fornecida pelo usuário. Se o usuário digitar a senha 
‘123456’, escrever a mensagem ‘Acesso liberado’. Caso contrário, escrever ‘Acesso negado’;
 */
package testandosenha;
import java.util.Scanner;
public class Testandosenha {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha1 ="123456";
        String senha2 = "";
        
        System.out.println("Digite a senha por favor ! ");
        senha2 =  input.nextLine();
         input.close();
        if(senha2.equals(senha1)){
            System.out.println("Acesso liberado !");
        }else{
            System.out.println("Acesso negado !");
        }
      
    }
    
}
