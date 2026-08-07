package Arrays;
public class Count{
static int find(int [] A, int target){
   int[] ans={-1,-1};
   int sum=0;
    ans[0]=checkMethod(A ,target , true);
    ans[1]=checkMethod(A,  target , false);
    sum=ans[1]-ans[0]+1;
 return sum;
}
static int checkMethod(int[] A, int target, boolean check){
   int ans = -1;
        int start = 0;
        int end = A.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < A[mid]){
                end = mid - 1;
            } else if(target > A[mid]){
                start = mid + 1;
            } else {
                ans = mid; 
                if(check){
                    end = mid - 1; // first occurrence
                } else {
                    start = mid + 1; // last occurrence
                }
            }
        }
        return ans;
}
public static void main(String[] args){
    int []a={1,2,3,3,3,3,4,5};
    int target=3;
  System.out.println(find(a, target));  ;
}
}
