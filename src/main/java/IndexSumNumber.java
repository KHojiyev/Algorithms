import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class IndexSumNumber {

    public static ArrayList<Answer> answers = new ArrayList<>();
    public static void main(String[] args) {


        int target = 23;
        int[] nums = new int[]{12, 23, 21, 2, 32, 6, 7, 8, 9, 10, 3, 0, 20, 21, 2, 65, -34, 57};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int i1 =i+1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    answers.add(new Answer(i, i1));
                }
            }
        }
        System.out.println(answers);


    }

     static class Answer {

        private int x;
        private int y;

        public Answer(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

         @Override
         public String toString() {
             return "Answer{" +
                     "x=" + x +
                     ", y=" + y +
                     '}';
         }
     }

}
