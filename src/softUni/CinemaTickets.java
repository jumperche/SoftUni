package softUni;

import java.util.Scanner;

public class CinemaTickets {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int countStudent = 0;
        int countStandard = 0;
        int countKid = 0;
        int count = 0;
        String film = scanner.nextLine ( );
        while ( !"Finish".equals ( film ) ) {
            int quantity = Integer.parseInt ( scanner.nextLine ( ) );
            int currentcount = 0;
            String type = scanner.nextLine ( );
            while ( !"End".equals ( type ) ) {
                count++;
                currentcount++;
                switch (type) {
                    case "standard":
                        countStandard++;
                        break;
                    case "student":
                        countStudent++;
                        break;
                    case "kid":
                        countKid++;
                        break;

                }
if (currentcount==quantity){
    break;
}
                type = scanner.nextLine ( );
            }
            System.out.printf ( "%s - %.2f%% full.%n" , film , currentcount * 1.00 / quantity * 100 );

            film = scanner.nextLine ( );
        }
        System.out.printf ( "Total tickets: %d%n" , count );
        System.out.printf ( "%.2f%% student tickets.%n" , countStudent / 1.00 / count * 100 );
        System.out.printf ( "%.2f%% standard tickets.%n" ,countStandard / 1.00 / count * 100 );
        System.out.printf ( "%.2f%% kids tickets.%n" , countKid / 1.00 / count * 100 );
    }
}
