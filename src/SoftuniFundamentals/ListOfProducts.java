package SoftuniFundamentals;

import java.util.*;

//Read a number n and n lines of products. Print a numbered list of all the products ordered by name.
public class ListOfProducts {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        List< String > names = new ArrayList<> ( );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            names.add ( scanner.nextLine ( ) );

        }
        Collections.sort ( names );
        for ( int i = 1 ; i <= names.size ( ) ; i++ ) {
            System.out.printf ("%d.%s%n",i,names.get ( i-1 ) );
        }
    }
}
