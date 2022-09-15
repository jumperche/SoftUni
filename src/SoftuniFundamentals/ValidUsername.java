package SoftuniFundamentals;
//Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
//A valid username is:
//•	Has a length of between 3 and 16 characters.
//•	It contains only letters, numbers, hyphens, and underscores.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsername {
    public static void main ( String[] args ) {
        boolean correct=true;
        Scanner scanner = new Scanner ( System.in );
        List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( ", " ) ).collect ( Collectors.toList ( ) );
        for ( int i = 0 ; i < input.size ( ) ; i++ ) {
            correct=true;
            for ( int j = 0 ; j < input.get ( i ).length ( ) ; j++ ) {

              char helper= input.get ( i ).charAt ( j );
                if ( input.get ( i ).length ()>16||input.get ( i ).length ()<3 ) {
                    correct=false;
                    break;
                }
                if (Character.isLetter ( helper )){

                } else if ( Character.isDigit ( helper ) ) {

                } else if ( helper=='-' ) {

                } else  if ( helper!='_' ) {
                    correct=false;
                    break;
                }

            }
            if (correct==true){
                System.out.println (input.get ( i ) );
            }
        }






    }
}
