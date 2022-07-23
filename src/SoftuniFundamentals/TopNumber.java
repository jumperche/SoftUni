package SoftuniFundamentals;

import java.util.*;

//Read an integer n from the console. Find all top numbers in the range [1 … n] and print them.
// A top number holds the following properties:
//•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//•	Holds at least one odd digit, e.g. 232, 707, 87578.
public class TopNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        findTopNumber ( n );
    }
    public static void findTopNumber(int n){

        for ( int i = 1 ; i < n ; i++ ) {
            int sum=0;
            int a=i;
            boolean digits=false;
            boolean odd=false;
            while ( a!=0 ){
                 int x=a%10;
                sum=sum+x;
                if (a%2!=0){
                    odd=true;
                }
                a=a/10;
            }
            if(sum%8==0){
                digits=true;
            }
            if (digits==true&&odd==true){
                System.out.println (i );
            }
        }
    }
}
