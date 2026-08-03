import java.util.Arrays;

public class Findpositonelement {
    static int[] check(int[] array, int target){
        int[] ans = {-1,-1};
        ans[0] = find(array,target,true);
        if(ans[0] != -1){
            ans[1] = find(array,target,false);
        }
        return ans;
    }

    static int find(int[] array, int target, boolean check){
        int ans = -1;
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < array[mid]){
                end = mid - 1;
            } else if(target > array[mid]){
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
        int[] A = {1,2,3,4,4,4,5,6};
        int t = 8;
        System.out.println(Arrays.toString(check(A,t))); 
    }
}

