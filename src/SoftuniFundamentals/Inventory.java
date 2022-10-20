package SoftuniFundamentals;
//You will receive a journal with some collecting items, separated with a comma and a space (", "). After that, until receiving "Craft!" you will be receiving different commands split by " - ":
//•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists, you should skip this line.
//•	"Drop - {item}" - you should remove the item from your inventory if it exists.
//•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists. If so, add the new item after the old one. Otherwise, ignore the command.
//•	"Renew – {item}" – if the given item exists, you should change its position and put it last in your inventory.You will receive a journal with some collecting items, separated with a comma and a space (", "). After that, until receiving "Craft!" you will be receiving different commands split by " - ":
//•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists, you should skip this line.
//•	"Drop - {item}" - you should remove the item from your inventory if it exists.
//•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists. If so, add the new item after the old one. Otherwise, ignore the command.
//•	"Renew – {item}" – if the given item exists, you should change its position and put it last in your inventory.

//Iron, Wood, Sword
//Collect - Gold
//Drop - Wood
//Craft!

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class
Inventory {
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
