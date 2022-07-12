package SoftuniFundamentals;

import java.util.*;

public class Elevator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int people = Integer.parseInt ( scanner.nextLine ( ) );
        int cap = Integer.parseInt ( scanner.nextLine ( ) );
        int sum=0;
        sum=(int)Math.ceil (( double )people/cap);
        System.out.println (sum );
    }
}
