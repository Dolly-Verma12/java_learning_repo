public class Multilevel_Inhertance {

    public static void main(String[] args) {
        Son obj = new Son();
        obj.mson(); 
        obj.mfather();
       
    }
}

class GrandFather {
    String fName = "Kishore";
    String lName = "Kumar";
    void grandFather() {
        System.out.println("GrandFather Name: " + fName + " " + lName);
    }
}

class MFather extends GrandFather {
    String fName = "Lakhan";
    void mfather() {
        System.out.println("Father Name: " + fName + " " + lName);
    }
}

class Son extends MFather {
    String fName = "Krishna";
    void mson() {
        System.out.println("Son Name: " + fName + " " + lName);
    }
}