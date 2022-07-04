package softUni;

import java.util.Scanner;

public class MethodMin {
    static int getMin(int a,int b) {
        if ( a > b ) {
            return b;
        } else {
            return a;
        }
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        int c = Integer.parseInt ( scanner.nextLine ( ) );

        int min = getMin ( getMin ( a , b ) , c );
        System.out.println ( min );
    }

}
