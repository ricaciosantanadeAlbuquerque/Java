
package metodo_array;


public class Metodo_array {

   
    public static void main(String[] args) {
       String[] nomes = {"ana","carmen","lucas","julia"};
       double[] valor = {10.50,1.2,33.33,5,6,7.37};
       
       double maior = Array.buscaMaior(valor);
       String[] ordenado = Array.ordenaPalavras(nomes);
       
       System.out.println(maior);
       
       for(String p : ordenado){
           System.out.println(p);
       }
    }
    
}
