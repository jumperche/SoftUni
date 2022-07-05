package SoftuniFundamentals;

import java.util.*;

public class ConcatName {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        String last = scanner.nextLine ( );
        String delimeter = scanner.nextLine ( );
        System.out.println (name+delimeter+last );
    }
}
