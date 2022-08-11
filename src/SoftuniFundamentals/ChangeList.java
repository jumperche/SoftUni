package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//Write a program, which reads a list of integers from the console and receives commands, which manipulate the list. Your program may receive the following commands:
//•	Delete {element} - delete all elements in the array, which are equal to the given element
//•	Insert {element} {position} - insert element at the given position
//You should stop the program when you receive the command "end". Print all numbers in the array separated with a single whitespace.
public class ChangeList {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String[] command=new String[3];
        command=scanner.nextLine ().split ( " " );
        while ( !command[0].equals ( "end" ) ){
            switch (command[0]) {
                case "Delete":
                    int value = Integer.parseInt ( command[ 1 ] );
                    for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                        if ( list.get ( i ) == value ) {
                            list.remove ( i );
                        }
                    }
                    break;

                case "Insert":
                    int valueI = Integer.parseInt ( command[ 1 ] );
                    int index = Integer.parseInt ( command[ 2 ] );
                    list.add ( index , valueI );
                    break;
            }
            command=scanner.nextLine ().split ( " " );
        }
        System.out.println (list.toString ().replaceAll ( "[\\[\\],]","" ) );
    }
    }

