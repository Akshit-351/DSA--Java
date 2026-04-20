package Chapter1Array.String;

import java.util.Scanner;

public class string {
    //String charAt method
    public static void printLetters(String str){
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        char arr[] = {'a','b','c','d'};
//        String s1 = "abcd";
//        String s2 = new String("Akshit");
//        Scanner sc = new Scanner(System.in);
//        String name;
//        //name = sc.next();
//        name = sc.nextLine();
//        System.out.println(name);
        // String Length
        String Name = "Akshit";
        System.out.println(Name.length());
        //String Concatenation
        String firstName = "Akshit";
        String lastName = "Chaudhary";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

    }
}
