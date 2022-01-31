/*
 *  – Faça um programa para ler os elementos de uma matriz 5 x 5. Em seguida, 
receba do usuário um valor X. O 
programa deverá fazer a busca desse valor na matriz e, ao final, escrever a 
localização do elemento (mostrar a 
linha e coluna). Caso não encontre, deve mostra ruma mensagem de “não encontrado”.
 */
package vetorexe08;
import java.util.Scanner;
public class Vetorexe08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int[][] banco = new int[5][5];
       int cont = 1;
              boolean verdade = false;
// preenchendo A matriz=========================================================              
       for(int i = 0; i < 5 ;i++){
           for(int j = 0 ; j<5;j++ ){
               banco[i][j] = cont++;
             
           }
       }
 //=================Buscando um valor na Matriz=================================
       int linha = 0;
       int coluna = 0;

       int valor = 0;
       System.out.println("Por favor digite o valor que você procura ");
       int num1 =  in.nextInt();
       for(int x = 0; x<5;x++){
           for(int y = 0;y<5;y++){
               if(num1 == banco[x][y]){
                   linha = x;
                   coluna = y;
                   valor = banco[x][y];
                   verdade = true;
                   break;
               }
               
           }
           
       }
//===================Exibindo a Matriz==========================================  

       for(int i =0; i<5;i++){
          
           for(int j=0; j<5 ;j++){
              
               System.out.print("|"+banco[i][j]);
           }
           System.out.println();
          
       }
//========================Resultado Final=======================================       
          if(verdade == true){
               System.out.println("O valor foi encontrado na linha "+linha+" e coluna "+coluna);
           System.out.println(" e é "+valor);
          }else{
              System.out.println("Erro! O valor não foi encontrado !!");
          }
        
    }
    
}
