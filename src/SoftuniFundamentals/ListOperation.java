package SoftuniFundamentals;
//You will be given numbers (list of integers) on the first input line. Until you receive "End" you will be given operations you have to apply on the list. The possible commands are:
//•	Add {number} - add number at the end
//•	Insert {number} {index} - insert number at given index
//•	Remove {index} - remove that index
//•	Shift left {count} - first number becomes last 'count' times
//•	Shift right {count} - last number becomes first 'count' times
//Note: The index given may be outside of the bounds of the array. In that case print "Invalid index".

import java.util.*;
import java.util.stream.*;

public class ListOperation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String[] command = new String[ 3 ];
        command = scanner.nextLine ( ).split ( " " );
        while ( !command[ 0 ].equals ( "End" ) ) {
            switch (command[ 0 ]) {
                case "Remove":
                    int value = Integer.parseInt ( command[ 1 ] );
                    //int index = Integer.parseInt ( command[ 2 ] );
                    if ( value > list.size ( ) ) {
                        System.out.println ( "Invalid index" );
                        break;
                    }
                    list.remove ( value );
                    break;
                case "Insert":
                    value = Integer.parseInt ( command[ 1 ] );
                    int index = Integer.parseInt ( command[ 2 ] );
                    if ( index > list.size ( ) ) {
                        System.out.println ( "Invalid index" );
                        continue;
                    }
                    list.add ( index , value );
                    break;
                case "Add":
                    value = Integer.parseInt ( command[ 1 ] );
                    list.add ( value );
                    break;
                case "Shift":
                    if ( command[ 1 ].equals ( "left" ) ) {
                        index = Integer.parseInt ( command[ 2 ] );
                        for ( int i = 0 ; i < index ; i++ ) {
                            list.add ( list.get ( 0 ) );
                            list.remove ( 0 );
                        }
                    } else {
                        index = Integer.parseInt ( command[ 2 ] );

                        for ( int i = 0 ; i < index ; i++ ) {
                            int end = list.size ( ) - 1;
                            list.add ( 0 , list.get ( end ) );
                            int x = end + 1;
                            list.remove ( list.size ( ) - 1 );
                        }
                    }
            }
            command = scanner.nextLine ( ).split ( " " );
        }
        System.out.println ( list.toString ( ).replaceAll ( "[\\[\\],]" , "" ) );
    }
}
