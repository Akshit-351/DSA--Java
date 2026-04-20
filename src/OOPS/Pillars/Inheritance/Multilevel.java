package OOPS.Pillars.Inheritance;

class Animals{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dogs extends Animals{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Dogs{
    void meow(){
        System.out.println("Cat Meow");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.bark();
        c1.meow();

    }
}
