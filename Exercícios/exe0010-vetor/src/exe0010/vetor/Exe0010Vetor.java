
package exe0010.vetor;
import java.util.Scanner;
public class Exe0010Vetor {

    public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
      int [][] matriz = new int[3][3];
       for(int x=0;x<3;x++){
           for(int y=0;y<3;y++){
               System.out.println("Digite um valor para posição ["+x+","+y+"]");
               matriz[x][y] = in.nextInt();
              
           }
       }
       int totpar=0;
        System.out.println("MATRIZ");
        System.out.println("_____________");
       for(int x=0;x<3;x++){
                for(int y =0;y<3;y++){
                     if(matriz[x][y]%2==0){
                   System.out.print( "["+matriz[x][y]+"] ");
                   totpar++;
               }else
                         System.out.print(matriz[x][y]+" ");
    }
                
                System.out.println("");
}
        System.out.println("O total de numeros pares é "+totpar);
    }
    
}
