
package dsa.day04;

public class ReplaceElements {
    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        arr[arr.length - 1] = -1;

        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
