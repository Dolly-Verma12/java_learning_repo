public class Hierarical_Inheritance {
    public static void main(String args[]){
   Son1 S=new Son1();
   S.son1();
   S.father();
   Son2 S2=new Son2();
   S2.son2();
    }
}
class Father{
String Fname="Raja ";
String Lname="Verma";
void father(){
    System.out.println("Father Name:"+Fname+Lname);
}
}
class Son1 extends Father{
    String Fname="Ram ";
    void son1(){
        System.out.println("1st Son name is : "+Fname+Lname);
    }
}
class Son2 extends Father{
    String Fname="Lakhan";
    void son2(){
        System.out.println("2nd Son is : "+Fname+Lname);
    }
}

