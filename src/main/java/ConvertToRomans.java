import java.util.Scanner;

public class ConvertToRomans {


    // this app work until to thousands
    public static String[] ONES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public static String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public static String[] HUNDREDS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    public static String[] THOUSANDS = {"", "M", "MM", "MMM", "MMMM", "V`", "V`M", "V`MM", "V`MMM", "V`MMMM"};


    public static String result = "";

    public static String convertToRoman(Long number) {
        // 3 643
        if (number >= 1000) {
            result += THOUSANDS[(int) (number / 1000)] + " ";
            number =number % 1000;
        }
        // 6 43
        if (number >= 100) {
            result += HUNDREDS[(int) (number / 100)]+" ";
            number =number % 100;
        }
        // 4 3
        if (number >= 10) {
            result += TENS[(int) (number / 10)]+" ";
            number =number % 10;
        }
        // 3
        result += ONES[Math.toIntExact(number)]+" ";
        return result;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();
        String s = convertToRoman(number);
        System.out.println(s);
    }
}
