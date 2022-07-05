package SoftuniFundamentals;

import java.util.*;

public class TownInfo {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        int pop=Integer.parseInt ( scanner.nextLine ( ) );
        short area=Short.parseShort ( scanner.nextLine ( ) );
        System.out.printf ( "Town %s has population of %d and area %d square km.",name,pop,area );
    }
}
