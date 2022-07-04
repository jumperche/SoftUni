package softUni;

import java.util.*;

public class CombinationWithoutRepetition {
    public static String [] elements;
    public static String[]variation;


    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        elements=scanner.nextLine ().split ( "\\s+");


        int k=Integer.parseInt ( scanner.nextLine ( ) );
        variation=new String[ k];
        combinations (0,0);
    }

    private static void combinations ( int index, int start ) {
if(index== variation.length){
    printE ( variation );
}
else {
    for ( int i = start ; i < elements.length ; i++ ) {

        variation[index]=elements[ i ];
        combinations (index+1,i+1 );
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
