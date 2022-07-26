package SoftuniFundamentals;
//You are given a field size and the indexes of ladybugs inside the field. After that on every
// new line, until the "end" command is given, a ladybug changes its position either to its left
// or to its right by a given fly length.
//A command to a ladybug looks like this: "0 right 1". This means that the little insect placed on
// index 0 should fly one index to its right. If the ladybug lands on a fellow ladybug, it continues to fly in the same direction
// by the same fly length. If the ladybug flies out of the field, it is gone.
//For example, imagine you are given a field with size 3 and ladybugs on indexes 0 and 1.
// If the ladybug on index 0 needs to fly to its right by the length of 1 (0 right 1) it will
// attempt to land on index 1 but as there is another ladybug there it will continue further
// to the right by an additional length of 1, landing on index 2. After that, if the same ladybug
// needs to fly to its right by the length of 1 (2 right 1), it will land somewhere outside
// of the field, so it flies away:
//If you are given a ladybug index that does not have a ladybug there, nothing happens.
// If you are given a ladybug index that is outside the field, nothing happens.
//Your job is to create the program, simulating the ladybugs flying around doing nothing. In the end, print
// all cells in the field separated by blank spaces. For each cell that has a ladybug on it print '1' and for each empty
// cell print '0'. For the example above, the output should be '0 1 0'.
import java.util.*;

public class LadyBug {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int line = Integer.parseInt ( scanner.nextLine ( ) );
        int[] position = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ( );
        String[] name = scanner.nextLine ( ).split ( " " );
        boolean[] pos = new boolean[ line ];
        boolean out = false;
        int newPos=0;
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
                    while ( x-y>pos.length&&pos[x-y]==true ){
                        newPos=x-y-1;

                    }
                    if (x-y>0){
                        pos[newPos]=true;}
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