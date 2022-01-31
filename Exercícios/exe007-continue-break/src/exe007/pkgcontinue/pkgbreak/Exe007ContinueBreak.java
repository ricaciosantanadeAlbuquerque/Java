
package exe007.pkgcontinue.pkgbreak;

public class Exe007ContinueBreak {

    public static void main(String[] args) {
    
        int I = 0;
       while(I<10){
            I++;
          
           if(I==2 ||I==3 || I==4){
               continue;
           }else if(I==7 ){
                 break;
           }
                System.out.println(I);
           }
           
         
    }
    
}
