package SoftuniFundamentals;
//Create a method that calculates and returns the area of a rectangle by given width and length
import java.util.*;

public class CalculateRectangleArea {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
       double a=Double.parseDouble ( scanner.nextLine () );
       double b=Double.parseDouble ( scanner.nextLine () );
       double area=area ( a,b );
        System.out.printf ("%.0f",area  );
    }
    public static double area(double a,double b){
        return a*b;
    }
}
