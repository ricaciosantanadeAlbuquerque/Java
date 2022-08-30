
package sobrecarga.de.metodos;


public class SobrecargaDeMetodos {

    
    public static void main(String[] args) {
        
        System.out.println(area(10));
        System.out.println(area(10,2));
        System.out.println(area(10,22,34));
        
        /*
         * Como podemos ver é o mesmo método, porém com assinaturas diferentes, O compilador se
         * ajusta conforme a quantidade de parâmetros passados. Se for um argumento será chamado o método area com um 
         * parâmetro, se for passado dois argumentos será achamado o método com dois parâmetros e assim por diante etc;
        */
    }
  // Area  1
    public static double area(int x){
     return (x * x);
    }
    
    // area 2
    public static double area(int x, int y){
        return x * y;
    }
    // area 3
    public static double area(int x,int y ,int z){
        return x * y * z;
    }
}
