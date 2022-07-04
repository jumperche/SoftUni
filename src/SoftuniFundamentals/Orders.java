package SoftuniFundamentals;

import java.util.*;

public class Orders {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        double sum=0;
        for ( int i = 0 ; i < n ; i++ ) {
           double price=Double.parseDouble ( scanner.nextLine ( ) ) ;
           int day=Integer.parseInt ( scanner.nextLine ( ) );
           int quntity=Integer.parseInt ( scanner.nextLine ( ) );
           double x=(day*quntity)*price;
           sum=sum+x;
            System.out.printf ("The price for the coffee is: $%.2f%n",x );
            x=0;
        }
        System.out.printf ("Total: $%.2f",sum );
    }
}
