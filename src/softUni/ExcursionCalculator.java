package softUni;

import java.util.Scanner;

public class ExcursionCalculator {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int people = Integer.parseInt ( scanner.nextLine ( ) );
String sesson= scanner.nextLine ( );
double sum=0;

switch (sesson){
    case "spring":
        if (people<=5){
            sum=people*50;
        }
        else {
            sum=people*48;
        }
        break;
    case "summer":
        if (people<=5){
            sum=people*48.5;
            sum=sum-(sum*0.15);
        }
        else {
            sum=people*45;
            sum=sum-(sum*0.15);
        }
        break;
    case "autumn":
        if (people<=5){
            sum=people*60;
        }
        else {
            sum=people*49.5;
        }
        break;
    case "winter":
        if (people<=5){
            sum=people*86;
            sum=sum+(sum*0.08);
        }
        else {
            sum=people*85;
            sum=sum+(sum*0.08);
        }
        break;


}
        System.out.printf ( "%.2f leva.",sum );
    }
}
