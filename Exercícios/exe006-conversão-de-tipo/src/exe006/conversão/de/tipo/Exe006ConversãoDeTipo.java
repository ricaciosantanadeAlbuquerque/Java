
package exe006.conversão.de.tipo;

public class Exe006ConversãoDeTipo {

    public static void main(String[] args) {
       
        float ab =14.7f;
       int ac =(int) ab;
        System.out.println(ac);
        int X = 10;
        float Y = (float)X;
        System.out.println(X);
         double v = 50.5;
         int r =(int) v;
         System.out.println(r);
         int u = 100;
         double op = u;
         System.out.println(op);
         
         String nome = "30";
         int nome1 = Integer.parseInt(nome);
         System.out.println(nome1);
         
         int NB = 30;
         String h = String.valueOf(NB);
         System.out.println(h);
         
         float fala = 3.14f;
         String k = String.valueOf(fala);
         System.out.println(k); 
         
           String none = "15.5";
           float g = Float.parseFloat(none);
           System.out.println(g);
           
            double h1 = 17.7;
             String hagata = String.valueOf(h1);
             //String hagata = Double.toString(h1);
              String sala = "400.5";
               double io = Double.parseDouble(sala);
               System.out.println(io);
    }
    
}
