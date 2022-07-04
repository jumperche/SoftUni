package SoftuniFundamentals;

import java.util.*;

public class PadawanEquipment {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double budget=Double.parseDouble ( scanner.nextLine ( ) );
        int student = Integer.parseInt ( scanner.nextLine ( ) );
        double ligth=Double.parseDouble ( scanner.nextLine ( ) );
        double robe=Double.parseDouble ( scanner.nextLine ( ) );
        double belt=Double.parseDouble ( scanner.nextLine ( ) );
        int beltPrice=0;
        if (student>=6){
            beltPrice=student/6;
        }
        double sum=(ligth*(Math.ceil (student*1.1))+(robe*student)+(belt*(student-beltPrice)));
        if(budget>=sum){
            System.out.printf ("The money is enough - it would cost %.2flv.", ( sum ) );
        }
        else {
            System.out.printf ( "George Lucas will need %.2flv more.",( sum-budget ) );
        }
    }
}
