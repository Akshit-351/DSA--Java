package Chapter1Array.String;

public class StringFunctionCompare {
    public static void main(String[] args) {
        String s1 = "Akshit";
        String s2 = "Akshit";
        String s3 = new String("Akshit");
        if (s1 == s2){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
        if (s1 == s3){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
}
