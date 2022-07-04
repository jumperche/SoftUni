package SoftuniFundamentals;

import java.util.*;

public class RevString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        for ( int i = name.length ()-1 ; i >=0 ; i-- ) {
            System.out.print (name.charAt (i  ) );
        }
    }
}
