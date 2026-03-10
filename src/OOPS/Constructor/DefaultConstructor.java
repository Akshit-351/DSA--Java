package OOPS.Constructor;
// Default Constructor - Constructor without parameters
class DefaultConstructor_Example {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    DefaultConstructor_Example(){
        System.out.println("Default Constructor Called");
    }
}
public class DefaultConstructor{
    public static void main(String[] args) {
        DefaultConstructor_Example e1 = new DefaultConstructor_Example();
        e1.name = "Akshit";
        e1.age = 21;

        e1.printInfo();
    }
}
