public class Animalfamily {
   public static void main(String[] args){
    Dog d= new Dog("Tommy",3,"Brown","Labrdog");
    d.display();
    d.Eat();
    d.Sleep();
    d.breed();
   } 
}
class Animal{
    String Name;
    int age;
    String Colour;
Animal(String n, int a, String c){
    this.Name=n;
    this.age=a;
    this.Colour=c;
}
void display(){
    System.out.println("Name: "+Name);
    System.out.println("Age: "+age);
    System.out.println("Colour: "+Colour);
}
void Eat(){
    System.out.println(Name+" is Eating!!");
}
void Sleep(){
    System.out.println(Name+ "is Sleeping!!");
}
}
class Dog extends Animal{
    String breed;
    Dog(String n,int a, String c, String b){
        super (n,a,c);
        this.breed=b;
    }
    void breed(){
        System.out.println("Breed: "+breed);
    }
    void bark(){
        System.out.println(Name+" is Barking!!");
    }
}
class Cat extends Animal{
    String type;
    Cat(String n,int a, String c ,String t){
        super(n,a,c);
        this.type=t;
    }
    void type(){
        System.out.println("Type: "+type);
    }
    void sound(){
        System.out.println(Name +" is Meow");
    }
}