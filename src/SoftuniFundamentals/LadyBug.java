package SoftuniFundamentals;

import java.util.*;

public class LadyBug {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int line = Integer.parseInt ( scanner.nextLine ( ) );
        int[] position = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ( );
        String[] name = scanner.nextLine ( ).split ( " " );
        boolean[] pos = new boolean[ line ];
        boolean out = false;
        for ( int i = 0 ; i < position.length ; i++ ) {
            if ( position[ i ] >= 0 && position[ i ] < pos.length )
                pos[ position[ i ] ] = true;
        }


        while ( !name[ 0 ].equals ( "end" ) ) {
            int x = Integer.parseInt ( name[ 0 ] );
            int y = Integer.parseInt ( name[ 2 ] );

            switch (name[ 1 ]) {
                case "right":
                    if ( x < 0 || x + y > line ||pos[ x ]==false){
                        out=true;
                        break;
                    }
                    while ( x+y<pos.length&&pos[x+y]==true ){
                        y=y+1;
                    }if (x+y< pos.length){
                    pos[x+y]=true;}
                    pos[x]=false;
                        break;
                        case "left":
                            if ( x < 0 || x - y > line ||pos[ x ]==false||x-y<0){
                                out=true;
                                break;
                            }
                            while ( x-y<pos.length&&pos[x-y]==true ){
                                y=y-1;
                            }
                            if (x-y>0){
                            pos[x-y]=true;}
                            pos[x]=false;
                            break;

            }

            name = scanner.nextLine ( ).split ( " " );
        }
        for ( int i = 0 ; i < pos.length ; i++ ) {
            if ( pos[ i ] == true ) {
                System.out.print ( "1 " );
            } else {
                System.out.print ( "0 " );
            }
        }
    }
}