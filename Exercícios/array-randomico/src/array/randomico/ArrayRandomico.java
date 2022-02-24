/*
 * Elabore um programa  que recebe o nome de dez pessoas por meio da class
 * JOptionPane, e armazene esses nomes em um array de dez elementos, sortei um 
* ganhador e imprima o seu nome em tela.
 */
package array.randomico;
import javax.swing.JOptionPane;
public class ArrayRandomico {

    public static void main(String[] args) {
       
        String[] nomes = new String[10];
        // Entrada de dados
        for(int i = 0;i < 10;i++){ //o a 9
            nomes[i] = JOptionPane.showInputDialog("Digite seu nome por favor !");
        }
        // sorteio
       int num1 = (int) (Math.random()*10); // serão gerados valores entre 0 e 9 
        System.out.println(num1);
        JOptionPane.showMessageDialog(null,nomes[num1]);
        /* Neste caso o valor do ídice será o num1 que possui um valor Randômico 
        * variando entre 0 e 9 assim podendo sortear qualquer posição do vetor nomes */
    }
    
}
