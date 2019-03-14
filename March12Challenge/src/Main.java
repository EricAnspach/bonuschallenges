public class Main {

//    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    public static void main(String[] args) {

        boolean isTrue = false;
        int[] numbers = { 10, 15, 3, 1, 6, 16, 8 };
        int k = 17;

        for (int i = 0; i < (numbers.length-1); i++) {
            for (int j = (i+1); j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    isTrue = true;
                    break;
                }
            }
        }
        System.out.println(isTrue);
    }
}
