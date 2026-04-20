package OOPS.Pillars.Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
