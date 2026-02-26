package OOPS;
class Pen{
    String color;
    String type;
    public void write() {
        System.out.println("Writing Something");
    }
        public void Color(){
            System.out.println(this.color);
        }
        public void Type(){
            System.out.println(this.type);
        }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball";

        pen1.write();

        pen1.Color();
        pen2.Color();
        pen1.Type();
        pen2.Type();
    }
}
