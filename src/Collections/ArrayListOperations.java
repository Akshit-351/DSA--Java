package Collections;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // Adding elements
        names.add("Akshit");
        names.add("Ajay");
        names.add("Arya");
        System.out.println("All the elements are :"+names);
        // Access elements
        System.out.println("Element at 1 index is: " +names.get(1));
        //update or replace elements
        names.set(2 , "Akki");
        System.out.println("After update elements :"+ names);
        //Removing elements
        names.remove(2);
        System.out.println("After remove :"+names);
        //check element exists
        System.out.println("Is Akshit name exist : "+ names.contains("Akshit"));
    }
}
