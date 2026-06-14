package CompleteRevision;

public class Movingzeroes {
    public static void main(String[] args) {
        int arr[] = {1 , 0 , 2 ,5,0 , 6, 0 ,7};
        int k = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]!=0){
                arr[k] = arr[i];
                k++;
            }
        }
        while (k<arr.length){
            arr[k] = 0;
            k++;
        }
        for (int x: arr){
            System.out.print (x);
        }
    }
}
