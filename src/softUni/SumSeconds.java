package softUni;

import java.util.Scanner;

public class SumSeconds {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x1 = Integer.parseInt ( scanner.nextLine () );
        int x2 = Integer.parseInt ( scanner.nextLine () );
        int x3 = Integer.parseInt ( scanner.nextLine () );
        int total = x1 + x2 + x3;
        int min = total / 60;
        int sec = total % 60;
        if (sec < 10) {
            System.out.printf ( "%d:=0%d", min, sec );
        } else {
            System.out.printf ( "%d:%d", min, sec );


        }
    }
}
