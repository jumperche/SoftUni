package SoftuniFundamentals;
//Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        List< String > input = Arrays.stream (scanner.nextLine ( ).split ( " " ) ).collect( Collectors.toList());
        StringBuilder result=new StringBuilder (  );
        for ( int i = 0 ; i < input.size ( ) ; i++ ) {
            String help= input.get ( i);
            for ( int j = 0 ; j < help.length () ; j++ ) {
                result.append ( input.get ( i ));
            }
        }
        System.out.println (result );
    }
}
