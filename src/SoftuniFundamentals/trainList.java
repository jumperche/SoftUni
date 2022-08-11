package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//On the first line, you will be given a list of wagons (integers). Each integer represents the number of passengers that are currently in each wagon. On the next line, you will get the max capacity of each wagon (single integer). Until you receive "end" you will be given two types of input:
//•	Add {passengers} - add a wagon to the end with the given number of passengers
//•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//At the end print the final state of the train (all the wagons separated by a space)
public class trainList {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        int max = Integer.parseInt ( scanner.nextLine ( ) );
        String[] command = new String[ 2 ];
        command = scanner.nextLine ( ).split ( " " );
        while ( !command[0].equals ( "end" ) ){
            if (command[0].equals ( "Add" )){
                list.add ( Integer.parseInt ( command[ 1 ] ) );
            }
            else {
                int value=Integer.parseInt ( command[ 0 ] );
                for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                    if (list.get ( i )+value<=max){
                        list.set ( i, list.get ( i)+value );
                        break;
                    }
                }
            }


            command = scanner.nextLine ( ).split ( " " );
        }
        System.out.println (list.toString ().replaceAll ( "[\\[\\],]","" ) );
    }
}
