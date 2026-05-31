public class TraverseString{
    public static void find(String name,char ele){
for(int i =0; i< name.length(); i++ ){
if (name.charAt(i)==ele){
 System.out.println(i);
}   
}
    }
    public static void main(String[] args){

String name1="welcome to java program";
System.out.println(name1);
char ele='e';
find(name1,ele);

    }
}