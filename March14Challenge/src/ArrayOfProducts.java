import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOfProducts {
    /*
    Given an array of integers, return a new array such that each element at index i of the new array
    is the product of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
    If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    */
    public static void main(String[] args) {

        int[] input = { 1, 2, 3, 4, 5 };
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            List<Integer> inputList = Arrays.stream(input).boxed().collect(Collectors.toList());
            int product = 1;
            for (int j = 0; j < inputList.size(); j++) {
                int num = inputList.get(j);
                if (j != i) {
                    product *= num;
                }
            }
            output[i] = product;
        }

        for (int o : output) {
            System.out.print(o + " ");
        }
    }
}
