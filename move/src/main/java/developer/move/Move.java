package developer.move;

import java.util.Arrays;

public class Move {


    public static void main(String[] args) {


        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};

        move(numbers, 4, -2);

        System.out.println(Arrays.toString(numbers));
    }

    private static void move(int[] nums, int index,int offset){
        if (index+offset>=nums.length || index+offset < 0)
            System.out.println("given offset is not valid ");
        int temp = nums[index];
        nums[index] = nums[index+offset];
        nums[index+offset] = temp;
    }







}
