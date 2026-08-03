class HGrandfather{
    String fname="Kashual";
    String lname="kumar!";
    void hgrandfather(){
        System.out.println("Grandfather Name is : "+fname+" "+lname);
    }
}
class HFather extends HGrandfather{
    String fname="Krishna";
    void hfather(){
        System.out.println("Father Name is: "+fname+" "+lname);
    }
}
class Hson extends HFather {
    String fname="Kamal";
    void hson(){
        System.out.println("Son name is: "+fname+" "+lname);
    }
}
class HDaughter extends HFather{
    String fname="Kashish";
    void hdaughter(){
        System.out.println("Daughter name iss: "+fname+" "+lname);
    }

}

public class Hybride_inheritance {
   public static void main(String args[]){
    HDaughter obj=new HDaughter();
    obj.hdaughter();
    obj.hfather();
    obj.hgrandfather();
  

   } 
}
