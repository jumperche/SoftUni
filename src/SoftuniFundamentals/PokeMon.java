package SoftuniFundamentals;

import java.util.*;

public class PokeMon {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int m = Integer.parseInt ( scanner.nextLine ( ) );
        int y = Integer.parseInt ( scanner.nextLine ( ) );
        int counter=0;
        int na=n;
        while ( n>=m ){
            n=n-m;
            counter++;

            if(n==na*0.5){
                if (y>0){
                n=n/y;}
            }

        }
        System.out.println (n );
        System.out.println (counter );
    }
}
