
package array.bidimensional;
import javax.swing.JOptionPane;
public class ArrayBidimensional {
   
    public static void main(String[] args) {
        int soma =0;
       int[][] matriz = new int[2][3];  // atetar para que todo array começa na posição 0 no caso deuma matriz é 00
       matriz[0][0] = 1;
       matriz[0][1] = 2;
       matriz[0][2] = 3;
       matriz[1][0] = 4;
       matriz[1][1] = 5;
       matriz[1][2] = 6;
       
       for(int linha = 0;linha < 2;linha++){// varre a linha 
           for(int coluna = 0;coluna<3;coluna++){ // varre a coluna
               System.out.print(matriz[linha][coluna]);
               soma += matriz[linha][coluna]; // += porque queremos somar acumular os valores desta matriz
           }
           System.out.println();
       }
       JOptionPane.showMessageDialog(null,"A soma de todos os valores é "+soma);
       System.exit(0);
    }
    
}
