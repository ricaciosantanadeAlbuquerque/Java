
package exe004.caso.escolha;
import  java.util.Scanner;
public class Exe004CasoEscolha {
    // Calculando seu peso nos outros planetas
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome !");
        String nome = in.nextLine();
        System.out.println("Digite seu peso !");
        double peso = in.nextDouble();
        System.out.println("Digite 1 para  saber o seu peso em Mercúrio !");
        System.out.println("Digite 2 para saber seu peso em vênus !");
        System.out.println("Digite 3 para saber seu peso em Marte ! ");
        System.out.println("Digite 4 para saber seu peso em Júpiter!");
        System.out.println("Digite 5  para  saber seu peso em Saturno !");
        System.out.println("Digite 6 para saber seu peso em Urano ! ");
           int opcao = in.nextInt();
           switch(opcao){
               case 1:
                    double valor = (peso*3.6)/9.8;
                    System.out.printf("O seu peso no planeta  Mercúrio é %.0f ",valor);
                   
                   break;
               case 2:
                    double valor1 = (peso*8.8)/9.8;
                    System.out.printf("O seu peso no planeta  vênus é %.0f ",valor1);
                   break;
               case 3:
                   double  valor2 = (peso*3.7)/9.8;
                   System.out.printf("O seu peso no planeta Marte é %.0f ", valor2);
                   break;
               case 4:
                     double valor3 = (peso*24.79)/9.8;
                     System.out.printf("O seu peso em júpiter é %.0f ",valor3);
                     
                   break;
               case 5:
                  double valor4 = (peso*10.44)/9.8;
                   System.out.printf(" O seu peso no planeta  Saturno é %.0f ", valor4);
                   break;
               case 6:
                   double valor5 = (peso*8.69)/9.8;
                   System.out.printf("O seu peso no planeta Urano é de %.0f ",valor5);
                   break;
               default:
                   System.out.println(" Valor invalido !");
                   break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                           
                         
               
           }
    }
    
}
