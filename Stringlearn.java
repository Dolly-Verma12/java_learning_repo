import java.util.Scanner;

public class Stringlearn {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    //creating string  Type 1:
          String type1="Dolly";

//     // creating string type 2:
       String type2= new String("Dolly-Verma");

//     //Creating String type 3:
      char[] arr={'D','o','l','l'};
        String type3 =new String(arr);

System.out.println(type1+"\n"+type2+"\n"+type3);
    
    // input as a string
    System.out.print("Enter your string: ");
      String name1=  input.nextLine();
       System.out.println("Your string is: "+name1);
         String name= "Dolly verma";
     //length method:    
       System.out.println(name.length());
    //equal method:
    System.out.println(name.equals("Dolly "));
     System.out.println(name.equals("Dolly verma"));
    // Compareto:
    System.out.println(name.compareTo("hello"));
    //Substring:
    System.out.println(name.substring(6));
    //char at
    System.out.print(name.charAt(4 ));


  input.close();   
}


}
