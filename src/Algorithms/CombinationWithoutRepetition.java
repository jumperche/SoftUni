package Algorithms;

import java.io.*;
import java.util.*;



public class CombinationWithoutRepetition {

        public static int[] elements;
        public static int n,k;
        public static void main ( String[] args ) throws IOException {
            Scanner scanner = new Scanner ( System.in );
            n = Integer.parseInt ( scanner.nextLine ( ) );
            k = Integer.parseInt ( scanner.nextLine ( ) );

            elements=new int[k];

            loops ( 0,1);
        }


    public static void loops(int index,int start) {
if (index== elements.length){
printC ();
}else {
    for ( int i = start ; i <=n  ; i++ ) {
        elements[index]=i;
        loops ( index+1,i+1 );
    }
}
    }
    public static void printC(){
        for ( int i = 0 ; i < elements.length  ; i++ ) {
            System.out.print (elements[i]+" " );
        }
        System.out.println ( );
    }
}
