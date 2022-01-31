
package exe009;
import javax.swing.JOptionPane;
public class Exe009 {

    public static void main(String[] args) {
      
       String diaDaSemana = JOptionPane.showInputDialog("Forneça um valor entre 1 e 7 !");
     if( diaDaSemana != null){
         try{
             int dia = Integer.parseInt(diaDaSemana);
             
             if(dia == 1){
                 diaDaSemana = "Domingo";
             JOptionPane.showMessageDialog(null,diaDaSemana);
             }else if(dia==2){
                 diaDaSemana = "Segunda";
            JOptionPane.showMessageDialog(null,diaDaSemana);

             }else if(dia==3){
                 diaDaSemana = "Terça";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
             }else if(dia == 4){
                 diaDaSemana = "quarta";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
             }else if(dia == 5){
                 diaDaSemana = "quinta";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
             }else if(dia == 6){
                 diaDaSemana = "Sexta";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
             }else if(dia== 7){
                 diaDaSemana = "sábado";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
             }else{
                 diaDaSemana = "Dia da semana desconhecido";
                 JOptionPane.showMessageDialog(null,diaDaSemana);
         }
         }
         catch(NumberFormatException erro){
             JOptionPane.showMessageDialog(null,"Digite aprens valores numéricos"+erro.toString());
     }
     System.exit(0);
    }
    }
    
    }
