package softUni;

import java.util.*;

public class PermutationsWithRepetition {
    public static String [] elements;


    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        elements=scanner.nextLine ().split ( "\\s+");
        String[]permute=new String[ elements.length];
        boolean[] used=new boolean[ elements.length];
        permutate(0);
    }

    private static void permutate ( int index ) {
        if ( index == elements.length ) {
            printE ( elements );
            return;
        }
        permutate ( index + 1 );
        HashSet< String > swaped = new HashSet<> ( );
        swaped.add ( elements[ index ] );
        for ( int i = index + 1 ; i < elements.length ; i++ ) {
            if ( !swaped.contains ( elements[ i] ) ) {
                swap ( elements,index ,  i );
                permutate ( index + 1 );
                swap ( elements , index , i );
                swaped.add ( elements[ i ] );
            }
        }
    }
    private static void swap(String [] arr,int first,int second){
        String temp=arr[first];
        arr[first]=arr[ second ];
        arr[second]=temp;
    }






    private static void printE ( String[] arr ) {

        System.out.println (String.join ( " ",arr ) );
    }

}
