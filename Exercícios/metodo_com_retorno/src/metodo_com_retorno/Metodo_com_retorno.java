
package metodo_com_retorno;


public class Metodo_com_retorno {
       
    public static void main(String[] args) {
       System.out.println(soma(11.5,12.0)); // o valor de retorno está sendo exibido!
       System.out.println(pares(100));
       System.out.print(diaPorExtenso(2)+"\n");
        System.out.println(contaLetra("Banana"));
       
    }
    public static double soma(double a,double b){ // visibilidade publica static [metodo de classe ] retorno double nome soma(lista[parâmetros]);
        return a + b; // retorna a soma de a e b
        
    }
    public static String pares(int valor){
        String retorno = "";
        for(int a = 0 ; a <= valor ; a = a+2){
            retorno+=a+" "; // um valor inteiro a concatenado com uma String " ", o valor de a passa a ser String
            // é importante resaltar que os valores estão sendo escritos e juntados dentro da variável retorno, para depois por fim ser retornado
        }
        return retorno;
    }
    
    public static String diaPorExtenso(int dia){
        String extenso = "";
        if(dia == 1)extenso = "Domingo";
        else if(dia == 2) extenso = "Segunda";
        else if(dia == 3) extenso = "Terça";
        else if(dia == 4) extenso = "Quarta";
        else if(dia == 5) extenso = "Quinta ";
        else if(dia == 6) extenso = "Sexta";
        else extenso = " dia não reconhecido";
        return extenso;
    }
    public static int contaLetra(String palavra){ // palavra é um array de String por isso eu posso fazer a < palavra.length() pois será retornado um int
    int quantidade = 0;
    palavra = palavra.toUpperCase();
    for(int a  = 0 ; a < palavra.length();a++){
          if(palavra.charAt(a)== 'A'){
              quantidade++;
          } 
        }
    return quantidade;
    }
    
    
}
