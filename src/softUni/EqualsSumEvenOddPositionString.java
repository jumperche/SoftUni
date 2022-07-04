package softUni;

import java.util.Scanner;

public class EqualsSumEvenOddPositionString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a=Integer.parseInt ( scanner.nextLine ( ) );
        int b=Integer.parseInt ( scanner.nextLine ( ) );


        for ( int i = a ; i <= b ; i++ ) {
            int sumEven=0;
            int sumOdd=0;
            int current=i;
            String a1=String.valueOf ( a );
            for ( int j = 1 ; j <=a1.length () ; j++ ) {
                int digit=current%10;
                if (j%2==0){
                    sumEven+=digit;

                }
                else {sumOdd+=digit;}
                current=current/10;
            }
            if (sumEven==sumOdd){
                System.out.print (i +" ");
            }
        }



    }
}


