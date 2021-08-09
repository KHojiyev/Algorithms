import java.util.ArrayList;
import java.util.Collections;

public class ChangeMachine {

 /*   // a public collection of available coins
    public static int[] coins = {25, 10, 5, 1};
    static int i = 0;
    public static ArrayList<Integer> change = new ArrayList<Integer>();
    public static ArrayList<Integer> getMinCoins(int amount) {  // function to receive change in the form of coins


        if (amount > 0) {
            int count = amount / coins[i];
            int leaving = amount%coins[i];
            i++;
            change.add(count);
            if (count > 0) {
                getMinCoins(leaving);

            } else {
                getMinCoins(amount);

            }
        }

        return change;
    }

    public static void main(String[] args) {


        ArrayList<Integer> coins = getMinCoins(91);
        System.out.println(coins.toString());

    }*/

    public static int[] coins = {25, 10, 5, 1}; // a public collection of available coins

    // function to recieve change in the form of coins
    public static ArrayList < Integer > getMinCoins(int amount) {

        // an array list to store all the coins
        ArrayList < Integer > change = new ArrayList < Integer > ();
        for (int i = 0; i < coins.length; i++) // traverse through all available coins
        {
            while (amount >= coins[i]) // keep checking if the amount is greater than the max coin
            {
                amount -= coins[i]; // subtract the maximum coin selected from the total amount in every iteration
                change.add(coins[i]); // add the coin to the list of 'change'
            }
        }
        return change; // return the list containing all the change
    }

    public static void main(String args[])
    {
        // Play around with this amount to see how many coins you get!
        int amount = 1;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 17;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 33;
        System.out.println(amount + " --> " + getMinCoins(amount));

        amount = 99;
        System.out.println(amount + " --> " + getMinCoins(amount));





    }

}
