package softUni;

import java.util.*;

public class PermutationsWithoutRepetition {
    public static String [] elements;
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        elements=scanner.nextLine ().split ( "\\s+");
        permutate(0);
    }

    private static void permutate ( int index ) {
        if (index== elements.length){
            printE(elements);
            return;
        }
     permutate ( index+1 );
        for ( int i =index+1 ; i < elements.length ; i++ ) {
            swap(elements,index,i);
            permutate ( index+1 );
            swap(elements,index,i);
        }
    }
private static void swap(String[] arr,int first,int second){
String temp=arr[first];
arr[first]=arr[ second ];
arr[second]=temp;
}
    private static void printE ( String[] arr ) {

        System.out.println (String.join ( " ",arr ) );
    }

}
