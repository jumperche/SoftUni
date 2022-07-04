


import java.lang.Math;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

import static java.time.chrono.JapaneseEra.values;

public class vili {

    public static int[][] MultiTable = new int[ 13 ][ 32 ];

    public static int[] monthMin = new int[ 13 ];
    //public static String[] monthMinDate =new String[32];
    public static int[] monthMax = new int[ 13 ];
   // public static String[] monthMaxDate=new String[32];
    public static int[] monthLengths = { 0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
    public static SortedMap<String, Integer> sortedМap
            = new ConcurrentSkipListMap<String,Integer> ();



    public static void main ( String[] args ) {

        int min = 1;
        int max = 1;
        generate ( min , max );


    }

    public static void generate ( int min , int max ) {


        for ( int i = 1 ; i <= 12 ; i++ ) {
            monthMin[ i ] = Integer.MAX_VALUE;
            monthMax[ i ] = Integer.MIN_VALUE;
            if ( i == 11 || i == 12 || i == 1 || i == 2 || i == 3 ) {
                min = -20;
                max = 10;
            } else {
                min = 5;
                max = 25;
            }
            System.out.print ( "Month: " + i + "   " );
            for ( int j = 1 ; j <= 31 ; j++ ) {

                if ( j > monthLengths[ i ] ) {
                    MultiTable[ i ][ j ] = -200;
                    System.out.print ( MultiTable[ i ][ j ] + " " );



                } else {

                    int x = (int) ( Math.random ( ) * ( max - min + 1 ) + min );
                    MultiTable[ i ][ j ] = x;

                   //monthMax[ i ] = Math.max ( MultiTable[ i ][ j ] , monthMax[ i ] );
                  // monthMin[ i ] = Math.min ( MultiTable[ i ][ j ] , monthMin[ i ] );
                   String in=(String.format ( String.valueOf ( i ) ,"%2d" )+"."+String.format ( "%2d" , j ) );
                   //String out=String.format ( in,"%2d" );
                   sortedМap.put(in,x);
                  // monthMaxDate[i]=i+"";
                  // monthMinDate[i]=i+"."+j;
                    System.out.print ( MultiTable[ i ][ j ] + " " );

                }
            }
            System.out.println ( );

        }

        //for ( int j = 1 ; j <= 12 ; j++ ) {


           // System.out.print ( monthMin[ j ] + " " );
        //}
        //System.out.println ( );
        //for ( int j = 1 ; j <= 12 ; j++ ) {


        //    System.out.print ( monthMax[ j ] + " " );
       // }
        //System.out.println ( );
       /* for ( int j = 1 ; j <= 12 ; j++ ) {


            System.out.print ( monthMaxDate[ j ] + " " );
        }
        System.out.println ( );
        for ( int j = 1 ; j <= 12 ; j++ ) {


            System.out.print ( monthMinDate[ j ] + " " );
        }*/

        TreeMap<String,Integer> tree_map
                = new TreeMap<String,Integer>();
        tree_map.putAll ( sortedМap );
        System.out.println("TreeMap: " + tree_map);



        System.out.println ( );
    }
}







