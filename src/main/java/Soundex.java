/*Related Tutorials
        Previous Next
        Home / Algorithms / Soundex algorithm
        Implement Phonetic search using Soundex algorithm

        Last Modified: December 26, 2020

        Have you ever wondered how spell checkers, in any word editor, suggest you a list of probable other words whenever you have any spelling mistake?? This is done using phonetic search. Soundex is a phonetic algorithm for indexing names by sound, as pronounced in English. The goal is for homophones (pronounced the same as another word but differs in meaning, and may differ in spelling) to be encoded to the same representation so that they can be matched despite minor differences in spelling e.g. bear - beer, Nelson - Neilson - Neelson etc.

        It is now a standard feature of popular database softwares such as DB2, PostgreSQL, MySQL, Ingres, MS SQL Server and Oracle and some major word editors.
        Soundex algorithm

        This algorithm was developed by Robert Russell in 1910 for the words in English. The main principle behind this algorithm is that consonants are grouped depending on the ordinal numbers and finally encoded into a value against which others are matched. It aims to find a code for every word by above process which is called soundex code.

        The Soundex code for a name consists of a letter followed by three numerical digits: the letter is the first letter of the name, and the digits encode the remaining consonants.

        The complete algorithm to find soundex code is as below:

        Retain the first letter of the name and drop all other occurrences of a, e, i, o, u, y, h, w.
        Replace consonants with digits as follows (after the first letter):
        b, f, p, v → 1
        c, g, j, k, q, s, x, z → 2
        d, t → 3
        l → 4
        m, n → 5
        r → 6
        If two or more letters with the same number are adjacent in the original name (before step 1), only retain the first letter; also two letters with the same number separated by ‘h’ or ‘w’ are coded as a single number, whereas such letters separated by a vowel are coded twice. This rule also applies to the first letter.
        Iterate the previous step until you have one letter and three numbers. If you have too few letters in your word that you can’t assign three numbers, append with zeros until there are three numbers. If you have more than 3 letters, just retain the first 3 numbers.

        Soundex Implementation in Java

        One implementation of Soundex algorithm is as below:*/


public class Soundex{

    public static String getCode(String s) {
        char[] x = s.toUpperCase().toCharArray();


        char firstLetter = x[0];

        //RULE [ 2 ]
        //Convert letters to numeric code
        for (int i = 0; i < x.length; i++) {
            switch (x[i]) {
                case 'B':
                case 'F':
                case 'P':
                case 'V': {
                    x[i] = '1';
                    break;
                }

                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z': {
                    x[i] = '2';
                    break;
                }

                case 'D':
                case 'T': {
                    x[i] = '3';
                    break;
                }

                case 'L': {
                    x[i] = '4';
                    break;
                }

                case 'M':
                case 'N': {
                    x[i] = '5';
                    break;
                }

                case 'R': {
                    x[i] = '6';
                    break;
                }

                default: {
                    x[i] = '0';
                    break;
                }
            }
        }

        //Remove duplicates
        //RULE [ 1 ]
        String output = "" + firstLetter;

        //RULE [ 3 ]
        for (int i = 1; i < x.length; i++)
            if (x[i] != x[i - 1] && x[i] != '0')
                output = output + x[i];

        //RULE [ 4 ]
        //Pad with 0's or truncate
        output = output + "0000";
        return output.substring(0, 4);
    }

    public static void main(String[] args) {
        String name1 = "beer";
        String name2 = "bear";
        String name3 = "bearer";

        System.out.println(Soundex.getCode(name1));
        System.out.println(Soundex.getCode(name2));
        System.out.println(Soundex.getCode(name3));
    }
}