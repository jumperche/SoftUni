package SoftuniFundamentals;

import java.util.*;

public class KaminoFactory {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String in = scanner.nextLine ( );
        int [] arr=Arrays.stream ( in.split ( "!" ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        while ( !in.equals ( "Clone them!" ) ){

        }
    }
}
