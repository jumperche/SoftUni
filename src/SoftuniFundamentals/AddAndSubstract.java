package SoftuniFundamentals;

import java.util.*;

//You will receive 3 integers. Write a method sum to get the sum of the first two integers and
// subtract the method that subtracts the third integer from the result from the sum method.
public class AddAndSubstract {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int a = Integer.parseInt ( scanner.nextLine ( ) );
        int b = Integer.parseInt ( scanner.nextLine ( ) );
        int c = Integer.parseInt ( scanner.nextLine ( ) );
        System.out.println (add(a,b,c) );
    }
    public static int add(int a,int b,int c){
        int sum=a+b;
        return sub(sum,c);
    }
    public static int sub(int sum,int c){
        sum=sum-c;
        return sum;
    }
}
