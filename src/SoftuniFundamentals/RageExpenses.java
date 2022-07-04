package SoftuniFundamentals;

import java.util.*;

public class RageExpenses {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        double headset=Double.parseDouble ( scanner.nextLine ( ) );
        double mouse=Double.parseDouble ( scanner.nextLine ( ) );
        double keyboard=Double.parseDouble ( scanner.nextLine ( ) );
        double display=Double.parseDouble ( scanner.nextLine ( ) );
        double head=(n/2)*headset;
int mous=(n/3);
int both=(n/6);
int dis=(n/12);
double sum=mous*mouse+both*keyboard+dis*display+head;

        System.out.printf ( "Rage expenses: %.2f%n",sum );
    }
}
