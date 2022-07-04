package softUni;

import java.util.Scanner;

public class Histogram {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        double n = Double.parseDouble ( scanner.nextLine () );
        int s = 0;
        int m = 0;
        int l = 0;
        int xl = 0;
        int xxl = 0;

        for ( int i = 0; i < n; i++ ) {
            int x = Integer.parseInt ( scanner.nextLine () );
            if (x < 200) {

                s = s + 1;
            } else if (x <= 399) {

                m = m + 1;
            } else if (x <= 599) {

                l = l + 1;
            } else if (x <= 799) {

                xl = xl + 1;
            } else if (x >= 800) {

                xxl = xxl + 1;
            }
        }

        double ps = s / n * 100.00;
        double pm = m / n * 100.00;
        double pl = l / n * 100.00;
        double pxl = xl / n * 100.00;
        double pxxl = xxl / n * 100.00;
        System.out.printf ( "%.2f%%%n", ps );
        System.out.printf ( "%.2f%%%n", pm );
        System.out.printf ( "%.2f%%%n", pl );
        System.out.printf ( "%.2f%%%n", pxl );
        System.out.printf ( "%.2f%%%n", pxxl );

    }
    }



