package SoftuniFundamentals;

import java.util.*;

//A palindrome is a number that reads the same backward as forward, such as 323 or 1001. Write a program that reads a positive integer number until you receive "END".
// For each numbered print whether the number is palindrome or not.
public class PalindromeIntegers {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
       String input=scanner.nextLine ();
       while ( !input.equals ( "END" ) ) {
           System.out.println ( reverse ( input ) );
           input=scanner.nextLine ();
       }
    }
    public static boolean reverse(String input){

       String help="";
        for ( int i = input.length ()-1 ; i >=0 ; i-- ) {
            help=help+input.charAt ( i );
        }
        if (input.equals ( help )){
            return true;
        }
        else {
            return false;
        }
    }
}
