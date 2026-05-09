import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter you first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = obj.nextInt();
        int a = num1,b= num2;
        while(b!=0){
          int temp=b;
            b=a%b;
            a= temp;
        }System.out.println("HCF is: " +a);
        int lcm=num1*num2/a;
        System.out.println("LCM is: "+lcm);
        }

}
