package softUni;

import java.util.Scanner;

public class Graduation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ();

        int grade = 1;
        int poor = 0;
        double sum=0;
        while ( grade <= 12 ) {
            Double year = Double.parseDouble ( scanner.nextLine () );
            sum=sum+year;
            if ( year >= 4.00 ) {
                poor = 0;
                grade++;
            } else {
                poor++;
                if ( poor > 1 ) {
                    System.out.printf ( "%s has been excluded at %d grade", name, grade );
                    break;
                }
            }


        }

        if (grade>=12){
            System.out.printf ( "%s graduated. Average grade: %.2f",name,sum/12 );
        }


    }
}



