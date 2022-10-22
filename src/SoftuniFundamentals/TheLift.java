package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            int helper=4-list.get ( i );
            if (n<=0){
                break;
            }
            if ((i==list.size() - 1&n<=helper)|helper-n>=0){
                helper=n+list.get(i);
                n-=helper;
                list.remove ( i );
                list.add ( i , helper);
            }

            else {
                n -= helper;
                list.remove ( i );
                list.add ( i , 4 );
            }
        }
        if (list.get ( list.size ( )-1 )<4&n<=0){
            System.out.printf ( "The lift has empty spots!%n" );
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                System.out.print ( list.get ( i )+ " " );
            }

        } else if ( list.get(list.size() - 1) ==4&n>0 ) {
            System.out.printf ( "There isn't enough space! %d people in a queue!%n",n );
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                System.out.print ( list.get ( i )+ " " );
            }
        } else if ( list.get(list.size() - 1) == 4 & n== 0 ) {
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                System.out.print ( list.get ( i )+ " " );
            }
        }
    }
}
