package SoftuniFundamentals;

import java.util.*;

//Write a method that receives two characters and prints on a single line
// all the characters in between them according to ASCII.
public class CharactersInRange {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        String input1 = scanner.nextLine ( );
        char start=input.charAt ( 0 );
        char end=input1.charAt ( 0 );
        charInRange ( start,end );
    }
    public static void charInRange( char start,char end){
if (start>end){
    char help=start;
    start=end;
    end=help;
}

        for ( int i = start+1 ; i < end ; i++ ) {


            System.out.print ((char) i+" ");
        }
    }
}
