package SoftuniFundamentals;

import java.util.*;

public class BeerKegs {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String big="";
        double bigg=0;
        for ( int i = 0 ; i < n ; i++ ) {
            String name=scanner.nextLine ();
            Double r=Double.parseDouble ( scanner.nextLine () );
            Double higth=Double.parseDouble ( scanner.nextLine () );
            Double volume=Math.PI*r*r*higth;
            if (volume>bigg){
                bigg=volume;
                big=name;
            }

        }
        System.out.println (big );
    }
}
