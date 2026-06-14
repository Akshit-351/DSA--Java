package BitManipulation;

public class swaptwonousingbit {
    public static void main(String[] args) {
        int a = 5, b = 6;
         //swap two numbers a nd b a^b = 011
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);
    }
}
