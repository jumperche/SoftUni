package softUni;

import java.util.Scanner;

public class Godzilla {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double buget = Double.parseDouble ( scanner.nextLine () );
        int stat = Integer.parseInt ( scanner.nextLine () );
        double price = Double.parseDouble ( scanner.nextLine () );
double dec=buget*0.1;
double cloth=stat*price;
double sum=dec+cloth;
double sum1=dec+(cloth-(cloth*0.1));
if (stat>=150){
    sum=sum1;
}
if (sum>buget){
    System.out.println ( "Not enough money!" );
    System.out.printf ( "Wingard needs %.2f leva more.",Math.abs(buget-sum) );
}
else {
    System.out.println ("Action!");
    System.out.printf ( "Wingard starts filming with %.2f leva left.",Math.abs(buget-sum) );
}

    }
}
