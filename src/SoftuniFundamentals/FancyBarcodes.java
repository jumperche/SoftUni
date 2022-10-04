package SoftuniFundamentals;
//Your first task is to determine if the given sequence of characters is a valid barcode or not.
//Each line must not contain anything else but a valid barcode. A barcode is valid when:
//•	It is surrounded by a "@" followed by one or more "#"
//•	It is at least 6 characters long (without the surrounding "@" or "#")
//•	It starts with a capital letter
//•	It contains only letters (lower and upper case) and digits
//•	It ends with a capital letter
//Examples of valid barcodes: @###Che46sE@##, @#FreshFisH@#, @###Brea0D@###, @##Che46sE@##
//Examples of invalid barcodes: ##InvaliDiteM##, @InvalidIteM@, @#Invalid_IteM@#
//Next, you have to determine the product group of the item from the barcode. The product group is obtained by concatenating all the digits found in the barcode. If there are no digits present in the barcode, the default product group is "00".
//Examples:
//@#FreshFisH@# -> product group: 00
//@###Brea0D@### -> product group: 0
//@##Che4s6E@## -> product group: 46
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String regex="@#+([A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        String regexGroup="([0-9])";


        for ( int i = 0 ; i < n ; i++ ) {
            String input=scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

               if ( matcher.find ( ) ) {
                    String helper=matcher.group(1);
                    Pattern patternGroup = Pattern.compile ( regexGroup);
                    Matcher matcherGroup = patternGroup.matcher ( helper );
                   String group="";
                        if ( matcherGroup.find ( ) ) {
                            group = group + matcherGroup.group ( );
                            while ( matcherGroup.find ( ) ){
                                group = group + matcherGroup.group ( );
                            }
                        } else {
                            group = "00";
                        }
                   System.out.println ("Product group: "+group );
                }
               else {
                   System.out.println ("Invalid barcode");
               }
            }
    }
}
