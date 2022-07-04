package softUni;

import java.util.Scanner;

public class Vacation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double price=Double.parseDouble ( scanner.next () );
        double budge=Double.parseDouble ( scanner.next () );


        double sum=budge;
        int count=0;
        int day=0;
        while (sum<price) {
            if (count==5){
                break;}

            String command = scanner.next ();
            double money = Double.parseDouble ( scanner.next () );
            day++;
            if ( "spend".equals ( command ) ) {
                sum = sum - money;
                if ( sum < 0 ) {
                    sum = 0;
                }

                count++;
            } else if ( "save".equals ( command ) ) {
                sum = sum + money;

                count = 0;
            }
            if ( count == 5 ) {
                System.out.println ( "You can't save the money." );
                System.out.println ( day );
            }

            if ( sum >= price ) {
                System.out.printf ( "You saved the money for %d days." , day );
            }
        }
        }
    }



