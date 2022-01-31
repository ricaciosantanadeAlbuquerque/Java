/*
  Um determinado clube de tênis pretende classificar seus atletas em categorias. Para isso, o clube contratou 
você para criar um programa que executasse essa tarefa.
Baseada na tabela de categorias do clube, construa um 
programa que solicite a idade de um atleta e imprima sua categoria;
De 5 a 10 anos – Infantil;
De 11 a 15 anos – Juvenil;
De 16 a 20 anos – Júnior;
De 21 a 25 anos – Profissional.
 */
package cuble_de_tenis;

import java.util.Scanner;
public class Cuble_de_tenis {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op =0;
        System.out.println("Por favor digite sua idade");
        op =in.nextInt();
        in.close();
        if(op>= 5 && op<=10){
            System.out.println("Categoria Infantil");
        }else if(op>=11 && op<=15){
            System.out.println("Categoria Juvenil");
        }else if(op>=16 && op <=20){
         System.out.println("Junior");
        }else if(op>=21 && op<=25){
            System.out.println("Profissional");
        }else{
            System.out.println("Fora da Categoria");
        }
        
    }
    
}
