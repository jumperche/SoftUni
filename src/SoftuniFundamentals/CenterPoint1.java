package SoftuniFundamentals;
//You are given the coordinates of two points on a Cartesian coordinate system -
// X1, Y1, X2, and Y2. Create a method that prints the point that is closest
// to the center of the coordinate system (0, 0) in the format (X, Y).
// If the points are at the same distance from the center, print only the first one.

//2
//4
//-1
//2
import java.util.Scanner;

public class CenterPoint1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x1 = Integer.parseInt ( scanner.nextLine ( ) );
        int y1 = Integer.parseInt ( scanner.nextLine ( ) );
        int x2 = Integer.parseInt ( scanner.nextLine ( ) );
        int y2 = Integer.parseInt ( scanner.nextLine ( ) );

        double sum1=Math.sqrt(Math.pow (x1,2)+Math.pow(y1,2));
        double sum2=Math.sqrt(Math.pow (x2,2)+Math.pow(y2,2));

        if (sum1<sum2){
            System.out.printf ("(%d, %d)",x1,y1 );
                    } else  {
            System.out.printf ("(%d, %d)",x2,y2 );
        }
    }
}
