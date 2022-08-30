
package sobrecarga_metodo_media;

public class Media {
    
    public static double media;
    
    public static double media(double a,double b){
      Media.media = (a + b)/2;
     
     return media;
    }
    
    public static double media(double a, double b, double c){
       Media.media =  (a + b + c)/3;
     return media;
    }
    
    public static double media(double a, double b, double c, double d){
    
        Media.media = (a + b + c + d)/4;
    
     return media;
    };
    
}
