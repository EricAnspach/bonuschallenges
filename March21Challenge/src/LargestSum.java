public class LargestSum {

    /*
    Given a list of integers, write a function that returns the largest sum
    of non-adjacent numbers. Numbers can be 0 or negative.

    For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
    [5, 1, 1, 5] should return 10, since we pick 5 and 5.
    */

    public static void main(String[] args) {

        int[] input = { 2, 4, 6, 2, 5 };
        int highestSum = 0;

        // make loops that cycle through all possible combinations of the input values and total them, while insuring
        // that there are never two values with consecutive indexes in the collection of input values

        for(int i = 0; i < input.length; i++) {
            int sum = 0;

            // Trying to figure out how to cycle through all possibilities for a sum, given that the length of the
            // input array can vary and is not known, and that negative values can be included in the array.

            // Will need to do more research on ways that the lengths of loops can vary based on length of input array.

            if (highestSum < sum) {
                highestSum = sum;
            }
        }
        System.out.println(highestSum);
    }
}
