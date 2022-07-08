package Algorithms;

import java.util.*;
import java.util.concurrent.atomic.*;

public class ConnectedAreasInMatrix {
    public static List< int[] > path = new ArrayList<> ( );
    public static char[][] labirinth;
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        int r = Integer.parseInt ( scanner.nextLine ( ) );
        int c = Integer.parseInt ( scanner.nextLine ( ) );
         labirinth = new char[ r ][ c ];
        for ( int i = 0 ; i < r ; i++ ) {
            labirinth[ i ] = scanner.nextLine ( ).toCharArray ( );
        }

        for ( int row = 0 ; row < labirinth.length ; row++ ) {
            for ( int col = 0 ; col < labirinth[row].length ; col++ ) {
if (labirinth[row][col]=='-'){
    path.add(new int[]{row,col,0});
    findPaths (  row , col  );
}
            }
        }
        print ();
    }
    public static void findPaths(int row, int col){
if (isInBounds (  row, col )||isNotTraversable(row,col)){
   return;
}
        labirinth[row][col]='V';
path.get ( path.size ( )-1 )[2]++;
findPaths (  row+1,col );
findPaths ( row,col+1 );
findPaths ( row-1,col );
findPaths (row,col-1 );
    }

    private static boolean isNotTraversable ( int row , int col ) {
        return labirinth[row][col]=='V'||labirinth[row][col]=='*';
    }

    public static boolean isInBounds(int row, int col){
        return row<0|| row>= labirinth.length||col<0||col>=labirinth[row].length;
    }
    public static void print(){
        System.out.println ( "Total areas found: "+path.size ());
        AtomicInteger counter=new AtomicInteger ( 1 );
        path.stream ().sorted ( (f,s)->Integer.compare ( s[2],f[2] ) ).forEach ( a->  {
            System.out.println ( "Area #" + counter.getAndIncrement ( ) + " at (" + a[ 0 ] + ", " + a[ 1 ] + "), size: " + a[ 2 ] );
        });
        }
    }

