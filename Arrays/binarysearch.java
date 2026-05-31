package Arrays;

public class binarysearch {
    static void binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
           
             if(target<arr[mid]){
                    end=mid-1;
      
                }  
             else if(target>arr[mid]){
                    start=mid+1; 
                 
                }
            else{
              System.out.print("index: "+mid);
             return;
            }
        
            }      System.out.println("elemnt not found"); 
      
    }
     public static void main(String[] args){
        int[] num={-1,-2,3,11,23,34,45,56,67,89,98};
        int search=89;
        binarySearch(num, search);
     }
}
