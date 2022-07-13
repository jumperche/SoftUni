package SoftuniFundamentals;

import java.util.*;

public class SpiceMustFlow {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int counter=0;
        int workers=0;
        int sum=n;

        while ( n>=100 ){
            sum=sum-26;
            n=n-10;
            if (n<100){
                 if (sum>26){
                sum=sum-26;
                counter++;
                break;}
                else {counter++;
                    break;
            }}
            else {
                sum=sum+n;
                counter++;
            }
        }
        System.out.println (counter );
        System.out.println (sum );
    }
}
