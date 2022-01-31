/*
 * 8 - Faça um programa que leia duas matrizes
  A e B de tamanho 3 x 3 e calcule C = A ∗ B.

 */
package vetor09;

public class Vetor09 {
    
    public static void main(String[] args) {
      int[][] A = new int[3][3];
      int[][] B = new int[3][3];
      int[][] C = new int[3][3];
      int num1 = 19;
      int num2 = 2;
      for(int i =0;i<3;i++){
         for(int j =0;j<3;j++){
             num1++;
             num2++;
          A[i][j] = num1;
          B[i][j] = num2;
          C[i][j] = A[i][j] * B[i][j];
          } 
      } System.out.println("====================================================");
        System.out.println("Matriz A ");
       for(int i =0;i<3;i++){
         for(int j =0;j<3;j++){
             System.out.print(" "+A[i][j]+" ");
             
             //System.out.print(B[i][j]);
             //ystem.out.print(C[i][j]);
          } 
           System.out.println("");
      }
        System.out.println("====================================================");
          System.out.println("Matriz B ");
       for(int i =0;i<3;i++){
         for(int j =0;j<3;j++){
            
             
             System.out.print(" "+B[i][j]+" ");
             
          } 
           System.out.println("");
      }
        System.out.println("===================================================");
        System.out.println(" A multiplicação de A * B resultou nA Matriz C ");
       for(int i =0;i<3;i++){
         for(int j =0;j<3;j++){
            
             System.out.print(" "+C[i][j]+" ");
          } 
           System.out.println("");
      }
    }
    
}
