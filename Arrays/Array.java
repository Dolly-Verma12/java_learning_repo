package Arrays;

 import java.util.Scanner;
  import java.util.Arrays;
 public class Array{
    public static void main(String[] args){
 Scanner input = new Scanner(System.in);
System.out.print("enter your name: ");
String name= input.nextLine();
System.out.println("Your name is: "+name);

// print array
int[]array= new int[5];
array[0]=10;
array[1]=11;
array[2]=21;
array[3]=13;
array[4]=24;
for(int a: array){ 
System.out.print("  "+a);

}System.out.println();
System.out.println("4th index element is: "+array[4]);

// 1D array input
int[] arrary2= new int[5];
  System.out.print("enter ur array::");
for(int i=0; i<arrary2.length; i++){
arrary2[i] =   input.nextInt();
}
for(int a: arrary2){ 
System.out.print("  "+a);

}System.out.println();
System.out.println(" print toString method ");
System.out.println(Arrays.toString(arrary2));

//2D array
int[][] array2d= new int[3][3];
System.out.print("enter your 3x3 metrix:  ");
for (int row=0; row <array2d.length; row++){
for(int col=0; col<array2d[row].length;col++){
   array2d[row][col]=input.nextInt();
}
}
System.out.println(" Your 2D Array:  ");
for (int row=0; row <array2d.length; row++){
for(int col=0; col<array2d[row].length;col++){
    System.out.print(array2d[row][col]+" ");

 }//System.out.println(Arrays.toString(array2d[row]));
System.out.println();
}

//printing array for 2nd method
System.out.println("Print metrix by for each loop:");
for(int[] a:array2d){
    for(int element: a){
     System.out.print(element + " ");
    }System.out.println();
  
}
  input.close();
    } 
}