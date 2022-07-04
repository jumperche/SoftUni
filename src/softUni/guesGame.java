package softUni;

import java.util.Scanner;

public class guesGame {
    public static void main ( String[] args ) {


        // Scanner Class
        Scanner sc = new Scanner ( System.in );
        System.out.println ("Give a max trials:" );
        // Given K trials
        int trials=Integer.parseInt ( sc.nextLine ( ) );
        System.out.println ("Give max number: " );
        int max=Integer.parseInt ( sc.nextLine ( ) );
        int min=1;
        // Generate the numbers
        int number = (int)(Math.random()*(max-min+1)+min);



        int i, guess;

        System.out.println (
                "A number is chosen"
                        + " between 1 to 100."
                        + "Guess the number"
                        + " within 5 trials." );

        // Iterate over K Trials
        for ( i = 0; i < trials; i++ ) {

            System.out.println (
                    "Guess the number:" );

            // Take input for guessing
            guess = sc.nextInt ( );

            // If the number is guessed
            if ( number == guess ) {
                System.out.println (
                        "Congratulations!"
                                + " You guessed the number." );
                break;
            } else if ( number > guess
                    && i != trials - 1 ) {
                System.out.println (
                        "The number is "
                                + "greater than " + guess );
            } else if ( number < guess
                    && i != trials - 1 ) {
                System.out.println (
                        "The number is"
                                + " less than " + guess );
            }
        }

        if ( i == trials ) {
            System.out.println (
                    "You have exhausted"
                            + " K trials." );

            System.out.println (
                    "The number was " + number );
        }
    }


    }

