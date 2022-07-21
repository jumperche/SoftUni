package SoftuniFundamentals;

import java.text.*;
import java.util.*;

//Create a method that calculates and returns the value of a number raised to a given power.
public class MathPower {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double x=Double.parseDouble ( scanner.nextLine () );
        int n=Integer.parseInt ( scanner.nextLine () );
        System.out.println (new DecimalFormat ( "0.####" ).format (  power ( x,n )));
    }
    public static double power(double x,int n){
        double result=Math.pow ( x,n );
        return result;
    }
}
