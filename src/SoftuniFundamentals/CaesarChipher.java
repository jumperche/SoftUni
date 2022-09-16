package SoftuniFundamentals;
//Write a program that returns an encrypted version of the same text. Encrypt the text by shifting each character with three positions forward. For example, A would be replaced by D, B would become E, and so on. Print the encrypted text.
import java.util.Scanner;

public class CaesarChipher {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        StringBuilder out=new StringBuilder ();
        for ( int i = 0 ; i <input.length ()  ; i++ ) {
            int ascii=input.charAt ( i )+3;
            char help=(char) ascii ;
            out.append ( help);
        }
        System.out.println (out );
    }
}
