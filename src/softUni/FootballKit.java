package softUni;

import java.util.Scanner;

public class FootballKit {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double t = Double.parseDouble ( scanner.nextLine ( ) );
        double goal = Double.parseDouble ( scanner.nextLine ( ) );

double sh=t*0.75;
double ch=sh*0.2;
double shoe=2*(t+sh);
double sum=t+sh+ch+shoe;
sum=sum-(sum*0.15);
if (goal<=sum){
    System.out.printf ( "Yes, he will earn the world-cup replica ball!%n" );
    System.out.printf ( "His sum is %.2f lv.",sum );
}
else {
    System.out.printf ( "No, he will not earn the world-cup replica ball.%n" );
    System.out.printf ( "He needs %.2f lv. more.",goal-sum );
}

    }
}
