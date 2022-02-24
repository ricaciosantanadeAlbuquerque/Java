
package buscaem.array;
import javax.swing.JOptionPane;
public class BuscaemArray {

    public static void main(String[] args) {
       String[] cores = {"Verde","vermelho","Amarelo","Azul","Branco"};
       String cor= JOptionPane.showInputDialog("Digite o nome da cor que você deseja encontrar ! ");
       String mensagem = "Cor não encontrada";
        /*Será usando um laço foreach para varrer o laço e o vetor cores */
        for(String elemento: cores ){
            if(elemento.equalsIgnoreCase(cor)){
                mensagem = "cor encontrada ! ";
                break;
            }
        }
        JOptionPane.showMessageDialog(null,mensagem);
        System.exit(0);
               }
    
}
