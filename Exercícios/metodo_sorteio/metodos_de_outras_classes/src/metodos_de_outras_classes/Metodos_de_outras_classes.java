
package metodos_de_outras_classes;

import javax.swing.JOptionPane;

public class Metodos_de_outras_classes {

 
    public static void main(String[] args) {
        String nome = EntradaDadosComMetodos.lerString();// como os métodos são static não precisamos criar objeto só basta colocar o nome da
        // classe mais o nome do método
        int idade = EntradaDadosComMetodos.lerNumeroInt(10,30);
         float n1 = EntradaDadosComMetodos.lerNumeroFloat(0, 10);
         float n2 = EntradaDadosComMetodos.lerNumeroFloat(0, 10);
         float Media = (n1 + n2 / 2);
         JOptionPane.showMessageDialog(null,"Nome "+nome+
                 "\nIdade"+idade+
                 "\nNota1"+n1+
                 "\nNota2"+n2+
                 "\nMedia"+Media);
    }
    
}
