package SoftuniFundamentals;
//You will receive a number that represents how many lines we will get as input. On the next N lines, you will receive a string with 2 numbers separated by a single space. You need to compare them. If the left number is greater than the right number, you need to print the sum of all digits in the left number, otherwise, print the sum of all digits in the right number
import java.util.*;

public class FromLeftToTheRight {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int sum = 0;

        for ( int i = 0 ; i < n; i++ ) {


            String[] input = scanner.nextLine ( ).split ( " " );
            double x = Double.parseDouble ( input[ 0 ] );
            double y = Double.parseDouble ( input[ 1 ] );

            if ( x >= y ) {
                while ( x != 0 ) {
                    int a = (int)x % 10;
                    sum = sum + a;
                    x = x / 10;
                }
            } else {
                while ( y != 0 ) {
                    int a =(int) y % 10;
                    sum = sum + a;
                    y = y / 10;
                }
            }
            System.out.println (sum );
            sum=0;
            //input = scanner.nextLine ( ).split ( " " );
        }
    }


    }

