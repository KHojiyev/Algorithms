package develop.fizbuzz;

import java.util.Scanner;

public class FizBuzz {

    public static void main(String[] args) {

        while (true) {
            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            boolean isNumber = scanner.hasNextInt();
            if (!isNumber) {
                System.out.println("Son emas");

            }else
            checkNumber(scanner.nextInt());

        }
    }
        private static void checkNumber (Integer number){

            boolean fizz = number % 3 == 0;
            boolean buzz = number % 5 == 0;

            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }


        }


}
