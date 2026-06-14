package Recursion;

public class firstoccurrrenceofanelement {
    public static int firstoccurrence(int arr[],int i,int key){
        if(arr[i] == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
       return firstoccurrence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,7,10,2,3};
        int key = 5;
        System.out.println(firstoccurrence(arr,0,key));
    }
}
