package SoftuniFundamentals;
//You are about to make some good money, but first, you need to think of a way to verify who paid for your product and who didn't. You have decided to let people use the software for a free trial period and then require an activation key to continue using the product. Before you can cash out, the last step is to design a program that creates unique activation keys for each user. So, waste no more time and start typing!
//The first line of the input will be your raw activation key. It will consist of letters and numbers only.
//After that, until the "Generate" command is given, you will be receiving strings with instructions for different operations that need to be performed upon the raw activation key.
//There are several types of instructions, split by ">>>":
//•	"Contains>>>{substring}":
//o	If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
//o	Otherwise, prints: "Substring not found!"
//•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
//o	Changes the substring between the given indices (the end index is exclusive) to upper or lower case and then prints the activation key.
//o	All given indexes will be valid.
//•	"Slice>>>{startIndex}>>>{endIndex}":
//o	Deletes the characters between the start and end indices (the end index is exclusive) and prints the activation key.
//o	Both indices will be valid.

//abcdefghijklmnopqrstuvwxyz
//Slice>>>2>>>6
//Flip>>>Upper>>>3>>>14
//Flip>>>Lower>>>5>>>7
//Contains>>>def
//Contains>>>deF
//Generate
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AktivationKeys {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        String[] token = scanner.nextLine ( ).split ( ">>>" );
        while ( !token[ 0 ].equals ( "Generate" ) ) {


            switch (token[ 0 ]) {
                case "Contains": {
                    String regex = token[ 1 ];
                    Pattern pattern = Pattern.compile ( regex );
                    Matcher matcher = pattern.matcher ( input );
                    if ( matcher.find ( ) ) {
                        System.out.println ( input+" contains "+regex );
                    } else {
                        System.out.println ( "Substring not found!" );
                    }
                    break;
                }
                case "Flip": {
                    int start = Integer.parseInt ( token[ 2 ] );
                    int end = Integer.parseInt ( token[ 3 ] );
                    if ( token[ 1 ].equals ( "Upper" ) ) {
                        String helper = input.substring ( start , end ).toUpperCase ( );
                        String old=input.substring ( start , end );
                        input = input.replaceFirst ( old, helper );

                    } else if ( token[ 1 ].equals ( "Lower" )){
                        String helper = input.substring ( start , end ).toLowerCase ( );
                        String old=input.substring ( start , end );
                        input = input.replaceFirst ( old, helper );

                    }
                    System.out.println ( input );
                    break;
                }
                case "Slice": {
                    int start = Integer.parseInt ( token[ 1 ] );
                    int end = Integer.parseInt ( token[ 2 ] );
                    String delete = input.substring ( start , end );
                    input=input.replaceFirst ( delete,"" );

                    System.out.println ( input );
                }
                break;
            }
            token = scanner.nextLine ( ).split ( ">>>" );
        }
        System.out.println ( "Your activation key is: " + input );
    }
}
