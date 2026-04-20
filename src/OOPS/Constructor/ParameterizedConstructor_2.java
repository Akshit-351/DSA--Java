package OOPS.Constructor;
// H/w example of parameterized example- create a class name student with 4 fields , Add para cons with method and create object with a different para
class Student_1{
    String name;
    int age;
    int rollNo;
    double marks;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollNo);
        System.out.println(this.marks);
    }
    Student_1(String name, int age , int rollNo, double marks){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
        System.out.println("Parameterized Constructor runs");
    }
}




public class ParameterizedConstructor_2 {
    public static void main(String[] args) {
        Student_1 s1 = new Student_1("Akshit",21 , 10, 85.555555);
        s1.printInfo();
    }
}
