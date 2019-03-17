import java.util.Arrays;

public class FirstMissingPositiveInteger {
    /*
    Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array.
    The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

    You can modify the input array in-place.
     */

    public static void main(String[] args) {

        int[] input = { 1, 2, 3, 7, -5, 4, 4, -98, 0, 7  };
        boolean lowestIntFound = false;
        int count = 0;

        Arrays.sort(input);

        do {
            count++;

            int index = Arrays.binarySearch(input, count);

            if (index < 0) lowestIntFound = true;

        } while (lowestIntFound == false);

        System.out.println(count);
    }
}
