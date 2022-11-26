package SoftuniFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnePr {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String in = scanner.nextLine ( );
        StringBuilder original=new StringBuilder(in);
        String []input = scanner.nextLine ( ).split ( " " );
        while ( !input[0].contains ( "Abracadabra" ) ) {


            switch (input[ 0 ]) {
                case "Abjuration":
                    String helper = original.toString ( ).toUpperCase ( );
                    original.replace ( 0 , helper.length ( ) , helper );
                    System.out.println ( original );
                    break;
                case "Necromancy":
                    helper = original.toString ( ).toLowerCase ( );
                    original.replace ( 0 , helper.length ( ) - 1 , helper );
                    System.out.println ( original );
                    break;
                case "Illusion":
                    int index = Integer.parseInt ( input[ 1 ] );
                    String letter = input[ 2 ];
                    if ( index < 0 & index > original.length ( ) - 1 ) {
                        System.out.println ( "The spell was too weak." );
                    } else {
                        original.replace ( index , index + 1 , letter );
                        System.out.println ( "Done!" );
                    }
                    break;
                case "Divination":
                    String first = input[ 1 ];
                    String second = input[ 2 ];
                    index = original.indexOf ( first );
                    if ( index > 0 ) {
                        Pattern pattern = Pattern.compile ( first );
                        Matcher matcher = pattern.matcher ( original );
                        while ( matcher.find ( ) ) {
                            int idx = original.indexOf ( first );
                            original.replace ( idx , idx + first.length ( ) , second );
                        }
                        System.out.println ( original );
                    }
                    break;
                case "Alteration":
                    helper = input[ 1 ];
                    index = original.indexOf ( helper );
                    if ( index > 0 ) {


                        original.replace ( index , index + helper.length ( ) , "" );
                        System.out.println ( original );
                    }
                    break;
                    default :
                        System.out.println ("The spell did not work!" );
            }
            input = scanner.nextLine ( ).split ( " " );
        }
    }
}
