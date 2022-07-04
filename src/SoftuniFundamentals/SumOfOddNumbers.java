package SoftuniFundamentals;

import java.util.*;

public class SumOfOddNumbers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int sum=0;
        int count=0;

            for ( int i = 1 ; i <= 100 ; i++ ) {

if (i%2!=0){
    System.out.println (i );
    count++;
    sum=sum+i;
}
if (count==n){
    System.out.println ("Sum: "+sum );
    break;
}
            }
        }

    }


