
public class MaxNumber {

    public static void main(String[] args) {

        int[] nums = new int[]{16, 25, 34, 43, 52, 36, 75, 66, 35,
                457, 375, 43, 35, 74, 7, 75, 34, 45, 43, 57, 5, 543,
                7, 5, 7};

        int result = getMaxNumber(nums);

        System.out.println(result);
    }

    private static int getMaxNumber(int[] nums) {
        if (nums.length == 0)
            return 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;

    }
}
