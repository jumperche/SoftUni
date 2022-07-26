package SoftuniFundamentals;

import java.util.*;

public class TreasureHunt {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] treasure = scanner.nextLine ( ).split ( "\\|");
        String[] input = scanner.nextLine ( ).split ( " " );
        List<String> out = new ArrayList<> ();
        boolean isthere = false;
        boolean a=false;
        while ( input[ 0 ] != "Yohoho!" ) {
            for ( int i = 1 ; i < input.length ; i++ ) {

                for ( int j = 0 ; j < treasure.length ; j++ ) {
                    if ( input[ i ].equals (  treasure[ j ] )) {
                        isthere = true;
                        break;

                    }

                }
                if ( isthere ==false ) {


                        out.add ( input[ i ] )  ;
                        }


                    isthere=false;



            }
            input = scanner.nextLine ( ).split ( " " );

            //int x= out.size ()-1;
           // out.add(out.get (index));
            //out.remove ( out.get ( index));


            switch (input[0]){
                case "Drop":
                    int index=Integer.parseInt ( input[ 1 ] )-1;
                out.add ( out.get ( index ) );
                out.remove ( out.get ( index ) );
                    input = scanner.nextLine ( ).split ( " " );
                   a=true;
                   break;
                case "Steal":
                    int ind=Integer.parseInt ( input[ 1 ] )-1;
                    for ( int i = 0 ; i < ind ; i++ ) {
                        out.remove ( out.size ()-1 );
                    }
                    break;
            }
            if (input[0].equals ( "Steal" )||input[0].equals ( "Drop" )&&a==false){
                for ( int k = 0 ; k < treasure.length ; k++ ) {
                    out.add ( treasure[ k ] );
                }

            }
        }

    }
}
