package softUni;

import java.util.Scanner;

public class Ascii {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String letters = scanner.nextLine ( );
        int cCount = 0;
        int nCount = 0;
        int oCount = 0;
        String newWord = "";


        while ( !letters.equals ( "End" ) ) {

            int ascii = (int) letters.charAt ( 0 );
            boolean readLetter = true;

            if ( ( ascii >= 65 && ascii <= 90 ) || ( ascii >= 97 && ascii <= 122 ) ) {


                switch (letters.charAt ( 0 )) {
                    case 'c':
                        if ( cCount == 0 ) {
                            readLetter = false;
                            cCount++;
                            break;
                        }
                    case 'n':
                        if ( nCount == 0 ) {
                            readLetter = false;
                            nCount++;
                            break;
                        }
                    case 'o':
                        if ( oCount == 0 ) {
                            readLetter = false;
                            oCount++;
                            break;
                        }
                }
                if ( readLetter ) {
                    newWord += letters.charAt ( 0 );
                }
                if ( cCount > 0 && nCount > 0 && oCount > 0 ) {
                    System.out.print ( newWord + " " );
                    newWord = "";
                    cCount = 0;
                    nCount = 0;
                    oCount = 0;
                }
            }
            letters = scanner.nextLine ( );
        }
    }
}
