package SoftuniFundamentals;
//Yoda is starting his newly created Jedi academy. So, he asked Master George Lucas to buy the needed equipment. The number of items depends on how many students will sign up. The equipment for the Padawan contains lightsabers, belts, and robes.
//You will be given the amount of money George Lucas has, the number of students, and the prices of each item. You have to help George Lucas calculate if the money he has is enough to buy all of the equipment or how much more money he needs.
//Because the lightsabers sometimes break, George Lucas should buy 10% more, rounded up to the next integer. Also, every sixth belt is free.
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
