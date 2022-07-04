package softUni;

import java.util.*;

public class VariationWithRepetion {



        public static String [] elements;
        public static String[]variation;


        public static void main ( String[] args ) {

            Scanner scanner = new Scanner ( System.in );
            elements=scanner.nextLine ().split ( "\\s+");


            int k=Integer.parseInt ( scanner.nextLine ( ) );
            variation=new String[ k];
            variations (0);
        }

        private static void variations ( int index ) {
            if ( index == variation.length ) {
                printE ( variation );
                return;
            }
            for ( int i = 0 ; i < elements.length ; i++ ) {


                variation[index]=elements[ i ];
                variations ( index+1 );


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


