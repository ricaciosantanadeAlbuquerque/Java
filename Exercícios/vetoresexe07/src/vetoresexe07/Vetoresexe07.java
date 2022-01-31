/*
 *  - Faça um programa que leia um vetor de 5 posições para números reais e,
depois, um código inteiro. Se o 
código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta;
se for 2, mostre o vetor na ordem 
inversa. Caso, o código for diferente de 1 e 2 escreva uma mensagem informando 
que o código é inválido.
 */
package vetoresexe07;
import java.util.Scanner;
public class Vetoresexe07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    double[] vet= {1,2,3,4,5};
        System.out.println("Digite [1] para ver o vetor na ordem crescente ");
        System.out.println("Digite [2] para ver o vetor na ordem decrescente ");
        System.out.println(" Digite [3] para sair ");
        int op = entrada.nextInt();
            if(op == 1){
                for(int i =0; i<vet.length;i++){
                    System.out.println(i +" == "+vet[i]);
                } 
            }else if(op == 2){
                for(int j = 4 ; j >= 0;j--){
                    System.out.println(vet[j]);
                }
            }else if(op == 3 ){
                System.exit(0);
            }else{
                System.out.println("ERRO! O código é inválido ");
            }
    }
    
}
