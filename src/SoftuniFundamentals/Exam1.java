package SoftuniFundamentals;

import java.util.Scanner;

public class Exam1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String word = scanner.nextLine ( );
        String[] input = scanner.nextLine ( ).split ( "\\s+" );
        StringBuilder out = new StringBuilder ( word );
        while ( !input[ 0 ].equals ( "Finish" ) ) {

            switch (input[ 0 ]) {
                case "Replace":
                    String current = input[ 1 ];
                    String newChar = input[ 2 ];
                    int start = out.indexOf ( current );
                    while ( start >= 0 ) {


                        out.replace ( start , start + 1 , newChar );

                        start = out.indexOf ( current );
                    }

                    System.out.println ( out );
                    break;
                case "Cut":
                    start = Integer.parseInt ( input[ 1 ] );
                    int end = Integer.parseInt ( input[ 2 ] );

                    if ( start < 0 || end > out.length ( ) ) {
                        System.out.println ( "Invalid indices!" );
                        break;
                    }

                    out.replace ( start , end + 1 , "" );


                    System.out.println ( out );
                    break;
                case "Make":
                    String helper = input[ 1 ];
                    if ( helper.equals ( "Upper" ) ) {
                        String upper = String.valueOf ( out ).toUpperCase ( );
                        out.replace ( 0 , out.length ( ) , upper );
                        System.out.println ( out );
                    } else {
                        String upper = String.valueOf ( out ).toLowerCase ( );
                        out.replace ( 0 , out.length ( ) , upper );
                        System.out.println ( out );
                    }
                    break;
                case "Check":
                    helper = input[ 1 ];
                    if ( out.toString ( ).contains ( helper ) ) {
                        System.out.println ( "Message contains " + helper );
                    } else {
                        System.out.println ( "Message doesn't contain " + helper );
                    }

                    break;
                case "Sum":
                    start = Integer.parseInt ( input[ 1 ] );
                    end = Integer.parseInt ( input[ 2 ] );
                    if ( start < 0 || end > out.length ( ) ) {
                        System.out.println ( "Invalid indices!" );
                        break;
                    }
                    String sub = out.substring ( start , end + 1 );
                    int sum = 0;
                    for ( int i = 0 ; i < sub.length ( ) ; i++ ) {
                        int chars = (int) sub.charAt ( i );
                        sum += chars;
                    }
                    System.out.println ( sum );
                    break;
            }
            input = scanner.nextLine ( ).split ( " " );
        }
    }
}
