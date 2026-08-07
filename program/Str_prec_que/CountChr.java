package Str_prec_que;
import java.util.Scanner;
public class CountChr {
 static int fun(String N,char ch){
   int count=0;
    for(int i=0;i<N.length();i++){
        if (N.charAt(i)==ch)
             count++;
    }
    return count;
 }  
    

 public static void main(String[] args){
    Scanner S= new Scanner(System.in);
    System.out.print("Enter your String: ");
    String Name=S.next();
    System.out.print("Enter charactor to count in a string: ");
    char ch=S.next().charAt(0);
    System.out.print("Charector Number: ");
     System.out.print(fun(Name,ch));
    
     S.close();
  }

}
