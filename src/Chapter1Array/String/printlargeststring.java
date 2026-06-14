package Chapter1Array.String;

public class printlargeststring {
    public static void main(String[] args) {
        String fruit[] = {"Apple", "mango", "banana"};
        String largest = fruit[0];
        for (int i = 1; i<fruit.length; i++){
            if(largest.compareTo(fruit[i])<0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
