package softUni;

import java.util.Scanner;

public class MethodNotification {
    static void showSuccessMessage ( String operation , String message ) {
        String a = "Successfully executed " + operation + ".";
        System.out.println ( a );
        int len = a.length ( );
        showChar ( len );

        System.out.println ( message + "." );
        System.out.println ( );
    }

    static void showWarningMessage ( String message ) {
        String a = "Warning: " + message + ".";
        int len = a.length ( );
        System.out.println ( a );

        showChar ( len );
        System.out.println ( );
    }

    static void showErrorMessage ( String operation , String message , int code ) {
        String a = "Error: Failed to execute " + operation + ".";
        int len = a.length ( );
        System.out.println ( a );

        showChar ( len );
        System.out.println ("Reason: "+message+"." );
        System.out.println ("Error code: "+code+"." );
        System.out.println ( );
    }

    static void readAndProcessMessage ( int number , Scanner scanner ) {
        // Scanner scanner = new Scanner ( System.in );
        for ( int i = 0 ; i < number ; i++ ) {
            String messageType = scanner.nextLine ( );
            String operation;
            String message;
            if ( messageType.equals ( "success" ) ) {
                operation = scanner.nextLine ( );
                message = scanner.nextLine ( );
                showSuccessMessage ( operation , message );

            } else if ( messageType.equals ( "warning" ) ) {
                message = scanner.nextLine ( );
                showWarningMessage ( message );
            } else if ( messageType.equals ( "error" ) ) {

                operation = scanner.nextLine ( );
                message = scanner.nextLine ( );
                int errorCode = Integer.parseInt ( scanner.nextLine ( ) );
                showErrorMessage ( operation , message , errorCode );
            }
        }
    }

    static void showChar ( int len ) {
        for ( int i = 1 ; i <= len ; i++ ) {
            System.out.printf ( "=" );
        }
        System.out.println ( );
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int number = Integer.parseInt ( scanner.nextLine ( ) );

        readAndProcessMessage ( number , scanner );
    }
}
