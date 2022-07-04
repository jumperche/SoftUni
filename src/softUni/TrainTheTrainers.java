package softUni;
import java.util.Scanner;

public class TrainTheTrainers {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int juri = Integer.parseInt ( scan.nextLine ( ) );
        String name = scan.nextLine ( );

       int count=0;
        double sum = 0;
        while ( !name.equals ( "Finish" ) ) {
double sum1=0;
            for ( int i = 1 ; i <= juri ; i++ ) {
               double input =Double.parseDouble (scan.nextLine());
sum1+=input;
                sum =sum+ input;
                count++;

            }
            System.out.printf ( "%s - %.2f.%n",name,sum1/juri );
            name = scan.nextLine ( );
        }
        System.out.printf ("Student's final assessment is %.2f.", sum/count);

    }
}
