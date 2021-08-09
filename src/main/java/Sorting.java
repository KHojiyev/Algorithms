
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {


        int[] nums = new int[]{23, 4435, 654, 74365, 3, 463, 346, 43, 234, 234, 54, 32, 46, 34, 6, 463, 4, 24, 6, 4, 6, 3246, 34, 63, 4};

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    nums[j] = nums[j] + nums[j + 1];

                    nums[j + 1] = nums[j] - nums[j + 1];

                    nums[j] = nums[j] - nums[j + 1];
                }
            }

            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));


    }
}
