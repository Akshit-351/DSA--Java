package OOPS.Pillars.Polymorphism;

class MathOperation{
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }
}
public class CompileTime {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(2,4));
        System.out.println(m.add(2,5,4));
    }
}
