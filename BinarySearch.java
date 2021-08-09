package developer.maxnumber;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = new int[]{23, 4435, 654, 74365, 3, 463, 346, 43, 234, 234, 54, 32, 46,
                34, 6, 463, 4, 24, 6, 4, 6, 3246, 34, 63, 4};
        sorting(nums);
        Scanner scanner = new Scanner(System.in);
        int searchNum = scanner.nextInt();

        int index = binarySearching(nums, searchNum);
        int index2 = recursiveBinarySearching(nums,0,nums.length-1,searchNum);

       System.out.println(index);
        System.out.println("-------------------------------------");
        System.out.println(index2);

    }

    private static void sorting(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    count++;

                    nums[j] = nums[j] + nums[j + 1];

                    nums[j + 1] = nums[j] - nums[j + 1];

                    nums[j] = nums[j] - nums[j + 1];

                }
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
    }

    private static Integer binarySearching(int[] nums, int searchNum) {

        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        int count = 0;
        while (firstIndex <= lastIndex) {
            count++;
            System.out.println("process: " + count);
            int midIndex = (firstIndex + lastIndex) / 2;

            if (nums[midIndex] == searchNum) {
                return midIndex;
            } else if (nums[midIndex] > searchNum) {
                lastIndex = midIndex - 1;
            } else if (nums[midIndex] < searchNum)
                firstIndex = midIndex + 1;

        }

        return -1;


    }

    public static Integer countRec  = 0;
    private static Integer recursiveBinarySearching(int[] nums, int firstIndex, int lastIndex, int searchNum) {



        if (firstIndex <= lastIndex) {
            countRec++;
            System.out.println("Proc: "+countRec);
            int midIndex = (firstIndex + lastIndex) / 2;

            if (nums[midIndex] == searchNum) {
                return midIndex;
            } else if (nums[midIndex] > searchNum) {
                return recursiveBinarySearching(nums, firstIndex, midIndex - 1, searchNum);
            } else if (nums[midIndex] < searchNum)
                return recursiveBinarySearching(nums, midIndex + 1, lastIndex, searchNum);
        }

        return -1;


    }
}
