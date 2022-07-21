package SoftuniFundamentals;
//Write a method that calculates the total price of an order and prints it on the console.
// The method should receive one of the following products: coffee, water, coke, snacks;
// and a quantity of the product. The prices for a single piece of each product are:
//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00
//Print the result rounded to the second decimal place.
import java.util.*;

public class order {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String produkt = scanner.nextLine ( );
        double price=Double.parseDouble ( scanner.nextLine () );
        order ( produkt,price );
    }
    public static void order(String produkt,double price){
        switch (produkt){
            case "coffee":
                System.out.printf ("%.2f",price*1.5 );
                break;
            case "water":
                System.out.printf ("%.2f",price*1 );
                break;
            case "coke":
                System.out.printf ("%.2f",price*1.4 );
                break;
            case "snacks":
                System.out.printf ("%.2f",price*2 );
                break;
        }
    }
}
