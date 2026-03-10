package OOPS.Constructor;

 class Student3{
     String name;
     int age;
     Student3(){

     }
     Student3(Student3 s) {
         this.name = s.name;
         this.age = s.age;
     }
 }

 public class CopyConstructor{
    public static void main(String[] args) {
        Student3 s1 = new Student3();
s1.name = "Akshit";
s1.age = 21;

        Student3 s2 = new Student3(s1);
System.out.println(s2.name);
System.out.println(s2.age);
    }
}
