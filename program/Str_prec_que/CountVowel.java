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
        String V="aeiou";
         int count=0;
         int Add=0;
       for (int i=0;i<N.length();i++){
         char ch=Character.toLowerCase(N.charAt(i));
            if(V.indexOf(ch)!=-1){
                count++;     
           }else if(Character.isLetter(ch)){
            Add++;
           }
       }System.out.println(count);
       System.out.println(Add);
    }
    }