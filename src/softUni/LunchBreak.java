package softUni;

import java.util.Scanner;

public class LunchBreak {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ();
        int lang = Integer.parseInt ( scanner.nextLine () );
        int br = Integer.parseInt ( scanner.nextLine () );

        double lunch = br / 8.00;
        double chill = br / 4.00;
        int sum = (int) Math.floor(br - lunch - chill);
int total=sum-lang;

        if (sum >= lang) {
            System.out.println ( "You have enough time to watch " + name +" and left with " + total +" minutes free time.");
        } else {
            System.out.println ( "You don't have enough time to watch "+name+ ", you need "+Math.abs(total)+" more minutes." );
        }
    }
}


