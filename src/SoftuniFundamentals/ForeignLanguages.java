package SoftuniFundamentals;

import java.util.*;

public class ForeignLanguages {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        if (name.equals ( "England" )||name.equals ( "USA" )){
            System.out.println ("English" );
        } else if ( name.equals ( "Spain" )||name.equals ( "Argentina" )||name.equals ( "Mexico" ) ) {
            System.out.println ("Spanish" );
        }
        else {
            System.out.println ("unknown" );
        }
    }
}
