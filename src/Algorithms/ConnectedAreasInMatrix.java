package Algorithms;

import java.util.*;

public class ConnectedAreasInMatrix {
    public static List< Character > path = new ArrayList<> ( );
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int rows = Integer.parseInt ( scanner.nextLine ( ) );
        int cols = Integer.parseInt ( scanner.nextLine ( ) );
        char[][] labirinth = new char[ rows ][ cols ];
        for ( int row = 0 ; row < rows ; row++ ) {
            labirinth[ row ] = scanner.nextLine ( ).toCharArray ( );
        }
        findPaths ( labirinth , 0 , 0 , 'V' );

    }
    public static void findPaths(char [][] labirinth,int row, int col,char position){
if (!isInBounds ( labirinth, row, col )){
    print ();
}else {

}

    }
    public static boolean isInBounds(char [][] labirinth,int row, int col){
        return row>=0&& row< labirinth.length&&col>=0&&col<labirinth[row].length;
    }
    public static void print(){
        System.out.println ( );
    }
}
