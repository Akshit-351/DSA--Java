import java.util.Scanner;

public class starprint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to star printing pattern");
        pattern();
    }

    public static void pattern() {
        int rows =1;
        while(rows<=5){
            System.out.print("*");
            int i = 5;
            while (i>rows){
                System.out.print(" *");
                i--;
            }
            System.out.println();
            rows++;
        }

    }
}
