package Str_prec_que;
import java.util.Scanner;
public class StrAnagrams {
    static void check(String S1,String S2){
        boolean isA=true;
        if( S1.length()!=S2.length()){
            isA=false;
        }
    else{
        for(int i=0;i<S1.length();i++){ 
            char ch=S1.charAt(i); 
            
        int count1=0;
        int count2=0;
         
        for(int j=0;j<S1.length();j++){
             if(ch==S1.charAt(j)){
                count1++;
             }
        }
        for(int j=0 ;j<S2.length();j++){
             if(ch==S2.charAt(j)){
                count2++;
             }
        }        
          if(count1!=count2){
            isA=false;
            break;
          }
               if(S2.indexOf(ch)!=-1){
                  isA=true;                
               }  else{
                isA=false;
                break;
               }             
    }   
    }      if(isA){
        System.out.println("yes ");
     }else{
        System.out.println("Not");
     }
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter you String1: ");
        String Str1=S.next();
        System.out.print("Enter you String1: ");
        String Str2=S.next();
        check(Str1,Str2);
        S.close();
    }
    
}
