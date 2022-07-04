package softUni;

import java.util.Scanner;

public class Oskars {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        String nameA= scanner.nextLine ();
        double point = Double.parseDouble ( scanner.nextLine () );
        double n = Double.parseDouble ( scanner.nextLine () );


        double sumPoint=point;
        for ( int i = 1; i <= n; i++ ) {
            String nameP = scanner.nextLine ();
            double pointP = Double.parseDouble ( scanner.nextLine () );
            int x = nameP.length ();
            sumPoint = sumPoint + ((x * pointP) / 2);

            if (sumPoint >= 1250.5) {
                System.out.printf ( "Congratulations, %s got a nominee for leading role with %.1f!", nameA, sumPoint );
                break;
            }
        }
        if (sumPoint <= 1250.5) {
            double diff = Math.abs ( sumPoint - 1250.5 );
            System.out.printf ( "Sorry, %s you need %.1f more!", nameA, diff );

        }





    }
}
