package softUni;

import java.util.Scanner;

public class MovieDay {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner ( System.in );
        int time=Integer.parseInt ( scanner.nextLine ( ) );
        int broi=Integer.parseInt ( scanner.nextLine ( ) );
        int timeScene=Integer.parseInt ( scanner.nextLine ( ) );
        double pod=time*0.15;
        double sum=broi*timeScene+pod;
        if (sum<=time){
            System.out.printf ( "You managed to finish the movie on time! You have %.0f minutes left!",Math.ceil ( time-sum ));
        }
        else {
            System.out.printf ( "Time is up! To complete the movie you need %.0f minutes.",Math.ceil ( sum-time ));
        }
    }
}
