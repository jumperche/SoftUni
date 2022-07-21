package SoftuniFundamentals;
//Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"
import java.util.*;

public class Grade {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double n = Double.parseDouble ( scanner.nextLine ( ) );
        printGrade ( n );
    }
    public static void printGrade(double number){
        if (number>=2.00&&number<=2.99){
            System.out.printf ("Fail" );
        } else if ( number>=3.00&&number<=3.49 ) {
            System.out.printf ("Poor"  );
        } else if ( number>=3.50&&number<=4.49) {
            System.out.printf ("Good"  );
        }
        else if ( number>=4.5&&number<=5.49 ) {
            System.out.printf ("Very good"  );
        } else if ( number>=5.50&&number<=6) {
            System.out.printf ("Excellent"  );
        }
    }
}
