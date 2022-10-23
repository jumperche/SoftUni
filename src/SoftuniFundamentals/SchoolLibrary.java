package SoftuniFundamentals;
////exam problem 100/100 points
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > list =
                Arrays.stream ( scanner.nextLine ( ).split ( "\\&" ) ).collect ( Collectors.toList ( ) );
        String[] input = scanner.nextLine ( ).split ( " \\| " );
        while ( !input[ 0 ].equals ( "Done" ) ) {
            String helper = input[ 1 ];
            switch (input[ 0 ]) {
                case "Add Book":
                    if ( !list.contains ( helper ) ) {
                        list.add ( 0,helper );
                    }
                    break;
                case "Take Book":
                    list.remove ( helper );
                    break;
                case "Swap Books":
                    String book = input[ 2 ];
                    if ( list.contains ( helper ) & list.contains ( book ) ) {
                        int index1 = list.indexOf ( helper );
                        int index2 = list.indexOf ( book );
                        list.set ( index1 , book );
                        list.set ( index2 , helper );

                    }
                    break;
                case "Insert Book":
                    if ( !list.contains ( helper ) ) {
                        list.add ( helper );
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt ( input[ 1 ] );
                    if (index>=0&index< list.size ( ))
                    System.out.printf ( "%s%n" , list.get ( index ) );
                    break;
            }
            input = scanner.nextLine ( ).split ( " \\| " );
        }
        System.out.println(String.join(", ", list));
    }
}
