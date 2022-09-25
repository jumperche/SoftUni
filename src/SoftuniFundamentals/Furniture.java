package SoftuniFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        double sum=0;
        System.out.println ("Bought furniture:" );
        while ( !input.equals ( "Purchase" ) ){
String regex=">>([A-Z]{0,}[a-z]*)<<(\\d+.?\\d?\\d?)!(\\d+)";
Pattern pattern=Pattern.compile ( regex );
Matcher matcher= pattern.matcher ( input);

while ( matcher.find ( ) ){
    double price=Double.parseDouble ( matcher.group (2));
    int quantity=Integer.parseInt ( matcher.group (3) );
    sum=sum+price*quantity;
    System.out.println (matcher.group (1) );
}

            input = scanner.nextLine ( );
        }
        System.out.printf ("Total money spend: %.2f",sum );
    }
}
