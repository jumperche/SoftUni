package SoftuniFundamentals;
//Write a program that calculates the volume of n beer kegs.
//You will receive in total 3 * n lines. Every three lines will hold information for a single keg.
//First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
//Calculate the volume using the following formula: π * r^2 * h.
//In the end, print the model of the biggest keg.
import java.util.*;

public class BeerKegs {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String big="";
        double bigg=0;
        for ( int i = 0 ; i < n ; i++ ) {
            String name=scanner.nextLine ();
            Double r=Double.parseDouble ( scanner.nextLine () );
            Double higth=Double.parseDouble ( scanner.nextLine () );
            Double volume=Math.PI*r*r*higth;
            if (volume>bigg){
                bigg=volume;
                big=name;
            }

        }
        System.out.println (big );
    }
}
