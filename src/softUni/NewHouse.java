package softUni;
import java.util.Scanner;
public class NewHouse {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ();
        int broi = Integer.parseInt ( scanner.nextLine () );
        double budge = Double.parseDouble ( scanner.nextLine () );
        double sum = 0;
        if ( name.equals ( "Roses" ) ) {
            if ( broi > 80 ) {
                sum = (broi * 5);
                sum = sum - (sum * 0.1);
            } else {
                sum = (broi * 5);
            }
        }
        if ( name.equals ( "Dahlias" ) ) {
            if ( broi > 90 ) {
                sum = (broi * 3.8);
                sum = sum - (sum * 0.15);
            } else {
                sum = (broi * 3.8);
            }
        }
        if ( name.equals ( "Tulips" ) ) {
            if ( broi > 80 ) {
                sum = (broi * 2.8);
                sum = sum - (sum * 0.15);
            } else {
                sum = (broi * 2.8);
            }
        }
        if ( name.equals ( "Narcissus" ) ) {
            if ( broi < 120 ) {
                sum = (broi * 3);
                sum = sum + (sum * 0.15);
            } else {
                sum = (broi * 3);
            }
        }
        if ( name.equals ( "Gladiolus" ) ) {
            if ( broi < 80 ) {
                sum = (broi * 2.5);
                sum = sum + (sum * 0.2);
            } else {
                sum = (broi * 2.5);
            }
                    }
        if ( budge >= sum ) {
            System.out.printf ( "Hey, you have a great garden with %d %s and %.2f leva left." , broi , name , Math.abs ( budge - sum ) );
        } else {
            System.out.printf ( "Not enough money, you need %.2f leva more." , Math.abs ( budge - sum ) );
        }
    }
}
