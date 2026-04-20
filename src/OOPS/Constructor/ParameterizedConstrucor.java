package OOPS.Constructor;
 //Default Constructor - Constructor without parameters
class ParameterizedConstructor_Example {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    ParameterizedConstructor_Example(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }
}
public class ParameterizedConstrucor {
    public static void main(String[] args) {
        ParameterizedConstructor_Example e1 = new ParameterizedConstructor_Example("Akshit" , 21);

        e1.printInfo();
    }
}


// OR 2nd example
//class ParameterizedConstructor_Example {
//    String name;
//    int age;
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
//    ParameterizedConstructor_Example(String name , int age){
//        this.name = name;
//        this.age = age;
//        System.out.println("Parameterized Constructor Called");
//    }
//}
//public class ParameterizedConstrucor {
//    public static void main(String[] args) {
//        ParameterizedConstructor_Example e1 = new ParameterizedConstructor_Example("Akshit" , 21);
//
//        System.out.println(e1.name);
//        System.out.println(e1.age);
//    }
//}

