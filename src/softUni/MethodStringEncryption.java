package softUni;


import java.util.Scanner;

public class MethodStringEncryption {


    static void encrypt ( int n , Scanner scanner ) {
        String encrypt = "";

        //char letter=scanner.nextLine ().charAt ( 0 );
        for ( int i = 1 ; i <= n ; i++ ) {
            char letter = scanner.nextLine ( ).charAt ( 0 );
            int ascii = (int) letter;
            if ( ascii < 100 ) {
                int x = ascii % 10;
                x = x + ascii;
                char ch = (char) x;
                encrypt = encrypt + ch;
                encrypt = encrypt + ascii / 10 + ascii % 10;
                x = ascii - ( ascii / 10 );
                ch = (char) x;
                encrypt = encrypt + ch;
            } else if ( ascii < 1000 ) {
                int x = ascii % 10;
                x = x + ascii;
                char ch = (char) x;
                encrypt = encrypt + ch;
                encrypt = encrypt + ascii / 100 + ascii % 10;
                x = ascii - ( ascii / 100 );
                ch = (char) x;
                encrypt = encrypt + ch;

            }

        }
        System.out.println ( encrypt );
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int number = Integer.parseInt ( scanner.nextLine ( ) );

        encrypt ( number , scanner );
    }
}
