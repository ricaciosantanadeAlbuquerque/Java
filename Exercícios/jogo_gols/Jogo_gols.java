/*
 *  Faça um programa para ler o número de gols marcados pelo Nacional de Patos e o número de gols marcados 
pelo Treze. Escrever o nome do time vencedor. Caso não haja vencedor, escrever EMPATE.
 */
package jogo_gols;
import java.util.Scanner;
public class Jogo_gols {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int jogo1=0;
        int jogo2 =0;
        System.out.println("Digite o total de gols marcados pelo 13 ");
        jogo1 =  entrada.nextInt();
        System.out.println("Digite o total de gols marcados pelo Nacional de patos ");
        jogo2 = entrada.nextInt();
        entrada.close();
        if(jogo1 > jogo2){
            System.out.println("O vencedor é o 13 ! ");
        }else if(jogo2 > jogo1){
            System.out.println("O vencedor é o Nacional de patos ");
        }else{
            System.out.println("Empate !");
        }
    }
    
}
