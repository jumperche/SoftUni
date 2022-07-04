package softUni;

import java.util.Scanner;

public class Walking {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int ziel = 10000;
        int sum = 0;
        String input = scanner.nextLine ( );
        while ( !"Going home".equals ( input ) ) {
            int step = Integer.parseInt ( input );
            sum = sum + step;
            if ( sum >= ziel ) {
                System.out.println ( "Goal reached! Good job!" );
                System.out.printf ( "%d steps over the goal!" , Math.abs ( ziel - sum ) );
                break;
            }



            input = scanner.nextLine ( );
        }
        if ( input.equals ( "Going home" ) ) {
            input = scanner.nextLine ( );
            int step = Integer.parseInt ( input );
            sum = sum + step;
            if ( sum >= ziel ) {
                System.out.println ( "Goal reached! Good job!" );
                System.out.printf ( "%d steps over the goal!" , Math.abs ( ziel - sum ) );

            } else {
                System.out.printf ( "%d more steps to reach goal.", Math.abs ( ziel - sum ));
            }

        }
    }
}
