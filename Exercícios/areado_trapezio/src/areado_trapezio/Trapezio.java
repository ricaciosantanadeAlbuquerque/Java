package areado_trapezio;
import java.util.Scanner;
public class Trapezio {
	
/*Calculando a área de um trapézio */
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String base_maior,base_menor,altura;
		 base_maior = " "; base_menor = " ";
		 System.out.println("===Aréa do trapézio===");
		 System.out.println("Digite a Base maior !");
		 base_maior = in.next();
		 System.out.println("Digite a base menor !");
		 base_menor = in.next();
		 System.out.println("Digite a altura !!");
		 altura = in.next();
		 double maior=0,menor=0,alt=0;
		 maior = Double.parseDouble(base_maior);
		 menor = Double.parseDouble(base_menor);
		 alt = Double.parseDouble(altura);
		 System.out.println("A area do trapézio é : "+( ( (maior + menor)/2)*alt));
		 in.close();
	}

}
