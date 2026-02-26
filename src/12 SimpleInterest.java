import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest calculator \n");
        System.out.print("Please enter your principle amount Rs");
        int Principle = input.nextInt();
        System.out.print("Now,Tell me your rate of Interest : ");
        float rate = input.nextFloat();
        System.out.print("Now tell me time in years: ");
        float years = input.nextFloat();
        float interest = (Principle*rate*years)/100;
        System.out.println("Your Simple Interest is : "+interest);
    }
}
