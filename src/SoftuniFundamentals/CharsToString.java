package SoftuniFundamentals;

import java.util.*;

public class CharsToString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        char n=name.charAt ( 0 );
       if (Character.isUpperCase ( n)){
           System.out.println ("upper-case" );
       }
else{
           System.out.println ("lower-case");
       }


    }
}
