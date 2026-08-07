package Str_prec_que;
import java.util.Scanner;
public class CountVowel {

 public static void main(String [] args){
  Scanner S=new Scanner(System.in);
  System.out.print("Enter Strings: ");
  String Name=S.nextLine();
  Count ct=new Count();
  ct.fun(Name);
    

  S.close();
 }
}
class Count{
    static void fun(String N){
        char[] V={'A','E','I','O','U','a','e','i','o','u'};
         int count=0;
       for (int i=0;i<N.length();i++){
           for(int j=0;j<V.length;j++){
            if(N.charAt(i)==V[j]){
                count++;
            }
           }
       }System.out.println(count);
    }
    }