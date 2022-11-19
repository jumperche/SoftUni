package SoftuniFundamentals;
//You are given the coordinates of four points in the 2D plane.
// The first and the second pair of points form two different lines.
// Print the longer line in the format "(X1, Y1)(X2, Y2)" starting with the point
// that is closer to the center of the coordinate system (0, 0)
// (You can reuse the method that you wrote for the previous problem).
// If the lines are of equal length, print only the first one.

//2
//4
//-1
//2
//-5
//-5
//4
//-3
import java.util.Scanner;

public class LongLine {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x1 = Integer.parseInt ( scanner.nextLine ( ) );
        int y1 = Integer.parseInt ( scanner.nextLine ( ) );
        int x2 = Integer.parseInt ( scanner.nextLine ( ) );
        int y2 = Integer.parseInt ( scanner.nextLine ( ) );
        int a1 = Integer.parseInt ( scanner.nextLine ( ) );
        int b1 = Integer.parseInt ( scanner.nextLine ( ) );
        int a2 = Integer.parseInt ( scanner.nextLine ( ) );
        int b2 = Integer.parseInt ( scanner.nextLine ( ) );

        double sum1 = Math.sqrt ( Math.pow ( x2 - x1 , 2 ) + Math.pow ( y2 - y1 , 2 ) );
        double sum2 = Math.sqrt ( Math.pow ( a2 - a1 , 2 ) + Math.pow ( b2 - b1 , 2 ) );


        if ( sum1 >= sum2 ) {
            sum1 = Math.sqrt ( Math.pow ( x1 , 2 ) + Math.pow ( y1 , 2 ) );
            sum2 = Math.sqrt ( Math.pow ( x2 , 2 ) + Math.pow ( y2 , 2 ) );

            if ( sum1 < sum2 ) {


                System.out.printf ( "(%d, %d)(%d, %d)" , x1 , y1 ,x2,y2);
            } else {
                System.out.printf ( "(%d, %d)(%d, %d)" , x2 , y2 ,x1,y1);
            }
        }
            else{
            sum1 = Math.sqrt ( Math.pow ( a1 , 2 ) + Math.pow ( b1 , 2 ) );
            sum2 = Math.sqrt ( Math.pow ( a2 , 2 ) + Math.pow ( b2 , 2 ) );

            if ( sum1 < sum2 ) {

                System.out.printf ( "(%d, %d)(%d, %d)" , a1 , b1,a2,b2 );
            } else {
                System.out.printf ( "(%d, %d)(%d, %d)" , a2 , b2,a1,b1 );
            }
        }
    }
}
