
package funcao_void;


public class Funcao_void {

    //Função sem retorno
    public static void main(String[] args) {
      imprimir(); // chamada ao médoto imprimir();
      imprimirTexto("Metodo com parametro "); //  chamada ao método imprimirTexto() recebe um argumento do tipo String que será passado para 
      // o parâmetro do método que também é do tipo String;
      somar(10,20); // 10 e 20 passados como argumento 
      quadrado(10);
      maior(10, 20 ,50); // os Argumentos tem que ser separados por virgula
      sexo('M'); // chamada ao método sexo(); passando M como argumento
      // Chamada ao método imprimeVarisVezes();
      imprimeVariasVezes("Seja um vencedor !",10); // ao fazer uma chamada ao método sua assinatura deve está correta
      
      // utilizado métodos static
      Staticos.palavra();
    }
    // Método 1
    public static void imprimir(){
        System.out.println("Aprendendo a liguagem java ");
    }
    // Método 2
    public static void imprimirTexto(String texto){
        System.out.println(texto); // será mostrado o valor do parâmetro texto
    }
    // Método 3
    public static void somar(int a,int b){
        System.out.println(a + b); // exibe a soma do parâmetro a mais b
    }
    public static void quadrado(int a){
     System.out.println("O quadrado de "+a+" e "+(Math.pow(a, 2)));
    }
    public static void maior(int a, int b, int c){
    System.out.println(Math.max(c,Math.max(a, b))); 
    /*
    * A função mais interna  Math.max(a,b); irá retornar o maior valor  entre [ a e b ]para ser comparado  com o parâmetro [c]
    * da função mais externa, então a execução ocorre de dentro para fora.
    * por fim a respota será exibida na tela.
    */
    
    }
    public static void sexo(char sexo){
        if(sexo == 'F'){
            System.out.println("Femino");
        }else if(sexo == 'M'){
            System.out.println("Masculino");
        }else{
            System.out.println("Sexo desconhecido !");
        }
    }
    public static void imprimeVariasVezes(String frase,int quantidade){
        for(int i =0; i < quantidade;i++){
           System.out.println(i+1+"=="+frase+"==");
    }
    }
    }

