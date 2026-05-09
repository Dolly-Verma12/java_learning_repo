import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // input Strings value
//        Scanner obj = new Scanner(System.in);
// String name_1,name2;
//    System.out.print("Enter your first Name: ");
// name_1 = obj.next();
//  System.out.print("Enter your last Name: ");
// name2 = obj.next();
// System.out.println("Hello : " +name_1+name2);

// input integer values
Scanner obj2 = new Scanner(System.in);
System.out.println("Enter Numbers for Calculaton");
int num1,num2;
System.out.print("Enter number 1: ");
num1=obj2.nextInt();
System.out.print("Enter number 2: ");
num2=obj2.nextInt();
System.out.println("Addition is: "+(num1+num2));
System.out.println("Multiplication is: "+num1*num2);
System.out.println("Division is: "+num1/num2);
    }
}
