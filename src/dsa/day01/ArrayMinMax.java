
package dsa.day01;

public class ArrayMinMax {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 30, 8, 2, 25};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
