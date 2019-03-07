public class RotateLeft {

    public static void main(String[] args) {

        int[] nums = { 2, 0, 7, 6, 3, 9 };

        System.out.println();

        nums = rotateLeft3(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int[] rotateLeft3(int[] nums) {

        int firstNum = nums[0];

        for (int i = 0; i < (nums.length - 1); i++) {
            nums[i] = nums[i+1];
        }

        nums[nums.length - 1] = firstNum;
        return nums;
    }

}


