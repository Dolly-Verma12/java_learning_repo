package Str_prec_que;

public class ReturnDuplicateChar {
    static String check(String str){
        StringBuilder re=new StringBuilder();
      for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
           for(int j=0;j<str.length();j++){
               if(i!=j && ch==str.charAt(j) && re.indexOf(String.valueOf(ch))==-1){
                  re.append(ch);          
               } 
           }
      }
      return re.toString();
    }
     
    public static void main(String[] args){
        String s="kirnnnraan";
        System.out.println(check(s));
    }
    
}
