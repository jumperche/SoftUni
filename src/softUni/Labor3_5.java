/*
 Програма, която намира броя на различните комбинации от 6 числа теглени  от 1 до 49. Програмата е само модифицирана от мен
* A combination is a subset of elements from a given set.
 * combinations of n distinct elements in a group of size k (Java)
 * https://www.baeldung.com/java-combinatorial-algorithms
 */

package softUni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Labor3_5 {


    public static void main ( String[] args ) {
//масив
        Integer[] arrayEins = new Integer[ 49 ];

// цикъл за пълнене на масива от 1 до 49 включително
        for ( int i = 1 ; i <= 49 ; i++ ) {
            arrayEins[ i ] = 1;

            List< Integer > mylist = Arrays.asList ( arrayEins );// масива се копира в лист
            //Scanner in = new Scanner ( System.in );

            int n = mylist.size ( );//n е равен на дължината на листа

            int k = 6;
                /*do {
                    System.out.print ( "Enter number of elements k (1 <= k <=" + n + "): " );
                    k = in.nextInt ( );
                } */
            while ( k <= 0 || k > n ) ;//проверка за валидни параметри

            List< List< Integer > > result = new ArrayList<> ( );

            result = combinations ( mylist , k );

            System.out.println ( "Number of combinations " + "C(" + n + "," + k + ") is " + result.size ( ) + ":" );//изписване на резултата
            break;
        }
    }

    private static void combinationsInternal (//метода търси комбинаци
            List< Integer > inputSet , int k , List< List< Integer > > results , ArrayList< Integer > accumulator , int index ) {
        int needToAccumulate = k - accumulator.size ( );
        int canAcculumate = inputSet.size ( ) - index;

        if ( accumulator.size ( ) == k ) {
            results.add ( new ArrayList<> ( accumulator ) );
        } else if ( needToAccumulate <= canAcculumate ) {
            combinationsInternal ( inputSet , k , results , accumulator , index + 1 );
            accumulator.add ( inputSet.get ( index ) );
            combinationsInternal ( inputSet , k , results , accumulator , index + 1 );
            accumulator.remove ( accumulator.size ( ) - 1 );
        }
    }

    public static List< List< Integer > > combinations ( List< Integer > inputSet , int k ) {
        List< List< Integer > > results = new ArrayList<> ( );
        combinationsInternal ( inputSet , k , results , new ArrayList<> ( ) , 0 );
        return results;
    }

}
