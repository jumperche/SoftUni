package softUni;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodCalculateTriangelArea {

    static double calculate(double a,double b){
        return (a*b)/2;
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        DecimalFormat format=new DecimalFormat ( "#.#########" );
        double a = Double.parseDouble ( scanner.nextLine ( ) );
        Double b = Double.parseDouble ( scanner.nextLine ( ) );
        double x = calculate ( a , b );
        System.out.println (format.format(x));
    }

}
