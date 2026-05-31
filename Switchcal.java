 import java.util.Scanner;

 public class Switchcal{
    public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.print("Enter first number:");
int num1=obj.nextInt();
System.out.print("Enter second number:");
int num2=obj.nextInt();
System.out.print("Enter operator(+,*,/,-_):"); 
char op=obj.next().charAt(0);
switch (op){
    case '+':
        System.out.println("Addition is:"+(num1+num2));
        break;
    case '-':
        System.out.println("Sbtraction is:"+(num1-num2));
        break;
     case'*':
        System.out.println("Multiplication is:"+(num1*num2));
        break;
    case '/':
        System.out.println("Division is:"+(num1/num2));
        break;

    default:
        System.out.println("Invalid operator!!");
        break;
}
obj.close();
}
 }

