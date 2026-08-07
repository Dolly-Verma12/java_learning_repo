public class ordercheck {

     static void fun(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    System.out.print(target+" index is: "+mid);
                    return;
                }
            }
            System.out.println("accending");
            
        }
        else {
             while(start<=end){
               
                int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    System.out.print(target+" index is: "+mid);
                    return;
                }
            }
        }
        System.out.println("Element not in this array!!");
    }
    public static void main(String[] args){
       // int [] array={-1,2,2,3,5,6,7,8,9,10,23};//accending order 
        int [] array2={23,12,11,9,8,7,6,5,4,3,2,1};
       int target=8;
    fun(array2,target);
    }
    
}
