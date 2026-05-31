
public class evennum_array {

    static void Findeven(int[] num){
        int count=0;
for(int i=0;i<num.length;i++){
    if( num[i]%2==0){
        System.out.println("num:"+num[i]+"");
        count++; 
    }
}System.out.println("Total even number is in array: "+count);
    }


public static void main(String[] args){

    int[] arr={1,2,6,12,36};
    Findeven(arr);
}
    
}
