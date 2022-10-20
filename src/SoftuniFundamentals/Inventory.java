package SoftuniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > list = Arrays.stream ( scanner.nextLine ( ).split ( ", " ) )
                .collect ( Collectors.toList ( ) );
        String[] input = scanner.nextLine ( ).split ( " - " );
        while ( !input[ 0 ].equals ( "Craft!" ) ) {

            switch (input[ 0 ]) {
                case "Collect": {
                    String helper = input[ 1 ];
                    if ( !list.contains ( helper ) ) {
                        list.add ( helper );
                    }

                    break;
                }
                case "Drop": {
                    String helper = input[ 1 ];

                    list.remove ( helper );
                    break;
                }
                case "Combine Items": {
                    String helper = input[ 1 ];
                    String old = helper.split ( ":" )[ 0 ];
                    String newT = helper.split ( ":" )[ 1 ];
                    if ( list.contains ( old ) ) {
                        int index = list.indexOf ( old ) + 1;
                        list.add ( index , newT );
                    }

                    break;
                }
                case "Renew": {
                    String helper = input[ 1 ];
                    if ( list.contains ( helper ) ) {
                        list.remove ( helper );
                        list.add ( helper );
                    }

                    break;
                }

            }
            input = scanner.nextLine ( ).split ( " - " );
        }
        System.out.println ( String.join ( ", " , list ) );

    }
}
