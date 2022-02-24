/*
 *Crie uma classe que recebe dez números  por meio da classe JOptionPane.showInputDialog
 * Armazene esses valores em um array de dez elementos e aparesente em tela as somas dos números 
 * o amior  e o menor valor
 */
package array.exe.livro;
import javax.swing.JOptionPane;
public class ArrayExeLivro {

    public static void main(String[] args) {
       int[] numeros = new int[10]; // 0 a 9
       int soma =0, menor = 1000000000, maior =0;
       
       
       for(int j=0; j< 10; j++){ //0 a 9
           numeros[j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
           soma += numeros[j];// soma = soma + numeros[j];
           if(numeros[j]> maior){
               maior = numeros[j]; // sobre escrita
       }
           if(numeros[j]<menor){
               menor = numeros[j];
           }
           
    }
    JOptionPane.showMessageDialog(null,"A soma de todos os elementos é "+ soma);
    JOptionPane.showMessageDialog(null,"O maior valor é "+maior);
    JOptionPane.showMessageDialog(null,"O menor valor é "+menor);
}
}