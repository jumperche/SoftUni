package Uni;

import java.util.Random;

public class Toto {
    public static void main ( String[] args ) {

double start=System.currentTimeMillis ();



                Random rand = new Random ( );
                for ( int number = 1 ; number <= 6 ; number++ ) {
                    int randomNumber = rand.nextInt ( 49 ) + 1;
                    System.out.printf ( "%d " , randomNumber );
                }
                double end=System.currentTimeMillis ();
        System.out.printf ("Time is: %f",(end-start)/1000.0 );
            }
        }


