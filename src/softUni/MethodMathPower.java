package softUni;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodMathPower {
    static double calculatePower(double n,double power){
        double calk=0.0;
        calk=Math.pow ( n,power );
        return calk;
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        DecimalFormat format = new DecimalFormat ( "#.#########" );
        double n = Double.parseDouble ( scanner.nextLine ( ) );
        double power = Double.parseDouble ( scanner.nextLine ( ) );
        double x=calculatePower ( n,power );
        System.out.printf ("%.0f",x );
    }
}
