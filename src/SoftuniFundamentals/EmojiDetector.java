package SoftuniFundamentals;
//Your task is to write a program that extracts emojis from a text and find the threshold based on the input.
//You have to get your cool threshold. It is obtained by multiplying all the digits found in the input.  The cool threshold could be a huge number, so be mindful.
//An emoji is valid when:
//•	It is surrounded by 2 characters, either "::" or "**"
//•	It is at least 3 characters long (without the surrounding symbols)
//•	It starts with a capital letter
//•	Continues with lowercase letters only
//Examples of valid emojis: ::Joy::, **Banana**, ::Wink::
//Examples of invalid emojis: ::Joy**, ::fox:es:, **Monk3ys**, :Snak::Es::
//You need to count all valid emojis in the text and calculate their coolness. The coolness of the emoji is determined by summing all the ASCII values of all letters in the emoji.
//Examples: ::Joy:: - 306, **Banana** - 577, ::Wink:: - 409
//You need to print the result of the cool threshold and, after that to take all emojis out of the text, count them and print only the cool ones on the console.

//In the Sofia Zoo there are 311 animals in total! ::Smiley:: This includes 3 **Tigers**, 1 ::Elephant:, 12 **Monk3ys**, a **Gorilla::, 5 ::fox:es: and 21 different types of :Snak::Es::. ::Mooning:: **Shy**
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        String regexEmoji = "([*:])(\\1)([A-Z][a-z]{2,})(\\1{2})";
        String regexnumber = "\\d";
        List< String > emoji = new ArrayList< String > ( );
        Pattern pattern = Pattern.compile ( regexEmoji );
        Matcher matcher = pattern.matcher ( input );
        int sum = 1;
        while ( matcher.find ( ) ) {
            emoji.add ( matcher.group ( 1 ) + matcher.group ( 2 ) + matcher.group ( 3 ) + matcher.group ( 4 ) );
        }
        pattern = pattern.compile ( regexnumber );
        matcher = pattern.matcher ( input );
        while ( matcher.find ( ) ) {
            int helper = Integer.parseInt ( matcher.group ( ) );
            sum = sum * helper;
        }
        System.out.println ( "Cool threshold: " + sum );
        System.out.printf ( "%d emojis found in the text. " , emoji.size ( ) );
        System.out.println ( "The cool ones are:" );
        for ( int i = 0 ; i < emoji.size ( ) ; i++ ) {
            int cool = 0;
            for ( int j = 0 ; j < emoji.get ( i ).length ( ) ; j++ ) {
                if ( emoji.get ( i ).charAt ( j ) != '*' && emoji.get ( i ).charAt ( j ) != ':' ) {
                    int ascii = (int) emoji.get ( i ).charAt ( j );
                    cool = cool + ascii;
                }
            }
            if ( cool > sum ) {
                System.out.println ( emoji.get ( i ) );
            }
        }
    }
}
