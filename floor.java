public class floor {
    static void floorfun(int[] arr ,int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                System.out.println("index of the number: "+mid);
            }       
        }System.out.println("Num is not there So last smallest num index is: "+end);

    }
    public static void main(String[] args){
        int []arr={1,2,3,4,5,9,10,11,23};
        int target=22;
        floorfun(arr, target );
    }

}
