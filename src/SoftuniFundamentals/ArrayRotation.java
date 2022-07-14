package SoftuniFundamentals;
//Write a program that receives an array and the number of rotations you have to perform
 //       (the first element goes at the end) Print the resulting array.
import java.util.*;

public class ArrayRotation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] n =  scanner.nextLine ( ).split ( " " ) ;
        String []news=new String[n.length];
        int key=Integer.parseInt ( scanner.nextLine () );
        if (key==n.length){

            for ( int i = 0 ; i < n.length ; i++ ) {
                System.out.print (n[i]+" " );

            }
        }else  if (key>n.length) {
            key = key - n.length;

        }if (key<n.length)
        {
                for ( int i = key ; i < n.length ; i++ ) {
                    news[ key - key ] = n[ i ];
                    System.out.print ( news[ key - key ] + " " );
                }
                for ( int i = 0 ; i < key ; i++ ) {
                    news[ i + key ] = n[ i ];
                    System.out.print ( news[ i + key ] + " " );
                }
            }
        }
        }


