
package metodo_busca_array;


public class Busca {
    
    
     public static boolean buscaNumero(int numero,int[] vetor){
    
        boolean achou = false;
        
        for(int i = 0; i < vetor.length;i++){
            if(numero == vetor[i]){
                achou = true;
                break;
            }
        }
        return achou;
 //===============================================================================================       
    }
     public static String buscaPalavras(String[] palavra){
     String palavraBuscada = "sexo";
     String resposta = "nao";
   
     for(int i =0; i < palavra.length;i++){
            if(palavraBuscada == palavra[i]){
                resposta = "sim";
                break;
            }
     }
     return resposta;
     }
}
