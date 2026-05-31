package Arrays;
import java.util.Scanner;
public class Searching2d{

//max value function
public static void max(int[][] arr){
    int[][] num=arr;
    int high=arr[0][0];
    for(int[] a: num){
        for(int ele:a){
          if(ele>high){
            high=ele;
          }
        
        }  System.out.print("highest value is:"+high);break;
    }
}
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
System.out.print("Enter your metrix rows: ");
int row=input.nextInt();
System.out.print("Enter your metrix cols: ");
int col=input.nextInt();
int[][] metrix= new int[row][col];
//input metrix
System.out.println(" Enter Your Metrix:");
for( row=0; row<metrix.length;row++ ){
    for( col=0;col<metrix[row].length;col++){
       metrix[row][col]=input.nextInt(); 
    }
}
//printing metrix
 System.out.println("Your Metrix is:");
 for( row=0; row<metrix.length;row++ ){
    for(col=0;col<metrix[row].length;col++){
       System.out.print(" " +metrix[row][col]); 
    }System.out.println();
}
//searching
  System.out.print("Enter Your Number for finding :");
  int num=input.nextInt();
 System.out.println("Your Finding Number is:");
 for( row=0; row<metrix.length;row++ ){
    for(col=0;col<metrix[row].length;col++){
        if(metrix[row][col]==num){
       System.out.println(" Number  is in  " +"("+row+","+col+")"+" Index"); 
        }
    }System.out.println();
}
max( metrix);

input.close();
    }
}