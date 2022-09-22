package SoftuniFundamentals;
//Write a program that prints a sum of all characters between two given characters (their ASCII code). In the first line, you will get a character. In the second line, you get another character. On the last line, you get a random string. Find all the characters between the two given and print their ASCII sum.
import java.util.Scanner;

public class AsciiSumator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        char start = scanner.nextLine ( ).charAt ( 0 );
        char end = scanner.nextLine ( ).charAt ( 0 );
        String input=scanner.nextLine ();
int sum=0;
        for ( int i = 0 ; i < input.length ( ) ; i++ ) {
            char help=input.charAt ( i );
            int ascii=input.charAt ( i );
            if (help>start&&help<end){
                sum=sum+ascii;
            }
        }
        System.out.println ( sum );
    }
}
