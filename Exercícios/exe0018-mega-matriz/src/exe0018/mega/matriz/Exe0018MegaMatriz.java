
package exe0018.mega.matriz;
import java.util.Scanner;
import java.util.Random;
public class Exe0018MegaMatriz {

    
    public static void main(String[] args) {
   
        Random aleat = new Random();
         int [][][] vet = new int [10][10][10];
          for(int x=0;x<10;x++){
              for(int y=0;y<10;y++){
                  for(int z=0;z<10;z++){
                       vet[x][y][z] = aleat.nextInt((1000)+1);
                  }
              }
          }
          System.out.println("=====================");
          System.out.println("Mostrando a Matriz ! ");
          System.out.println("=====================");
           int maior = 0;
           int menor =1000;
           for(int x=0;x<10;x++){
               for(int y=0;y<10;y++){
                   for(int z=0;z<10;z++){
                       System.out.print(vet[x][y][z]+" | ");
                       if(vet[x][y][z]>maior){
                           maior = vet[x][y][z];
                       }else if(vet[x][y][z]<menor){
                           menor = vet[x][y][z];
                       }
                       
                   }
                             System.out.println("");
               }
           
           }
                System.out.println("O maior valor da mega matriz é "+ maior); 
                System.out.println("O menor valor da mega matriz é "+ menor );
    }
    }
    

