package SoftuniFundamentals;
////exam problem 100/100 points
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > list =
                Arrays.stream ( scanner.nextLine ( ).split ( "\\|\\|" ) ).collect ( Collectors.toList ( ) );
        int fuel = scanner.nextInt ( );
        int ammunition = scanner.nextInt ( );
        boolean fail = false;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            String[] input = list.get ( i ).split ( " " );

            switch (input[ 0 ]) {
                case "Travel":
                    int number = Integer.parseInt ( input[ 1 ] );
                    if ( fuel < number ) {
                        System.out.printf ( "Mission failed.%n" );
                        fail = true;
                        break;
                    } else {
                        fuel = fuel - number;
                        System.out.printf ( "The spaceship travelled %d light-years.%n" , number );
                    }
                    break;
                case "Enemy":
                     number = Integer.parseInt ( input[ 1 ] );
                    if ( ammunition >= number ) {
                        ammunition = ammunition - number;
                        System.out.printf ( "An enemy with %d armour is defeated.%n" , number );
                    } else {
                        if ( fuel - ( 2 * number ) > 0 ) {
                            fuel = fuel - ( 2 * number );
                            System.out.printf ( "An enemy with %d armour is outmaneuvered.%n" , number );

                        } else {
                            System.out.printf ( "Mission failed.%n" );
                            fail = true;
                            break;
                        }

                    }
                    break;
                case "Repair":
                    number = Integer.parseInt ( input[ 1 ] );
fuel=fuel+number;
ammunition=ammunition+(2*number);
                    System.out.printf ( "Ammunitions added: %d.%n",number*2 );
                    System.out.printf ( "Fuel added: %d.%n",number );
                    break;
                case "Titan":
                    System.out.printf ( "You have reached Titan, all passengers are safe." );

            }
            if (fail){
                break;
            }
        }
    }
}
