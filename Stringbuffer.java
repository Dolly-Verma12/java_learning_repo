public class Stringbuffer {

    public static void main(String[] args) throws InterruptedException{
    StringBuffer name1= new StringBuffer();
    // StringBuffer name= new StringBuffer("Hello");//String buffer
    StringBuilder name=new StringBuilder("hello");//String bulider
    System.out.println("default-capacity: "+name1.capacity());
    System.out.println("append: "+name.append(" World !!!"));
    System.out.println("insert: "+name.insert(6,"Java "));
    System.out.println("delete: "+name.delete(17,18));
    System.out.println("reverse: "+name.reverse());
    System.out.println("Again reverse: "+name.reverse());
    System.out.println("replace: "+name.replace(15,16,"//"));
      name.ensureCapacity(20);
System.out.println("ensureCapacity: " + name.capacity());
//thread
      StringBuffer buffr= new StringBuffer();
        Thread t1 = new Thread(() -> buffr.append("A"));
        Thread t2 = new Thread(() -> buffr.append("B"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(buffr.toString()); // Output: AB or BA (depends on thread scheduling)
    

    }
}
