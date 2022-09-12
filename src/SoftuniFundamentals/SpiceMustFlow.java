package SoftuniFundamentals;
//Spice is Love, Spice is Life. And most importantly, Spice must flow. It must be extracted from the scorching sands of Arrakis, under the constant threat of giant sandworms. The Duke has tasked you with creating management software to make the work as efficient as possible.
//Write a program that calculates the total amount of spice extracted from a source.
//The source has a starting yield, which indicates how much spice can be mined on the first day. After it has been mined for a day, the yield drops by 10, meaning on the second day, it'll produce 10 less spice than on the first, on the third day 10 less than on the second, and so on (see examples).
//A source is considered profitable only while its yield is at least 100 – when less than 100 spices are expected in a day, abandon the source.
//The mining crew consumes 26 spices every day at the end of their shift and an additional 26 after the mine has been exhausted. Note that the workers cannot consume more spice than there is in storage.
//When the operation is complete, print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.
import java.util.*;

public class SpiceMustFlow {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int counter=0;
        int workers=0;
        int sum=n;

        while ( n>=100 ){
            sum=sum-26;
            n=n-10;
            if (n<100){
                 if (sum>26){
                sum=sum-26;
                counter++;
                break;}
                else {counter++;
                    break;
            }}
            else {
                sum=sum+n;
                counter++;
            }
        }
        System.out.println (counter );
        System.out.println (sum );
    }
}
