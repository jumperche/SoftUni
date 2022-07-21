package SoftuniFundamentals;
//Write a program that checks if a given password is valid. Password rules are:
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.
//If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule print a message:
//•	"Password must be between 6 and 10 characters";
//•	"Password must consist only of letters and digits";
//•	"Password must have at least 2 digits".

import java.util.*;

public class PasswordValidator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        passValidator ( input );
    }

    public static void passValidator ( String input ) {
        boolean a=characters ( input );
        boolean b=letters ( input );
        boolean c=digits ( input );
        if (a||b||c){

        }
        else {
            System.out.println ("Password is valid" );
        }

    }

    public static boolean characters ( String input ) {

        if ( input.length ()<6||input.length ()>10 ) {
            System.out.println ( "Password must be between 6 and 10 characters" );
            return true;
        }
        else return false;
    }

    public static boolean digits ( String input ) {
        int count = 0;
        for ( int i = 0 ; i < input.length ( ) ; i++ ) {
            if ( input.charAt ( i ) >= 48 && input.charAt ( i ) <= 57 ) {
                count++;
            }

        }
        if ( count < 2 ) {
            System.out.println ( "Password must have at least 2 digits" );
            return true;
        }
        else return false;
    }

    public static boolean letters ( String input ) {
        for ( int i = 0 ; i < input.length ( ) ; i++ ) {
            if ( input.charAt ( i ) < 48 || ( input.charAt ( i ) > 57 && input.charAt ( i ) < 65 )
                    || ( input.charAt ( i ) > 90 && input.charAt ( i ) < 97 ) || input.charAt ( i ) > 122 ) {
                System.out.println ( "Password must consist only of letters and digits");
                return true;

            }

        }
        return false;
    }
}
