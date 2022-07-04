package softUni;

import java.util.Scanner;

public class TuristShop {
    public static void main ( String[] args ) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble ( scanner.nextLine ( ) );
        String product= scanner.nextLine ( );
        int counter=0;
        double sum=0;
        while ( !product.equals ( "Stop" ) ){
            double price=Double.parseDouble ( scanner.nextLine ( ) );
            counter++;
            if (counter%3==0){
                price=price/2;
                            }

if (price>budget){
    System.out.println ( "You don't have enough money!" );
    System.out.printf ("You need %.2f leva!", price-budget );
    break;
}
budget=budget-price;
            sum=sum+price;
             product= scanner.nextLine ( );
        }
        if ("Stop".equals ( product )) {
            System.out.printf ( "You bought %d products for %.2f leva.%n" , counter , sum );
        }
    }
}
