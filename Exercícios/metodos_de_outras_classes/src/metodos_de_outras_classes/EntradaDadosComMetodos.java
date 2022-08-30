
package metodos_de_outras_classes;

import javax.swing.JOptionPane;


public class EntradaDadosComMetodos {
     static String aux; // para usar nome da classe. atribulto
     
     public static float lerNumeroFloat(float minimo,float maximo){
         float n = 0;
                
                while(true){
                try{
                      EntradaDadosComMetodos.aux = JOptionPane.showInputDialog("Forneça um valor entre 0 e 10"); // entrada
               n = Float.parseFloat(aux); // converção
               
               if(n < minimo || n > maximo){
                   JOptionPane.showMessageDialog(null,"Valor fora da faixa permitida");
               }else{
                break; // condição de parada 
                }
                
               }catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(null,"Digite apenas valores numéricos !"+erro.toString());
                }
                
                
                
    }
     return n;
  }
     public static int lerNumeroInt(int minimo,int maximo){
     int n = 0;
     
        while(true){
                try{
                    EntradaDadosComMetodos.aux = JOptionPane.showInputDialog("Forneça um valor inteiro entre"+minimo+" e "+maximo);
                    n = Integer.parseInt(aux);
                    if(n < minimo || n > maximo){
                        JOptionPane.showMessageDialog(null,"Entrada fora da faixa permitida !!");
                    }else{
                        break;// condição e parada
                    }
                    
                }catch(NumberFormatException erro){
                    JOptionPane.showMessageDialog(null,"Digite apenas valores numéricos !!"+erro.toString());
                }
        
        
        }
         
     return n;
     }
     
    public static String lerString(){
    EntradaDadosComMetodos.aux = JOptionPane.showInputDialog("Forneça um nome ");
    return aux;
    }
}    
