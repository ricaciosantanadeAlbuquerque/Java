
package pagemes;

import javax.swing.JOptionPane;
public class PageMes {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,pageMes("12-11-2009"));
    }
    
    public static int pageMes(String palavra){ // toda String é  um array de char
        int mes = 0;
        String mes1 = "";
        palavra = palavra.toUpperCase();
        for(int i =0; i < palavra.length();i++){ // o length() para String é um método não um atribulto
            if(palavra.charAt(i) == '1'){
                mes1 += palavra.charAt(i);
            }
            
        }
        mes = Integer.parseInt(mes1);
     return mes;
    }
}
