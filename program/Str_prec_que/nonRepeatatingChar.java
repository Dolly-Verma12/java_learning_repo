package Str_prec_que;

import java.util.Scanner;
public class nonRepeatatingChar {  
    static void fun(String st){    
        char ab=' ';       
      for(int i=0;i<st.length();i++){
         char ch=st.charAt(i);
         boolean ct=false;
          for(int j=0;j<st.length();j++){
            char ch2=st.charAt(j);
            if(i!=j&& ch==ch2){
                ct=true;
               break;      
            }  
          }if(!ct){
            ab=ch;
            break;
          }
      } 
        System.out.println(ab);     
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter : ");
        String st=s.next();
        fun(st);
        s.close();
    }
}
