// 1. Java Revision - Welcome Program
// Topic: Input & Output using Scanner
import java.util.Scanner;
public class javaRevision_Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome "+name+"to coding world");
    }

}
