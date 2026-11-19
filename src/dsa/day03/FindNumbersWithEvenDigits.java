
package dsa.day04;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i];

            while (num != 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Numbers with even digits: " + evenCount);
    }
}
