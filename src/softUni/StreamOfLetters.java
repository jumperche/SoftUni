package softUni;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );

        String letter = scanner.nextLine ( );
        String text = "";
        String endText = "";
        boolean c = false;
        boolean n = false;
        boolean o = false;
        while ( !"End".equals ( letter ) ) {
            if ( letter.matches ( "[a-zA-Z]+" ) ) {
                text = text + letter;
                if ( letter.equals ( "c" ) && !c ) {
                    text = text.substring ( 0 , text.length ( ) - 1 );
                    c = true;
                } else if ( letter.equals ( "n" ) && !n ) {
                    text = text.substring ( 0 , text.length ( ) - 1 );
                    n = true;
                } else if ( letter.equals ( "o" ) && !o ) {
                    text = text.substring ( 0 , text.length ( ) - 1 );
                    o = true;
                }
                if ( o && n && c ) {
                    text = text + " ";
                    endText = text;
                    c=false;
                    n=false;
                    o=false;
                }
            }
            letter = scanner.nextLine ( );

        }
        System.out.println ( endText );
    }
}