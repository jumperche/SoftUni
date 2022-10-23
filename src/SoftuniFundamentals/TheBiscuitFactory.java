package SoftuniFundamentals;
//exam problem 100/100 points
import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int biscuit = Integer.parseInt ( scanner.nextLine ( ) );
        int workers = Integer.parseInt ( scanner.nextLine ( ) );
        int other = Integer.parseInt ( scanner.nextLine ( ) );
        double total=0;
        for ( int i = 0 ; i < 30 ; i++ ) {
            double helper=biscuit*workers;
            if (i%3==0){
                helper=helper*0.75;
                total=total+Math.floor ( helper );
            }else {
                total=total+helper;
            }

        }
        System.out.printf ( "You have produced %.0f biscuits for the past month.%n",total );
        total=total-other;
if (total > 0) {
    System.out.printf ( "You produce %.2f percent more biscuits.%n",total/other*100 );
}
else {
    System.out.printf ( "You produce %.2f percent less biscuits.%n",Math.abs ( total / other * 100 ));
}
    }
}
