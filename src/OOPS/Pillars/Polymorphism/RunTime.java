package OOPS.Pillars.Polymorphism;

class Animal{
    void Sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog barks");
    }
}
public class RunTime {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.Sound();
    }
}
