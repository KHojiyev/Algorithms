package developer.showprimenumbers;

import java.util.Scanner;


public class primeNumbers {
    public static void main(String[] args) {
        while (true) {

            System.out.print("enter number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();


            for (int i = 2; i <= number; i++) {
                boolean status = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        status = false;
                        break;
                    }
                }
                if (status){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
