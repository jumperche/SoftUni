package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Write a program that receives a single string and on the first line prints all the digits, on the second – all the letters, and on the third – all the other characters. There will always be at least one digit, one letter, and another character.
public class DigitLetterOther {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        StringBuilder digit=new StringBuilder ();
        StringBuilder letter=new StringBuilder ();
        StringBuilder other=new StringBuilder ();

        for ( int i = 0 ; i <input.length () ; i++ ) {
            char help=input.charAt ( i );
            if (Character.isDigit ( help )){
                digit.append ( help );
            } else if ( Character.isLetter ( help ) ) {
                letter.append ( help );
            }
            else{
                other.append ( help );
            }
        }
        System.out.println (digit );
        System.out.println (letter);
        System.out.println (other);
    }
}
