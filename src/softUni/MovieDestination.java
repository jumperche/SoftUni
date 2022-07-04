package softUni;

import java.util.Scanner;

public class MovieDestination {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
int budget=Integer.parseInt ( scanner.nextLine ( ) );
String dest= scanner.nextLine ( );
String sesson= scanner.nextLine ( );
int day=Integer.parseInt ( scanner.nextLine ( ) );
double sum=0;
switch (dest){
    case "Dubai":
        if (sesson.equals ( "Winter" )){
            sum=day*45000;
            sum=sum-(sum*0.30);
        }
        else if (sesson.equals ( "Summer" )){
            sum=day*40000;
            sum=sum-(sum*0.30);
        }
        break;
    case "Sofia":
        if (sesson.equals ( "Winter" )){
            sum=day*17000;
            sum=sum+(sum*0.25);
        }
        else if (sesson.equals ( "Summer" )){
            sum=day*12500;
            sum=sum+(sum*0.25);
        }

        break;

    case "London":
        if (sesson.equals ( "Winter" )){
            sum=day*24000;

        }
        else if (sesson.equals ( "Summer" )){
            sum=day*20250;

        }

        break;
}
 if (budget>=sum){
     System.out.printf ("The budget for the movie is enough! We have %.2f leva left!",budget-sum );
 }
else {
     System.out.printf( "The director needs %.2f leva more!",sum-budget);
 }
    }
}
