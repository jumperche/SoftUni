package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > list =
                Arrays.stream ( scanner.nextLine ( ).split ( "!" ) ).collect ( Collectors.toList ( ) );

        String in = scanner.nextLine ( );
        while ( !in.equals ( "Go Shopping!" ) ) {
            String[] input = in.split ( " " );
            String item = input[ 1 ];
            switch (input[ 0 ]) {
                case "Urgent":
                    if ( !list.contains ( item ) ) {
                        list.add ( 0 , item );
                    }
                    break;
                case "Unnecessary":

   // list.remove ( item );
                    if ( list.contains ( item ) ) {
                        int index=list.indexOf(item);
                        list.remove (index );

                    }

                    break;
                case "Correct":
                    String newItem = input[ 2 ];
                    if ( list.contains ( item ) ) {
                        int index = list.indexOf ( item );

                        list.set ( index , newItem );
                                            }
                    break;
                case "Rearrange":
                    if ( list.contains ( item ) ) {
                        int index=list.indexOf(item);
                        list.remove (index );
                        list.add ( item );
                    }
                    break;
            }
            in = scanner.nextLine ( );
        }
        System.out.println ( String.join ( ", " , list ) );

    }
}
