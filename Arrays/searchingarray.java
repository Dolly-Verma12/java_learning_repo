package Arrays;

public class searchingarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
//         for(int i=0; i <numbers.length;i++){
// if(numbers[i]==3){
//     System.out.println("your number is in : "+ i+"  index");break;
// }
//         }


// 2nd method
int count=0;
for(int a: numbers){
        if (a==4){
            System.out.println("Number is in "+ count +" index");break;
        }
        count++;
    }
    }
}
