package Chapter1Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {29, 24, 34, 35, 1, 57, 24};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < secondMax && arr[i] >= thirdMax) {
                    thirdMax = arr[i];
                }
            }

                System.out.println("Second Largest: " + secondMax);
                System.out.println("Third Largest: " + thirdMax);
        }
    }
