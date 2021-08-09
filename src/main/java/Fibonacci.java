
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        fibonacci(number);

    }

    private static void fibonacci(int number) {

        int first = 0;
        int second = 1;
        int sum = 0;
        String result = "";
        if (number<=1)
            System.out.println(number);
        for (int i = 0; i < number; i++) {
        result += first +" ";
        sum = first + second;
        first = second;
        second = sum;
        }


        System.out.println("Sum: "+ sum);
        System.out.println("Result: "+ result);
    }
}
