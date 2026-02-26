package OOPS;

public class UserDefinedDataTypes {
    public static class Student{
        String name;
        int rollno;
        double cgpa;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Akshit";
        s1.rollno = 12;
        s1.cgpa = 8.98;

        Student s2 = new Student();
        s2.name = "Shitij";
        s2.rollno = 23;
        s2.cgpa = 8.78;

        Student s3 = new Student();
        s3.name = "Ajay";
        s3.rollno = 42;
        s3.cgpa = 8.3;

        System.out.println(s1.name + " of" + " rollno " + s1.rollno + " has " + s1.cgpa + " cgpa" );
        System.out.println(s2.name + " of" + " rollno " + s2.rollno + " has " + s2.cgpa + " cgpa" );
        System.out.println(s3.name + " of" + " rollno " + s3.rollno + " has " + s3.cgpa + " cgpa" );
    }
}
