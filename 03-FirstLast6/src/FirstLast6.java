public class FirstLast6 {

    public static void main(String[] args) {

        int[] nums = { 7, 4, 6 };

        System.out.println();
        System.out.println(firstLast6(nums));

    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}
