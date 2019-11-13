
package exemplobucles;
import java.util.Scanner;

public class Metodos {
   
    private int num;
    Scanner sc=new Scanner (System.in);
    
    public int pedirDatos(){
         System.out.println("teclea numero:");
       num = sc.nextInt();
     return num;
    // return sc.nextInt();
    }
            
              
   public void  verDoWhile(){
       int num;
       do{
           num=pedirDatos();
           System.out.println(num);
           
       }while(num !=0);
       System.out.println("*** saimos do bucle");
   }
}