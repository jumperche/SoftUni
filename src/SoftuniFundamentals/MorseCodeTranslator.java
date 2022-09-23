package SoftuniFundamentals;
//Write a program that translates messages from Morse code to English (capital letters).
// Use this page to help you (without the numbers). The words will be separated by a space (' ').
// There will be a "|" character which you should replace with ' ' (space).

//.. | -- .- -.. . | -.-- --- ..- | .-- .-. .. - . | .- | .-.. --- -. --. | -.-. --- -.. .
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( " | " );
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x',
                'y', 'z' };
        String[] code
                = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.." };
        String out="";
        for ( int i = 0 ; i < input.length ; i++ ) {
            for ( int j = 0 ; j < code.length ; j++ ) {
                if ( input[i].equals ( "|" )){
                    System.out.printf ( " " );
                    break;
                }
                if (input[i].equals ( code[j] )){
                    out=out+letter[j];
                }
            }
            String del=" ";
            System.out.print ( String.join ( " ",  out ).toUpperCase ().toString () );
            out="";
        }
    }
}
