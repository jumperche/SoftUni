package SoftuniFundamentals;
//Write a regular expression to match a valid phone number from Sofia. After you find all valid phones, print them on the console, separated by a comma and a space ", ".
//Compose the Regular Expression
//A valid number has the following characteristics:
//•	It starts with "+359".
//•	Then, it is followed by the area code (always 2).
//•	After that, it's followed by the number itself:
//o	The number consists of 7 digits (separated into two groups of 3 and 4 digits, respectively).
//•	The different parts are separated by either a space or a hyphen ('-').
//You can use the following RegEx properties to help with the matching:
//•	Use quantifiers to match a specific number of digits.
//•	Use a capturing group to ensure the delimiter is only one of the allowed characters (space or hyphen) and not a combination of both (e.g., +359 2-111 111 has mixed delimiters, it is invalid). Use a group back reference to achieve this.
//•	Add a word boundary at the end of the match to avoid partial matches (the last example is on the right-hand side).
//•	Ensure that before the '+' sign, there is either a space or the beginning of the string.

//+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222, +359-2-222-222, +359-2-222-22222 +359-2-222-2222
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherPhoneNumber {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        Pattern pattern=Pattern.compile ( "\\+359([ -])2\\1([0-9]{3})\\1([0-9]{4})\\b" );
        Matcher matcher= pattern.matcher ( input);
        List<String> match=new LinkedList<> (  );
     while ( matcher.find ( ) ){
         match.add ( matcher.group () );
     }
        System.out.println (String.join ( ", ",match) );
    }
}
