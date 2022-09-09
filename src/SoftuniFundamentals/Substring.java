package SoftuniFundamentals;
//On the first line, you will receive a string. On the second line, you will receive a second string. Write a program that removes all of the occurrences of the first String in the second until there is no match. At the end, print the remaining String.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Substring {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String find = scanner.nextLine ( );
        String input = scanner.nextLine ( );
        StringBuilder result=new StringBuilder ( input );

        while ( result.indexOf ( find )!=-1 ) {
            int index = result.indexOf ( find );
            result.replace (index,index+find.length (), "" );

        }
        System.out.println (result );
    }
}
