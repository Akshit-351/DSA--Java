package OOPS.Constructor;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Constructor Called");
    }
}

    //class Student {
//
//    public void printInfo(){
//        System.out.println("Hello All");
//    }
//
//    Student(){
//        System.out.println("Constructor Called");
//    }
//}
//
//    public class ConstructorExample {
//        public static void main(String[] args) {
//            Student s1 = new Student();
//            Student s2 = s1;
//            s2.printInfo();
//        }
//    }
    public class ConstructorExample_1 {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Akshit";
            s1.age = 20;

            s1.printInfo();
        }
    }
