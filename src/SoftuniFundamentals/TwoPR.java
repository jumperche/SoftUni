package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TwoPR {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            String input=scanner.nextLine();
            String regex="^(\\$?%?)(?<name>[A-Z]{1}[a-z]{2,})\\1: (\\[\\d+\\]\\|){3}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            String out="";

            if ( matcher.find ( ) ){

                   String index=matcher.group(3);
                    Pattern pa=Pattern.compile("(\\[)(\\d+)(\\]\\|)");
                    Matcher m = pa.matcher(input);
                    while (m.find()) {
                        int helper=Integer.parseInt(m.group(2));
                        char cha=Character.valueOf ( (char) helper );
                        out +=cha;
                    }



                System.out.printf ("%s: %s%n",matcher.group(2),out );
            }
            else {
                System.out.println ("Valid message not found!" );
            }
        }
    }
}
