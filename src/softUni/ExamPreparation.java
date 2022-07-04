package softUni;

import java.util.Scanner;

public class ExamPreparation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x = Integer.parseInt ( scanner.nextLine () );
        boolean isFailed = true;
        double sum = 0;
        String last = "";
        int failed = 0;
        int solved = 0;
        while ( failed < x ) {
            String problem = scanner.nextLine ();
            if ( "Enough".equals ( problem) ) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt ( scanner.nextLine () );
            if ( grade <= 4 ) {
                failed++;
            }
            sum += grade;
            solved++;
            last = problem;
        }
        if ( isFailed ) {
            System.out.printf ( "You need a break, %d poor grades.", x );
        } else {
            System.out.printf ( "Average score: %.2f%n", sum / solved );
            System.out.printf ( "Number of problems: %d%n", solved );
            System.out.printf ( "Last problem: %s", last );
        }
    }
}
