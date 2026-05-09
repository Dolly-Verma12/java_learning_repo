import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // input Strings value
       Scanner obj= new Scanner(System.in);
String name_1,name2;
   System.out.print("Enter your first Name: ");
name_1 = obj.next();
 System.out.print("Enter your last Name: ");
name2 = obj.next();
System.out.println("Hello : " +name_1+name2);
    }
}
