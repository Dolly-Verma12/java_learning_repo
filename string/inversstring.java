package String;
public class inversstring {
// inverse  with string builder
static void stringbuilder(String str){
StringBuilder sb=new StringBuilder(str);
for(int i=0;i<sb.length()/2;i++){
  char front=sb.charAt(i);
  char back=sb.charAt(sb.length()-1-i);
  sb.setCharAt(i, back);
  sb.setCharAt(sb.length()-1-i, front);
System.out.println(front);
} System.out.println(sb);
 System.out.println(sb.toString()); 
}

      public static void inverse(String str){
    char[] nn=str.toCharArray();//string to char mai convert kr diya
            for(int i=0;i<nn.length/2;i++){
                char temp=nn[i];
              nn[i]=nn[nn.length-1-i];  
              nn[nn.length-1-i]=temp;
            }       
            System.out.println(nn);
               String newSt= new String(nn);
              System.out.println("your reverse string is: "+newSt);       
         }
    public static void main(String[] args){
       String name="hellow";
      inverse(name);
       stringbuilder(name);
    }
    
}
