package Uni;

import java.util.Scanner;

public class Test2 {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        java.lang.String answer = " ";
        while ( !answer.equals ( "no" ) ) {
            System.out.println ( "How many trials?" );
            int trials = Integer.parseInt ( scanner.nextLine ( ) );
            System.out.println ( "Enter max number: " );
            int max = Integer.parseInt ( scanner.nextLine ( ) );
            int min = 1;
            int number = (int) ( Math.random ( ) * ( max - min + 1 ) + min );
            int guess = 0;
            int count = 0;
            int i = 0;
            System.out.println ( "A number is chosen between " + min + " to " + max + ". Guess the number within " + trials + " trials." );
            for ( i = 0; i < trials ; i++ ) {
                System.out.println ( "Guess the number:" );
                guess = Integer.parseInt ( scanner.nextLine ( ) );


                if ( number == guess ) {
                    System.out.println ( "Congratulations! You guessed the number. You win " + count + " times." );
                    count++;
                    System.out.println ( "Do you want one more game?" );
                    answer = scanner.nextLine ( );
                    break;
                } else if ( number > guess
                        && i != trials - 1 ) {
                    System.out.println ( "The number is greater than " + guess );
                } else if ( number < guess
                        && i != trials - 1 ) {
                    System.out.println ( "The number is less than " + guess );
                }
            }

            if ( i == trials ) {
                System.out.println ( "You have exhausted " + trials + " trials." );
                System.out.println ( "The number was " + number );
                System.out.println ( "Do you want one more game?" );
                answer = scanner.nextLine ( );

            }


        }
    }

}
