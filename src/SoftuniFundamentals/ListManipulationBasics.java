package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
//Add {number}: add a number to the end of the list
//Remove {number}: remove a number from the list
//RemoveAt {index}: remove a number at a given index
//Insert {number} {index}: insert a number at a given index
//Note: All the indices will be valid!
//When you receive the "end" command print the final state of the list (separated by spaces).
public class ListManipulationBasics {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String[] command=new String[3];
         command=scanner.nextLine ().split ( " " );
        while ( !command[0].equals ( "end" ) ){
            switch (command[0]){
                case "Add":
                    add(Integer.parseInt ( command[ 1 ] ),list);
                    break;
                case "Remove":
                    remove(Integer.parseInt ( command[ 1 ] ),list);
                    break;
                case "RemoveAt":
                    removeAt(Integer.parseInt ( command[ 1 ] ),list);
                    break;
                case "Insert":
                    insert(Integer.parseInt ( command[ 1 ] ),Integer.parseInt ( command[ 2 ] ),list);
                    break;
            }
            command=scanner.nextLine ().split ( " " );
        }
        System.out.println (list.toString ().replaceAll ( "[\\[\\],]","" ) );
    }

    private static void insert ( int number,int index,List list ) {
        list.add ( index,number );
    }

    private static void removeAt ( int index,List list ) {
        list.remove ( index );
    }

    private static void remove ( int number,List list ) {
        list.remove ( Integer.valueOf ( number) );
    }

    private static void add ( int number,List list ) {
        list.add(number);
    }
}
