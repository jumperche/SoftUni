package SoftuniFundamentals;
//Write a program, which keeps the information about products and their prices. Each product has a name, a price, and its quantity. If the product doesn't exist yet, add it with its starting quantity.
//If you receive a product, which already exists, increases its quantity by the input quantity and if its price is different, replace the price as well.
//You will receive products' names, prices, and quantities on new lines. Until you receive the command "buy", keep adding items. When you do receive the command "buy", print the items with their names and the total price of all the products with that name.
import java.util.*;
import java.util.stream.Collectors;

public class Orders1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
        Map <String,Double> mapPrice=new LinkedHashMap<> (  );
        Map <String,Integer> mapQuantity=new LinkedHashMap<> (  );
        while ( !input.get ( 0 ).equals ( "buy" ) ){
            mapPrice.putIfAbsent ( input.get ( 0) ,0.00 );
            mapPrice.put ( input.get ( 0) ,Double.parseDouble ( input.get ( 1) )) ;
            mapQuantity.putIfAbsent ( input.get ( 0) ,0 );
            mapQuantity.put ( input.get ( 0) ,Integer.parseInt ( input.get ( 2) )+ mapQuantity.get ( input.get ( 0 )) );
            input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
        }
        for ( Map.Entry< String, Integer > entry : mapQuantity.entrySet ( ) ) {
            System.out.printf ( "%s -> %.2f%n",entry.getKey (),entry.getValue ()* mapPrice.get ( entry.getKey ()) );
        }

    }
}
