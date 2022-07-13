package SoftuniFundamentals;

import java.util.*;

public class ZigZagArrays {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int[]arr=new int[n];
        int[]arr1=new int[n];

        for ( int i = 0 ; i <n ; i++ ) {
            if (i%2==1){
                String []input=scanner.nextLine ().split ( " " );
                arr[i]=Integer.parseInt ( input[ 0 ] );
                arr1[i]=Integer.parseInt ( input[ 1 ] );
            }
            else {
                String []input=scanner.nextLine ().split ( " " );
                arr[i]=Integer.parseInt ( input[ 1 ] );
                arr1[i]=Integer.parseInt ( input[ 0 ] );
            }
        }
        for ( int i = 0 ; i < arr.length ; i++ ) {
            System.out.print (arr1[i]+" " );
        }
        System.out.println ( );
        for ( int i = 0 ; i < arr1.length ; i++ ) {
            System.out.print (arr[i]+" " );
        }
    }
}
