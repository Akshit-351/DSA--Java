package Recursion;

public class lastoccurrenceofanelement {
    public static int lastoccurrence(int arr[],int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastoccurrence(arr,i+1,key);
            if (isfound == -1 && arr[i] == key){
                return i;
            }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(lastoccurrence(arr,0,key));
    }
}
