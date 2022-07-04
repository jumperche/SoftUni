package softUni;

import java.util.Scanner;

public class filmPremiere {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
String name= scanner.nextLine ( );
String food= scanner.nextLine ( );
int tickets=Integer.parseInt ( scanner.nextLine ( ) );
double sum=0;
double pr=0;
switch (name){
    case "John Wick":
        if (food.equals ( "Drink" )){
            sum=tickets*12;
        }
        else if (food.equals ( "Popcorn" )){
            sum=tickets*15;
        }
        else if (food.equals ( "Menu" )){
            sum=tickets*19;
        }
        break;
    case "Star Wars":
        if (tickets>=4) {
            pr = 0.30;
        }
         if (food.equals ( "Drink" )){
            sum=tickets*18;
            sum=sum-(sum*pr);
        }
        else if (food.equals ( "Popcorn" )){
            sum=tickets*25;
                sum=sum-(sum*pr);
        }
        else if (food.equals ( "Menu" )){
            sum=tickets*30;
                sum=sum-(sum*pr);
        }
        break;
    case "Jumanji":
        if (tickets==2){
            pr=0.15;
        }
         if (food.equals ( "Drink" )){
            sum=tickets*9;
            sum=sum-(sum*pr);
        }
        else if (food.equals ( "Popcorn" )){
            sum=tickets*11;
            sum=sum-(sum*pr);
        }
        else if (food.equals ( "Menu" )){
            sum=tickets*14;
            sum=sum-(sum*pr);
        }
        break;
}

        System.out.printf ( "Your bill is %.2f leva.",sum );
    }
}
