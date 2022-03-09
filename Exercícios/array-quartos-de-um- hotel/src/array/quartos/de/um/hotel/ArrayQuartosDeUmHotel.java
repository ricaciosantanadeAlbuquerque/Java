
package array.quartos.de.um.hotel;
import java.util.Scanner;
/*ESTE PROGRAMA  VAI SIMULAR UM HOTEL*/
public class ArrayQuartosDeUmHotel {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res = "";
        
       int[][]hotel = new int[5][10];
       String[][] ocupa =new String[5][10];
        for(int i=0; i<5;i++){
            for(int j =0;j<10;j++){
                hotel[i][j] = (int)(Math.random()*2);//0 e 1 // typecast vai força o valor a ser  especificamente inteiro,  o valor varia entre 0 e 1
                if(hotel[i][j]== 1){
                            ocupa[i][j] = "Ocupado"; // 1
                        }else{
                            ocupa[i][j] = "Desocupado";  // 0
                        }
               
            }
        }
        //in.nextLine();
        do{
        System.out.println("Digite [1]para listar todos os quartos !");
        System.out.println("Digite [2] para mudar o status do quarto !");
        System.out.println("Digite [3] para sair ! ");

        int op = in.nextInt(); // os valores de  entrada serão inteiros
        switch(op){
            case 1:
               int cont = 0;
               for(int i =0; i< 5;i++){ // 0 a 4 linha
                for(int j = 0; j < 10;j++){ // 0 a 9 coluna
                    cont++;
                     System.out.print("Quarto "+cont+" {"+ocupa[i][j]+" }  ");// listando os quartos do hotel
                     
                }
                   System.out.println();
            }
        
                break;
            case 2:
                
                  
                int num1 =0; 
                int contador = 0;
                System.out.println("Digite o número do quarto  que você deseja mudar o status");
                num1 = in.nextInt();
                int cont2 =0;
               for(int i =0; i< 5;i++){
                for(int j = 0; j < 10;j++){
                    cont2++;
                     if(cont2 == num1){
                         int status =0;
                        if(ocupa[i][j].equalsIgnoreCase("Ocupado")){
                         System.out.println("O quarto está ocupado !\n");
                         System.out.println("Deseja mudar o status ? "
                                 + "Se sim digite [1]");
                         status = in.nextInt();
                         if(status == 1 ){
                             ocupa[i][j]= "Desocupado";
                             break;
                         }else{
                               System.out.println(" Obrigado por utilizar nosso sistema !");
                               //System.exit(0);
                                break;
                         }
                         
                     }else if(ocupa[i][j].equalsIgnoreCase("Desocupado")){
                         
                         System.out.println(contador+" O quarto está Desocupado ! ");
                         System.out.println("Deseja mudar o status ? "
                                 + "Se sim digite [1]");
                         status = in.nextInt();
                         if(status == 1 ){ // confimação se for 1 ele entra nesta condição
                             ocupa[i][j]= "Ocupado"; // estava desocupado mas foi sobre escrito
                             break;
                         }else{
                             System.out.println(" Obrigado por utilizar nosso sistema !");
                               //System.exit(0);
                                break;
                         }
                     }
                }
                
            }
               }
//==============================================================================               
             int cont1 =0;
               for(int x =0; x< 5;x++){
                for(int y = 0; y < 10;y++){
                    cont1++;
                     System.out.print(cont1+" {"+ocupa[x][y]+" }  ");
                     
                }
                   System.out.println();
            }
                break;
            case 3:
                System.exit(0);
                break;
                
        }
            System.out.println("Deseja continuar a operção ?");
            System.out.println(" se sim digite [s] se não digite [n] ");
            res = in.next();
    }while(res.equalsIgnoreCase("s"));
    
    in.close();
    System.exit(0);
}
}
