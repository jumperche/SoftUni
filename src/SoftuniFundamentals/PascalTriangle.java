package SoftuniFundamentals;

import java.util.*;

public class PascalTriangle {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int [] arr=new int[n];
        int [] arrNew=new int[n];


        int index=0;
        arr[0]=1;
        System.out.println (arr[0] );
        //System.out.println ("1 1" );
        for ( int k = 2; k <= n ; k++ ) {


            for ( int i = 0 ; i < n ; i++ ) {
                arr[0]=1;
                arrNew[0]=1;
                if ( i-1<0) {
                    index = 0;
                    arr[ i ] = 1;
                }else{
                index = i - 1;
                arr[ i ] = arrNew[ i ] + arrNew[ index ];}
            }
            for ( int j = 0 ; j < arr.length ; j++ ) {
                arrNew[j]=arr[ j ];
                if ( arr[ j ] != 0 )
                    System.out.print ( arr[ j ] + " " );
            }
            System.out.println ( );
        }
    }
}
