import java.util.Scanner;

public class CheckSpeed {
    public static void main(String[] args) {
        while (true) {
            System.out.print("enter speed: ");
            Scanner scanner = new Scanner(System.in);
            int speed = scanner.nextInt();
            checkSpeed((int) Math.floor(speed));
        }
    }

    private static void checkSpeed(int speed) {
        if (speed > 70) {
            int points = (speed - 70) / 5;
            if (points == 0) {
                System.out.println("Ok");
            } else if (points >= 12) {
                System.out.println("driving licence will be blocked");
            } else {
                System.out.println(points);
            }
        } else {
            System.out.println("Ok");
        }


    }

}
