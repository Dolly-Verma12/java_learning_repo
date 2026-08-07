package Arrays;
public class searchinfinitearray {
    static int fun(int[]A, int t ){
        int start=0;
        int end=1;
        while(t>A[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
              start=temp;
        }return (fun2(A,t,start,end));
    }
    static int fun2(int[]A, int t, int start,int end){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t<A[mid]){
                end=mid-1;
            }else if(t>A[mid]){
                start=mid+1;
            }else{
             return mid;
            }
        }return ans;
    } 
    public static void main(String[] args){
int []A={10,12,13,14,15,16,17,18,19,20,21,22,23,45,67,78,89};
int t=90;
System.out.println(fun(A,t));
}
}
