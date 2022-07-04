package softUni;

import javax.management.StringValueExp;
import java.util.Scanner;

public class MovieTickets {
    public static void main ( String[] args ) {
        String ticket = "";
        Scanner scanner = new Scanner ( System.in );
        int a1 = Integer.parseInt ( scanner.nextLine ( ) );
        int a2 = Integer.parseInt ( scanner.nextLine ( ) );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
int sym=a2-1;
        int sum = 0;
        for ( int second = 1 ; second <= n-1 ; second++ ) {
            ticket="";
            sum=0;
            String symbol = Character.toString ( sym);
String a="-";
            ticket = ticket + symbol+a;
            ticket = ticket + Integer.toString ( second );
            sum = sum + second;
            for ( int third = 1 ; third <= n/2-1 ; third++ ) {
                ticket="";

                 symbol = Character.toString ( sym);
                 a="-";
                ticket = ticket + symbol+a;


                ticket = ticket + Integer.toString ( second );
                ticket = ticket + Integer.toString ( third );
                sum = sum + third;


                sum = sum + (sym);
                ticket = ticket + Integer.toString ( sym);
                if ( (sym)% 2 != 0 && sum % 2 != 0 ) {
                    System.out.println ( ticket );
                }
            }


        }
    }
}
