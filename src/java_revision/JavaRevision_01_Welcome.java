package java_revision;

import java.util.Scanner;

public class JavaRevision_01_Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome "+name+ " to coding world");
    }

}
