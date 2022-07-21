package SoftuniFundamentals;

import java.util.*;

//Create a program that reads an integer number and multiplies the sum of all its even digits
// by the sum of all its odd digits:
public class MultiplyEvensByOdds {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        System.out.println (getMultiply ( n ) );
    }
    public static int getMultiply(int n){
        int eSum=getEven ( n );
                int oSum=getOdd ( n );

        return Math.abs(eSum)*Math.abs(oSum);
    }
    public static int getEven(int n){
        int sum=0;
        while (n!=0  ){
            int x=n%10;
            if (x%2==0){
             sum=sum+x;
            }
            n=n/10;
        }
        return sum;
    }
    public static int getOdd(int n){
        int sum=0;
        while (n!=0  ){
            int x=n%10;
            if (x%2!=0){
                sum=sum+x;
            }
            n=n/10;
        }
        return sum;
    }
}
