package Chapter1Array.String;

public class charAtmethod {
    //String charAt method
    public static void printLetters(String str){
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Akshit";
        String lastName = "Chaudhary";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);

    }
}
