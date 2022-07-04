package softUni;

import java.util.*;

public class ab {
    public static void main ( String[] args ) {
        String[][] userpass = { { "ivan" , "petkov" } , { "maria" , "ivanova" } , { "kalin" , "hristov" } , { "stoqn" , "dimitrov" } };
        System.out.println ( userpass.length );
        System.out.println ( userpass[ 0 ].length );
        for ( int i = 0 ; i < userpass.length ; i++ ) {
            for ( int j = 0 ; j < userpass[ 0 ].length ; j++ ) {
                System.out.print ( userpass[ i ][ j ] + " " );
            }
            System.out.println ( "" );
        }

    }
}
