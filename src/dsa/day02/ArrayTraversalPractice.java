package dsa.day02;

public class ArrayTraversalPractice {
    public static void main(String[] args) {

        int[] arr = {4, 12, 7, 18, 3, 20};

        int count = 0;
        int sumEven = 0;
        int sumOddIndices = 0;

        for (int i = 0; i < arr.length; i++) {

            // Count elements greater than 10
            if (arr[i] > 10) {
                count++;
            }

            // Sum of even elements
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }

            // Sum of elements at odd indices
            if (i % 2 != 0) {
                sumOddIndices += arr[i];
            }
        }

        System.out.println("Count greater than 10: " + count);
        System.out.println("Sum of even elements: " + sumEven);
        System.out.println("Sum at odd indices: " + sumOddIndices);
    }
}