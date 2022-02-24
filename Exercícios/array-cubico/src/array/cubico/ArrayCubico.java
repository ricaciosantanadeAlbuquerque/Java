
package array.cubico;
/*foi criado um array cubico e inicializado os valores de forma direta
 * o programa deve ser capaz de alter entre duas tabelas e somar os valores pares e impares
 * do cubo */
import javax.swing.JOptionPane;
public class ArrayCubico {

    public static void main(String[] args) {
      int[][][] cubo = new int [2][3][2];
      //matriz 1           //matriz 2
      cubo[0][0][0]= 1;  cubo[0][0][1] = 2;
      cubo[0][1][0]= 3;  cubo[0][1][1] = 4; 
      cubo[0][2][0]= 5;  cubo[0][2][1]= 6;
      cubo[1][0][0]= 7;  cubo[1][0][1] =8;
      cubo[1][1][0]= 9;  cubo[1][1][1] =10;
      cubo[1][2][0]=11;  cubo[1][2][1]= 12;
       
       int somaPar = 0, somaImpar = 0;
       
       // é possível declarar  e inicializar várias variáveis separadas por virgula
        for(int linha =0; linha < 2;linha++){ // manipula as linhas
            for(int coluna = 0; coluna <3;coluna++){// manipula as colunas
                for(int matriz = 0; matriz < 2 ;matriz++){// manipula as tabelas
                    /*O primeiro laço a ser executado será o da matriz, quando o laço da matriz encerrar 
                     * será executado o laço da coluna, quando o laço da coluna acabar,será executado olaço  da linha  */
                    System.out.println(cubo[linha][coluna][matriz]);
                    if(matriz == 1){
                        somaPar += cubo[linha][coluna][matriz];  // += somaPar acumulo a soma dos valores
                }else{
                       somaImpar = somaImpar + cubo[linha][coluna][matriz];
                                
                                
                    }
        }
    }
    
}
    JOptionPane.showMessageDialog(null," A soma dos números pares é "+ somaPar
    +" A soma dos números impares é "+ somaImpar);
    System.exit(0);    
    }
}