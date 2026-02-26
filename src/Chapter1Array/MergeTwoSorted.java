package Chapter1Array;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int[] a = {2,5,6,9};
        int[] b = {1,3,4,5,7,8};
        int n = a.length+ b.length;
        int[] c = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
        for (int num:c){
            System.out.print(num+" ");
        }
    }
}
