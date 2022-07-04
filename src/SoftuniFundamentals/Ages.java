package SoftuniFundamentals;

import java.util.*;

public class Ages {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        if (n>=0&&n<=2){
            System.out.println ("baby" );
        }
        else if(n>=3&&n<=13){
            System.out.println ("child" );
        } else if ( n>=14&&n<=19 ) {
            System.out.println ("teenager" );
        } else if ( n>=20&&n<=65 ) {
            System.out.println ("adult" );
        } else if ( n>=66 ) {
            System.out.println ("elder" );
        }
    }
}
