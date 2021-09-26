import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamAPI {
    public static void main(String[] args) {


       /* // range in IntStream
       IntStream.
                range(1, 100)
                .skip(5)
                .forEach(System.out::println); // (x -> System.out.println(x));

       */
    /*    // sum of range in stream
        int sum = IntStream.
                range(1, 10)
                .sum();
        System.out.println(sum);
    */

/*
    // string map in stream
        Stream.of("Al-Karim","Akbar","Amin","Alloh","Azon")
                .sorted()
                .filter(x -> x.startsWith("Al"))
                .forEach(System.out::println);
*/


        // new Array list sorting in stream
        Arrays.stream(new int[]{1, 2, 3, 6, 4, 23, 43, 56})
                //        .map(x -> x)
                .sorted()
                .forEach(System.out::println);
                /*
                .average()
                .ifPresent(System.out::println);
                */


    }
}
