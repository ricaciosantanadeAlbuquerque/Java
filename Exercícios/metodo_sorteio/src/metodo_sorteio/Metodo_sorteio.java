
package metodo_sorteio;

import java.util.Random;


public class Metodo_sorteio {

    public static void main(String[] args) {
        
        System.out.println(sorteio("carro","Computador", "TV", "bola"));
        
    }
    public static String sorteio(String brinde1, String brinde2,String brinde3,String brinde4){
    Random novo = new Random();
    String item = "";
    int numSorte = novo.nextInt(4)+1; // será gerando valores aleatórios entre 1 e 4 atraves da classe rabdom
      
        switch (numSorte) {
            case 1:
                item = brinde1;
                break;
            case 2:
                item = brinde2;
                break;
            case 3:
                item = brinde3;
                break;
            case 4:
                item = brinde4;
                break;
        }
    return item;
    }
}
