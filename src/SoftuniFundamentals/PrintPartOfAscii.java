package SoftuniFundamentals;

import java.util.*;

public class PrintPartOfAscii {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int start = Integer.parseInt ( scanner.nextLine ( ) );
        int end = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = start;i<= end;i++){
            char ch=(char)i;
            System.out.print (ch +" ");
        }
    }
}
