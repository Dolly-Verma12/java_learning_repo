import java.util.Arrays;
import java.util.Scanner;
public class maxsum{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);  
    int t=input.nextInt();
    int st=0;  
    while(st<t){
       int sum=0;
      System.out.print("enter: ");
    int n=input.nextInt();
    int[]A= new int[n];  
    for(int i=0;i<A.length;i++){
      A[i]=input.nextInt();
    }
     Arrays.sort(A);  
     for(int j=n-1;j>=0;--j){     
      if(A[n-1]==A[j]){
        continue;
      }else{
      sum=A[n-1]+A[j];
      System.out.println(A[n-1]+" "+A[j]);
      break;
      }       
     }  System.out.println("sum"+sum); 
st++;
    }
     
input.close();
  }
}