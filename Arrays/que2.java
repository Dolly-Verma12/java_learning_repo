package Arrays;
public class que2 {
    static void question(char[]str, char target){
       int start=0;
       int end=str.length;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(target<str[mid]){
            end=mid-1;
        }else if(target>str[mid]){
            start=mid+1;
        }
        else{
            System.out.print("Your target "+target+" index is: "+mid);
            return;
        }
       }
       System.out.println("Output: "+ str[start]);
    }
    public static void main(String[] args){
        char[] arr={'a','b','c','e'};
        char target='d';
        question(arr, target);

    }
}
