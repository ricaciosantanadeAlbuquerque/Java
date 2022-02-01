
package exe0017.matriz04;
import java.util.Scanner;
import  java.util.Random;
public class Exe0017Matriz04 {

    
    public static void main(String[] args) {
        
            String s = "sim";
    Scanner in = new Scanner(System.in);
        Random ale = new Random();
        int [][] matriz = new int[4][4];
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               matriz[i][j] = ale.nextInt((9)+1);
           }
       }
     do{
     int valor = opções();
      
     switch(valor){
           case 1:
               for(int i = 0;i<4;i++){
                   for(int j=0;j<4;j++){
                       System.out.print(matriz[i][j]+" | ");
                   }
                   System.out.println("");
               }
            break;
                    
           case 2:
               for(int i=0;i<4;i++){
                   for(int j=0;j<4;j++){
                       if(i==j){
                           System.out.print(matriz[i][j]+" ");
                       }else
                         System.out.print("  ");
                   }
                   System.out.println("   ");
                   
                   
               }
               
            break;
           case 3:
               for(int i = 0; i<4;i++){
                   for(int j=0;j<4;j++){
                       if(j>i){
                           System.out.print(matriz[i][j]+"  ");
                       }else{
                           System.out.print("   ");
                       }
                    
                   }
                      System.out.println("   ");
                   
               }
               break;
           case 4:
               for(int i=0;i<4;i++){
                   for(int j=0;j<4;j++){
                       if(i>j){
                           System.out.print(matriz[i][j]+"  ");
                       }else{
                           System.out.print("   ");
                       }
                   }
                   System.out.println(" ");
               }
               break;
           default:
               System.exit(0);
               break;
       }
    
          System.out.println("Digite [s] para SIM [N] para NÃO");
          s = in.next();
        
          for(int i=0;i<100;i++){
         System.out.println(" ");
     }
    }while(s.equals("s"));
    
       
        
    }
    public static int opções (){
     Scanner in = new Scanner(System.in);
      int num1 =0;
      
      System.out.println(" MENU DE OPÇÕES ! ");
      System.out.println("[1] Mostrar Matrizes ");
      System.out.println("[2] Diagonal principal ");
      System.out.println("[3] Triângulo Superior ");
      System.out.println("[4] Triângulo Inferior ");
      System.out.println("[5] Sair ");
       num1 = in.nextInt();
       
       return num1;
 }
    
}
