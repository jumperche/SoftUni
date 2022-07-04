package softUni;

import java.util.Scanner;

public class Cake {
    public static void main ( String[] args ) {
        Scanner scanner= new Scanner ( System.in );
        int sh=Integer.parseInt (   scanner.nextLine ());
        int b=Integer.parseInt (  scanner.nextLine ());
        String input= scanner.nextLine ( );
        int sum=sh*b;

        while (!input.equals ( "STOP" )){

            int x=Integer.parseInt ( input );
            sum=sum-x;
            if (sum<=0) {
               break;

            }

            input=scanner.nextLine ();
        }
        if (sum<=0){
            System.out.printf ( "No more cake left! You need %d pieces more." , Math.abs ( sum ) );
        }
        else {
        System.out.printf ( "%d pieces are left.",Math.abs(sum) );}

    }
}
