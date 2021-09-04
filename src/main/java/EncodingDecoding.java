import java.util.Base64;

public class EncodingDecoding {



    public static void main(String[] args)
    {

        String sample = "India Team will win the Cup";

        // print actual String
        System.out.println("Sample String:\n"
                + sample);

        // Encode into Base64 format
        String BasicBase64format
                = Base64.getEncoder()
                .encodeToString(sample.getBytes());

        // print encoded String
        System.out.println("Encoded String:\n"
                + BasicBase64format);

        //=========================================================================================

        // create an encoded String to decode
        String encoded
                = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";

        // print encoded String
        System.out.println("Encoded String:\n"
                + encoded);

        // decode into String from encoded format
        byte[] actualByte = Base64.getDecoder()
                .decode(encoded);

        String actualString = new String(actualByte);

        // print actual String
        System.out.println("actual String:\n"
                + actualString);
    }
}
