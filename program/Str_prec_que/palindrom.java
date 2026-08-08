package Str_prec_que;
import java.util.Scanner;

public class palindrom {
     public   static void check(String N){
        boolean ispalindrome=true;
        for(int i=0;i<N.length()/2;i++){
             char F=N.charAt(i);
            if(F!=N.charAt(N.length()-1)){
                 ispalindrome=false ;   
            }
        }if(ispalindrome){
          System.out.println(N+" is Palindrome");
        }else{
            System.out.println("Not Palindorme");
        }

     }
    public static void main(String[] args){
        Scanner S= new Scanner(System.in);
        System.out.print(" Enter String: ");
        String n=S.nextLine();
        check(n);
        S.close();
    }
    
}
