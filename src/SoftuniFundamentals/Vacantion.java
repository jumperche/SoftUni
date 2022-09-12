package SoftuniFundamentals;
//You are given a group of people, type of the group, on which day of the week they will stay. Based on that information, calculate how much they must pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.
import java.util.*;

public class Vacantion {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String group= scanner.nextLine ( );
        String day= scanner.nextLine ( );
        double price=0;
        switch (day){
            case "Friday":
                if (group.equals ( "Students" )) {
                    price = 8.45 * n;
                    if ( n >= 30 ){
                        price=price-(price*0.15);
                    }
                }
                    else if ( group.equals ( "Business" ) ) {
                    price=10.9*n;
                    if ( n >= 100 ){
                        price=price-(10*10.9);
                    }
                } else if ( group.equals ( "Regular" ) ) {
                    price=15*n;
                    if (n>=10&&n<=20){
                        price=price-(price*0.05);
                    }
                }
                break;
            case "Saturday":
                if (group.equals ( "Students" )){
                    price=9.80*n;
                    if ( n >= 30 ){
                        price=price-(price*0.15);
                    }
                } else if ( group.equals ( "Business" ) ) {
                    price=15.6*n;
                    if ( n >= 100 ){
                        price=price-(10*15.6);
                    }
                } else if ( group.equals ( "Regular" ) ) {
                    price=20*n;
                    if (n>=10&&n<=20){
                        price=price-(price*0.05);
                    }
                }
                break;
            case "Sunday":
                if (group.equals ( "Students" )){
                    price=10.46*n;
                    if ( n >= 30 ){
                        price=price-(price*0.15);
                    }
                } else if ( group.equals ( "Business" ) ) {
                    price=16*n;
                    if ( n >= 100 ){
                        price=price-(10*16);
                    }
                } else if ( group.equals ( "Regular" ) ) {
                    price=22.5*n;
                    if (n>=10&&n<=20){
                        price=price-(price*0.05);
                    }
                }
                break;
        }
        System.out.printf ("Total price: %.2f",price );

    }
}
