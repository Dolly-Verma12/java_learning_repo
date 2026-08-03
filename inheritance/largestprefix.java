public class largestprefix {
    public static void main(String[] args){

   String[] str={"karan","jpl","ris"};
      String sb= new String(str[0]);
      for(int j=0;j<sb.length();j++){
        for(int i=0;i<str.length;i++){
            if(sb.charAt(j)==str[i].charAt(i)){
                System.out.print(sb.charAt(i));
            }
      }  
   }System.out.print("\" \""); 
    }
}
 