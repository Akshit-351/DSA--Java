package OOPS.Constructor;

class Student1 {

    public void printInfo(){
        System.out.println("Hello All");
    }

    Student1(){
        System.out.println("Constructor Called");
    }
}

public class ConstructorExample_2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = s1;
        s2.printInfo();
    }
}