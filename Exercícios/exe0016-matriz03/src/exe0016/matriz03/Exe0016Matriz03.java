
package exe0016.matriz03;
import java.util.Random;
public class Exe0016Matriz03 {

        public static void main(String[] args) {
                
             Random ale = new Random();
         int multlinha =1;
         int soma = 0;
        int[][] valor = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                valor[i][j]= ale.nextInt((100)+1);
                if(i==j){
                    soma+= valor[i][j];
                    
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(valor[i][j]+" | ");
            }
            System.out.println("");
        }
        for(int x=0;x<4;x++){
            multlinha *= valor[1][x];
            
        }
         int maior =0;
        for(int j=0;j<4;j++){
            if(valor[j][2]>maior){
                maior= valor[j][2];
                
            }
        }
        System.out.println(" A soma da diagonal principal é "+soma);
        System.out.println(" A multiplicação  da segunda  linha é :  "+ multlinha);
        System.out.println("O maior valor  da terceira coluna é : "+maior);
    }
    
}





