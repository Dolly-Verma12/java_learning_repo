
public class que {
    static void fun(int[][] arr){  
int index=-1;
int max=Integer.MIN_VALUE;
for (int row=0;row<arr.length;row++){
        int sum=0;
for(int col=0;col<arr[row].length;col++){
sum+=arr[row][col];
}
System.out.println("Row "+row+" total is: "+sum);
if(sum>max){
    max=sum;
    index++;
}

}System.out.println("Maximam Sum in "+index+" index");
 }
    public static void main(String[] args){
        int[][] num={
            {1,2,3},{1,3,5,3},{9,7,8,6},{1,2}
        };
        fun(num);
    }
    
}
