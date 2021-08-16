import java.util.Iterator;

public class Reversing {

    public static void main(String[] args) {

        int number = 123254704;

        String s = String.valueOf(number);
        StringBuilder rev = new StringBuilder(s);
        String newNumber = rev.reverse().toString();

        System.out.println(s);
        System.out.println(Integer.parseInt(newNumber));


    }


}
