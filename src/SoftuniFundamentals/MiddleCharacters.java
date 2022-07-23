package SoftuniFundamentals;

import java.util.*;

//You will receive a single string. Write a method that prints the middle character.
// If the length of the string is even, there are two middle characters.
public class MiddleCharacters {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        letters ( input );
    }
    public static void letters(String input){
        String x=input.charAt ( input.length ()/2)+"";
        String a=input.charAt ( input.length ()/2-1)+"";
        if (input.length ()%2==0){

                    String das= (a+x );
            System.out.println (das );
        }
        else {
            System.out.println (input.charAt ( input.length ()/2 ) );
        }
    }
}
