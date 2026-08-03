public class Smallestletter {
    static char checkNearestGreatestIntger(char[]letter, char target){
        int start=0;
        int end=letter.length-1;
         while (start<=end) {
            int mid=start+(end-start)/2;
            if(target<letter[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
         }return letter[start%letter.length];

    }
    public static void main(String[] args){
        char[]array={'a','b','c'};
        char t='a';
      System.out.println(checkNearestGreatestIntger(array, t)); 
    }
    
}
