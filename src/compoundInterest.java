import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound Interest calculator");
        System.out.print("Please enter Principle amount in Rs");
        int Principle = input.nextInt();
        System.out.print("Now, Enter rate of interest: ");
        float rate = input.nextFloat();
        System.out.print("Now tell me time in years: ");
        float years = input.nextFloat();
        double interest = Principle* Math.pow((1+rate/100),years);
        System.out.println("Your compound Interest is : "+interest);

    }
}
