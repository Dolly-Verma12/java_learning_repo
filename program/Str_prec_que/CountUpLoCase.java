package Str_prec_que;
import java.util.Scanner;

public class CountUpLoCase {

    public static void main(String[] args){
     Scanner S=new Scanner(System.in);
     System.out.print("Enter String: ");
     String Name=S.nextLine();
    Count.fun(Name); 
     S.close(); 
    }
   
  
} 
class Count{
         static void fun(String N){
           int upper=0;
           int lower=0;
            for (int i=0;i<N.length();i++){
                if(Character.isUpperCase(N.charAt(i))){      
                           upper++;
                }
                if(Character.isLowerCase(N.charAt(i))){
                        lower++;
            }
        }
            System.out.println("Upper: "+upper);
            System.out.println("Lower: "+lower);
        }
    }
