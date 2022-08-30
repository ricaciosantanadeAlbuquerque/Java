
package metodo_idade;


public class Metodo_idade {
     /* Faça uma classe que  possua um método que recebe um número inteiro, refrentes a idade de alguém,
      * e retorne a faixa etária a qual ela pertense
      */
    
    public static void main(String[] args) {
     
        System.out.println(idade(70));
        
       
    }
    public static String idade(int idade){
        String idadeFrase = "";
        if(idade >=0 && idade <=2){
           idadeFrase = "Bebe";
        }else if(idade >= 3 && idade  <= 11){
           idadeFrase = "Criança"; 
        }else if(idade >= 12 && idade <=19){
           idadeFrase = "Adolescente";
        }else if(idade >= 20 && idade <=30){
           idadeFrase = "Jovem";
        }else if(idade >= 31 && idade <= 60){
            idadeFrase = "Adulto";
        }else{
            idadeFrase = "Idoso";
        }
        
        
    return idadeFrase;
    }
}
