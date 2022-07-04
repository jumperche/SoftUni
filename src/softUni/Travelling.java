package softUni;

import java.util.Scanner;

public class Travelling {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String input= scanner.nextLine ( );
        while ( !input.equals ( "End" ) ){

            String land= input;
            int budget= Integer.parseInt ( scanner.nextLine ( ) );
            int sum=0;
            while ( sum<budget ){
                int amount= Integer.parseInt ( scanner.nextLine ( ) );
                sum=sum+amount;
            }
            System.out.println ("Going to "+land+"!" );
            input= scanner.nextLine ( );
        }


    }
}
