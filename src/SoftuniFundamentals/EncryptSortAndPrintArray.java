package SoftuniFundamentals;

import java.util.*;

import static java.util.Collections.sort;

public class EncryptSortAndPrintArray {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int sum=0;
        List<Integer>sorted=new ArrayList< Integer>();


        for ( int i = 0 ; i < n ; i++ ) {
            String input = scanner.nextLine ( );
            for ( int j = 0 ; j < input.length ( ) ; j++ ) {
                int x = input.charAt ( j );
                if (x==65||x==69||x==73||x==79||x==85||x==97||x==101||x==105||x==111||x==117)
                {
                    x=x*input.length ();
                }
                else {
                    x=x/input.length ();
                }
                sum=sum+x;


            }
            sorted.add(sum);

            sum=0;
        }
        sort(sorted);
        for ( int j = 0 ; j <sorted.size () ; j++ ) {
            System.out.println (sorted.get ( j ) );

        }
    }
}
