 public class mountainpeak{
     static int fun(int[]array){
     int start =0;
     int end =array.length-1;
     while(start<end){
        int mid=start+(end-start)/2;
        if(array[mid]>array[mid+1]){
            
            end=mid;
        }else  {
             start=mid +1;
        } 
     }return start;
     }
     public static void main(String[] args){
      int[] array={1,2,4,5,6,7,4,3,1,0};  
       int a=fun(array);
       System.out.print(a);
     }
}







