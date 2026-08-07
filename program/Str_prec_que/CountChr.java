package Str_prec_que;
import java.util.Scanner;
public class CountChr {
 static int fun(String N){
   int count=0;
    for(int i=0;i<N.length();i++){
       count++;
    }
    return count;
 }  
    

 public static void main(String[] args){
    Scanner S= new Scanner(System.in);
    System.out.print("Enter your String: ");
    String Name=S.next();
    System.out.println("Charector in String: ");
     System.out.print(fun(Name));
    
     S.close();
  }

}
