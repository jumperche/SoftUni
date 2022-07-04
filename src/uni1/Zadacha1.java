package uni1;

import java.util.*;
/* find Fibonnaci numbers
 * @autor Rosalina Gramatikov
 * @ver 1.1
 * @26.6.2022
 */
public class Zadacha1 {
           public static void main ( String[] args ) {
            Scanner input = new Scanner ( System.in );
            System.out.print ( "Number of terms: " ); //print message
            int n = input.nextInt ( ); //input
            long result = fib ( n ); //call function fib for n and save in result
            System.out.printf ( "Fibonnaci number %d = %d%n" , n , result );// print message
            input.close ( ); //close scanner
        }

        public static long fib ( int n ) {//find fibonnaci number for n
            long fn = 1;
            long fn_1 = 1;
            long fn_2 = 1;
            for ( int i = 2 ; i < n ; i++ ) {// circle to n
                fn = fn_1 + fn_2;//sum number1 and number2
                fn_2 = fn_1;//overwrite number1
                fn_1 = fn;
            }

            return fn;//return value
        }
    }



