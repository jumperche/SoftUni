package Uni;

public class Kontr11 {
    public static void main ( String[] args ) {
        int p = 3;
        int q = 6;
        int x = 5;
        int y = 8;
        int sum = Math.abs ( p - q ) % 2;
        int sum1 = Math.abs ( x - y ) % 2;
        if ( sum == sum1 ) {
            System.out.println ( "1" );
        } else {
            System.out.println ( "0" );
        }

    }

    }
