import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		  Scanner b = new Scanner(System.in);
		String res = " ";
		String a = " ";
		  int  valor; 
		  float valor2;
		 

		 do {
			 valor = menuCalci(); // recebe o retorno do método
			   valor2 = proceCalci(valor); // chamada do método passando valor como argumento
			   if(valor2==0) {
				   System.out.println("===FIM===\n\n");
					  
				  }else {
					  System.out.println("\n"+valor2+"\n");
				  }
				  
			System.out.println("Digite [SIM] para  continuar e "
					+ "[NÃO] para sair do Sistema ");
			a = b.nextLine();
			res = a.toLowerCase();
		 }while(res.equalsIgnoreCase("sim"));
		 System.out.println("===FIM===\n\n");
		b.close();
	 }
	 //===============================================================================================
	 public static int menuCalci() {
		 Scanner in1 = new Scanner(System.in);
		 int op =0;
		 System.out.println("===============Menu=================");
		 System.out.println("===========CALCULADORA==============");
		 System.out.println("Digite [1] para somar ");
		 System.out.println("Digite [2] para subtrair ");
		 System.out.println("Digite [3] para multiplicar ");
		 System.out.println("Digite [4] para dividir");
		 System.out.println("Digite [5] para média");
		 System.out.println("Digite [0] para sair !");
		  
		  op = in1.nextInt();
		  //in1.close(); ERRO! 
		return op; 
		 
	 }
	//================================================================================================
	 public static float proceCalci(int x) {
		 Scanner in2= new Scanner(System.in);
		 float resultado,num1,num2,soma,sub,mult,div;
		 resultado =0;
		  switch(x) {
			 case 1:
				 
				System.out.println("Digite o primeiro valor !!");
				       num1 = in2.nextFloat();
				System.out.println("Digite o segunmdo valor !!");
				       num2 = in2.nextFloat();
				   
				       soma = num1 + num2;
				   resultado = soma;
				 
				 break;
			 case 2:
					System.out.println("Digite o primeiro valor !!");
					   
					  num1 = in2.nextFloat();
					System.out.println("Digite o segunmdo valor !!");
					  
					  num2 = in2.nextFloat();
					   sub = num1 - num2;
					   resultado = sub;
					   
			break;
			 case 3:
				 System.out.println("Digite o primeiro valor !!");
				   
				  num1 = in2.nextFloat();
				System.out.println("Digite o segunmdo valor !!");
			
				  num2 = in2.nextFloat();
				  mult = num1 * num2;
				  resultado = mult;
				 break;
			 case 4:
				System.out.println("Digite o primeiro valor !!");
				  num1 = in2.nextFloat();
				System.out.println("Digite o segunmdo valor !!");
				  num2 = in2.nextFloat();
				  div = num1 / num2;
				  resultado = div;
				 break;
			 case 5:
				 System.out.println("Digite o primeiro nota !!");
				  num1 = in2.nextFloat();
				 System.out.println("Digite o segunmdo nota !!");
				  num2 = in2.nextFloat();
				 System.out.println("Digite a terceira nota !! ");
				  float num3 = in2.nextFloat();
				 System.out.println("Digite a quarta nota !!");
				  float num4 = in2.nextFloat();
				 
				 float media = (num1+num2+num3+num4)/4;
				  resultado = media; 
				  
				 
				 break;
			 case 0:
				resultado = 0;
				 break;
				 default:
					 System.out.println(" Opção fora da faixa por favor tente novamente ");
					 break;
			 }
		  	//in2.close();	ERRO JAMIS FECHE UM MÉTODO COM RETORNO
		 return resultado;
	 }
	}



