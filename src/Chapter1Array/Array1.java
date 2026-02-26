package Chapter1Array;

public class Array1 {
    public static void main(String[] args) {
////        int[] arr; //Declaration
////        arr = new int[3]; //creation
//        int[] arr = new int[3]; // Declaration and Creation in single line
//        arr[0] = 101; // Initialization
//        arr[1] = 102;
//        arr[2] = 103;
        int[] arr = {101 , 102 , 103}; // Declaration , creation , Initialization in one line
        //Now we can retrieve using 3 methods by simple , for loop , for each loop
       // System.out.println(arr[2]); // simple
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int no : arr){            // for each loop
            System.out.println(no);
        }

    }
}
