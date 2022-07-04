package softUni;

import java.util.Scanner;

public class Fi {
    public static void main ( String[] args ) {

            Scanner scanner = new Scanner ( System.in );
            Double x1 = Double.parseDouble ( scanner.nextLine () );
            double x2 = Double.parseDouble ( scanner.nextLine () );;
            Double y1 = Double.parseDouble ( scanner.nextLine () );
            double y2 = Double.parseDouble ( scanner.nextLine () );;

            double b= Math.sqrt ( Math.pow ( (x1 - x2), 2 ) + Math.pow ( (y1 - y2), 2 ) );
        System.out.println (b);

        }

    }

