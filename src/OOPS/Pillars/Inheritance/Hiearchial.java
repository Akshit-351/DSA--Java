package OOPS.Pillars.Inheritance;

class Lion{
    void eat(){
        System.out.println("Lion Eats");
    }
}
class Rawr extends Lion{
    void sound() {
        System.out.println("Lion rawrrrr...");
    }
}
class Run extends Lion{
    void speed(){
        System.out.println("Lion runs very fast");
    }
}
public class Hiearchial {
    public static void main(String[] args) {
        Rawr r1 = new Rawr();
        r1.eat();
        r1.sound();
        Run r2 = new Run();
        r2.eat();
        r2.speed();
    }
}
