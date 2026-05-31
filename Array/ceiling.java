public class ceiling {
    static void Ceiling(int[] name ,int target){
        int start=0;
        int end=name.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>name[mid]){
                start=mid+1;
            }
            else if(target<name[mid]){
                end=mid-1;
            }
            else{
                System.out.println("index "+ mid);
                return;
            }
        }System.out.print("number is not these just highest number is: "+ start);
    }
    public static void main(String[] args){
        int[]array={1,2,3,4,5,6,12,23,34};
        int target=11;
        Ceiling(array, target);
    } 
}
