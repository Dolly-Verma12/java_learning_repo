import java.util.Scanner;

public class leapyear{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter Number:");
        String year =obj.nextLine();
        if (year.length() !=4){
            System.out.println("Please Enter  Year in 4 digit ");
        }else{
            int num=Integer.parseInt(year);
            if (num%4==0){
                System.out.println(year+ " is a leap year");

            }else{
                System.out.println( year+"  is not a leap year");
            }
        }
    }
}