package SoftuniFundamentals;
//Let's take a break and visit the game bar at SoftUni. It is about time for the people behind the bar to go home, and you are the person who has to draw the line and calculate the money from the products that were sold throughout the day. Until you receive a line with the text "end of shift", you will be given lines of input. But before processing that line, you have to do some validations first.
//Each valid order should have a customer, product, count, and price:
//•	Valid customer's name should be surrounded by '%' and must start with a capital letter, followed by lower-case letters.
//•	Valid product contains any word character and must be surrounded by '<' and '>'.
//•	The valid count is an integer surrounded by '|'.
//•	The valid price is any real number followed by '$'.
//The parts of a valid order should appear in the order given: customer, product, count, and price.
//Between each part there can be other symbols, except ('|', '$', '%' and '. ')
//For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
//When you receive "end of shift", print the total amount of money for the day rounded to 2 decimal places in the following format: "Total income: {income}".

//%InvalidName%<Croissant>|2|10.3$
//%Peter%<Gum>1.3$
//%Maria%<Cola>|1|2.4
//%Valid%<Valid>valid|10|valid20$
//end of shift
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        String regex = "^%([A-Z][a-z]+)%[^%.|$]*<(\\w+)>[^%.|$]*\\|(\\d+)\\|[^%.|$]*?(\\d+.?\\d*)\\$$";
        Pattern pattern = Pattern.compile ( regex );

        double total=0;
        while ( !input.equals ( "end of shift" ) ) {
            Matcher matcher = pattern.matcher ( input );
            if ( matcher.find ( ) ) {
                String name = matcher.group ( 1 );
                String product = matcher.group ( 2 );
                int count = Integer.parseInt ( matcher.group ( 3 ) );
                double price = Double.parseDouble ( matcher.group ( 4 ) );
                double sum = 0;
                sum = count * price;
                System.out.printf ( "%s: %s - %.2f%n" , name , product , sum );
                total += sum;
            }
            input = scanner.nextLine ( );
        }
        System.out.printf ( "Total income: %.2f",total );
    }
}
