package softUni;

import java.util.Scanner;

public class HairSalon {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int goal = Integer.parseInt ( scanner.nextLine ( ) );
        String input = scanner.nextLine ( );
        int sum=0;
while ( !input.equals ( "closed" ) ){
    String in=scanner.nextLine ();
    switch (input){
        case "haircut":
            if (in.equals ( "mens" )){
                sum=sum+15;
            }
            else if(in.equals ( "ladies" )){
                sum=sum+20;
            }
            if(in.equals ( "kids" )){
                sum=sum+10;
            }
            break;
        case "color":
            if (in.equals ( "touch up" )){
                sum=sum+20;}
                else if (in.equals ( "full color" )){
                    sum=sum+30;
                }
                break;
            }
            if (sum>=goal){
                break;
    }
input= scanner.nextLine ( );

}
        if (sum>=goal){
            System.out.printf ( "You have reached your target for the day!%n" );

        }
else {
            System.out.printf ( "Target not reached! You need %dlv. more.%n",goal-sum );
        }
        System.out.printf ( "Earned money: %dlv.",sum );
    }
}
