package teste2;

public class Exame {

	public static void main(String[] args) {
		int a;
	  String nome;
	  if(a > 0) {
		  a = 5;
		  nome = "maria";
	  }
	  	System.out.println(a); // a NAO FOI INICIALIZADA POR TANTO NÃO COMPILA
	  	System.out.println(nome); // ESTA VARIÁVEL SÓ É VISIVEL OU SÓ EXISTE DENTRO DO CORPO 
	  	//DO IF() POR TANTO NÃO COMPILA
	}

}
