
package busca.array03;
import java.util.Scanner;
public class BuscaArray03 {
/**/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      String[][] none = new String[1][5];
      String nome,sexo,result; 
        for(int j =0; j < 1;j++){
            for(int i = 0; i < 5;i++){
        System.out.println( i+" Digite um nome ! ");
        nome = in.nextLine();
        System.out.println(i+" Digite seu sexo ");
        sexo = in.nextLine();
                none[j][i] = nome+" "+ sexo;
             
            }
        }
        System.out.println("=================================================");
        System.out.println(" Digite o sexo !");
        String n = in.nextLine();
        
        int cont= 0;
        for(String[] j:none){
            for(int i =0;i<j.length;i++){
               cont = j[i].indexOf(n);
               if(cont > 0){
                   if(j[i].substring(cont).equalsIgnoreCase(n)){
                       System.out.println(j[i]);
                   }
               }
                       
                
                
            }
        }
     
      
    }
    
}
