
package exe0015.matriz02;

public class Exe0015Matriz02 {

    public static void main(String[] args) {
      
        
        int [][]idade = new int[3][3];
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    idade[i][j] = 1;
                }else{
                 
                    idade[i][j] = 0;
                
            }
           
                    
                }
            }
         System.out.println("MATRIZ");
            System.out.println("-------------------------");
            for(int i =0;i<3;i++){
                for(int j =0;j<3;j++){
                    System.out.print(idade[i][j]+"    ");
                    
        }
                System.out.println(" ");
    }
    }
    
}
