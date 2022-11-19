package SoftuniFundamentals;
//Write a program that reads a string and skips through it, extracting a hidden message. The algorithm you have to implement is as follows:
//Let's take the string "skipTest_String044170" as an example.
//Take every digit from the string and store it somewhere. After that, remove all the digits from the string. After this operation, you should have two lists of items: the numbers list and the non-numbers list:
//•	Numbers list: [0, 4, 4, 1, 7, 0]
//•	Non-numbers: [s, k, i, p, T, e, s, t, _, S, t, r, i, n, g]
//After that, take every digit in the numbers list and split it up into a take list and a skip list, depending on whether the digit is in an even or an odd index:
//•	Numbers list: [0, 4, 4, 1, 7, 0]
//•	Take list: [0, 4, 7]
//•	Skip list: [4, 1, 0]
//Afterward, iterate over both of the lists and skip {skipCount} characters from the non-numbers list, then take {takeCount} characters and store it in a result string. Note that the skipped characters are summed up as they go. The process would look like this on the aforementioned non-numbers list:
//Example: "skipTest_String"
//1.	Take 0 characters -> Taken: "", skip 4 characters  Skipped: "skip" -> Result: ""
//2.	Take 4 characters -> Taken: "Test", skip 1 characters  Skipped: "_" -> Result: "Test"
//3.	Take 7 characters -> Taken: "String", skip 0 characters  Skipped: "" -> Result: "TestString"
//After that, just print the result string on the console.

//T2exs15ti23ng1_3cT1h3e0_Roppe
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        List< Integer > takeList = new ArrayList ( );
        List< Integer > skipList = new ArrayList ( );

        List< String > characters = new ArrayList ( );
        int countNum = 0;
        for ( int i = 0 ; i < input.length ( ) ; i++ ) {
            char c = input.charAt ( i );

            if ( c >= 48 & c <= 57 ) {

                int num = Integer.parseInt ( String.valueOf ( input.charAt ( i ) ) );
                if ( countNum % 2 == 0 ) {
                    takeList.add ( num );
                } else {
                    skipList.add ( num );
                }
                countNum++;
            } else {
                String helper = String.valueOf ( c );
                characters.add ( helper );
            }

        }
        String message = "";
        int take = 0;
        int skip = 0;
        int index = 0;
        for ( int i = 0 ; i < takeList.size ( ) ; i++ ) {
            take = takeList.get ( i );
            for ( int j = 0 ; j < take ; j++ ) {
                message += characters.get ( index );
                index++;
                if ( index >= characters.size ( ) ) {
                    break;
                }
            }

            skip = skipList.get ( i );
            for ( int j = 0 ; j < skip ; j++ ) {
                // characters.remove ( index );
                index += 1;
            }

        }
        System.out.printf ( "%s" , message );
    }
}
