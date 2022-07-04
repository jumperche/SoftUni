package softUni;

import java.util.Scanner;

public class Exellent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner ( System.in );
        double grade = Double.parseDouble ( scanner.nextLine () );

if (grade<=5.49) {
     grade = Math.floor ( grade );
}

        if (grade > 5) {
            System.out.println ( "Excellent!" );
            scanner.close ();
        }

    }
}
