package SoftuniFundamentals;
//Write a program that decrypts a message by a given key and gathers information about the hidden
// treasure type and its coordinates. On the first line, you will receive a key (sequence of numbers).
// On the next few lines, until you receive "find", you will get lines of strings. You have to loop
// through every string and decrease the ASCII code of each character with a corresponding number of
// the key sequence. The way you choose a key number from the sequence is by just looping through it.
// If the length of the key sequence is less than the string sequence, you start looping from
// the beginning of the key. For more clarification, see the example below. After decrypting the message,
// you will get a type of treasure and its coordinates. The type will be between the symbol "&"
// and the coordinates will be between the symbols "<" and ">". For each line print the type and the coordinates
// in format "Found {type} at {coordinates}".

//1 2 1 3
//ikegfp'jpne)bv=41P83X@
//ujfufKt)Tkmyft'duEprsfjqbvfv=53V55XA
//find
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureFinder {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List <Integer> key= Arrays.stream ( scanner.nextLine ( ).split ( " " )).map(e->Integer.parseInt ( e)).collect( Collectors.toList());
        String input = scanner.nextLine ( );
        String out="";
        while ( !input.equals ( "find" ) ){
            int index=0;
            for ( int i = 0 ; i < input.length ( ) ; i++ ) {



                    int end=key.size ();
                    if (index==end){
                        index=0;
                    }
                    char help=input.charAt ( i );
                    char decrypted= (char) (help- key.get ( index));
                    out=out+decrypted;
                    index+=1;

            }
            int start=out.indexOf ( "&" );
            out=out.substring ( start+1 );
            int end=out.indexOf ( "&" );
            String type=out.substring ( 0,end );
            start=out.indexOf ( "<" );
            out=out.substring ( start+1 );
            end=out.indexOf ( ">" );
            String coordinate=out.substring ( 0,end );
            System.out.printf ( "Found %s at %s%n",type,coordinate );
            input = scanner.nextLine ( );
        }



    }
}
