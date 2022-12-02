package SoftuniFundamentals;
//You will be receiving several input lines which contain data about dwarfs in the following format:
//"{dwarfName} <:> {dwarfHatColor} <:> {dwarfPhysics}"
//The dwarfName and the dwarfHatColor are strings. The dwarfPhysics is an integer.
//You must store the dwarfs in your program. There are several rules, though:
//•	If 2 dwarfs have the same name but different hat colors, they should be considered different dwarfs, and you should store both of them.
//•	If 2 dwarfs have the same name and the same hat color, store the one with the higher physics.
//When you receive the command "Once upon a time", the input ends. You must order the dwarfs by physics in descending order and then by the total count of dwarfs with the same hat color in descending order.
//Then you must print them all.
//Input
//•	The input will consist of several input lines containing dwarf data in the format specified above.
//•	The input ends when you receive the command "Once upon a time".
//Output
//•	As output, you must print the dwarfs ordered as specified above.
//•	The output format is: "({hatColor}) {name} <-> {physics}".
//Constraints
//•	The dwarfName will be a string that may contain any ASCII character except ' ' (space), '<', ':', '>'.
//•	The dwarfHatColor will be a string which may contain any ASCII character except ' ' (space), '<', ':', '>'.
//•	The dwarfPhysics will be an integer in the range [0, 231 - 1].
//•	There will be no invalid input lines.
//•	If all sorting criteria fail, the order should be by order of input.
//•	It allowed working time/memory: 100ms/16MB.

//Peter <:> Red <:> 2000
//Todor <:> Blue <:> 1000
//George <:> Green <:> 1000
//Smith <:> Yellow <:> 4500
//Premis <:> Sam <:> 1000
//Once upon a time
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Snowwhite {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( " <:> " );

        Map< String, Integer > color = new HashMap<> ( );
        Map< String, Integer > map = new LinkedHashMap<> ( );
        while ( !input[ 0 ].equals ( "Once upon a time" ) ) {

            String dwarf = "(" + input[ 1 ] + ") " + input[ 0 ];
            int psy = Integer.parseInt ( input[ 2 ] );
            if ( map.containsKey ( dwarf ) ) {

                if ( map.get ( dwarf ) < psy ) {
                    map.put ( dwarf , psy );
                    if ( !color.containsKey ( input[ 1 ] ) ) {
                        color.put ( input[ 1 ] , 1 );
                    }
                }
            } else {
                map.put ( dwarf , psy );

                if ( color.containsKey ( input[ 1 ] ) ) {
                    color.put ( input[ 1 ] , color.get ( input[ 1 ] ) + 1 );
                } else {
                    color.put ( input[ 1 ] , 1 );
                }
            }
            input = scanner.nextLine ( ).split ( " <:> " );
        }
        color = color.entrySet ( ).stream ( ).sorted ( Map.Entry.comparingByValue ( Comparator.reverseOrder ( ) ) )
                .collect ( Collectors.toMap ( Map.Entry::getKey , Map.Entry::getValue , ( e1 , e2 ) -> e1 , LinkedHashMap::new ) );

        Map< String, Integer > out = new LinkedHashMap<> ( );
        for ( Map.Entry< String, Integer > entry : color.entrySet ( ) ) {

            for ( Map.Entry< String, Integer > Entry : map.entrySet ( ) ) {
                int first = Entry.getKey ( ).indexOf ( "(" );
                int second = Entry.getKey ( ).indexOf ( ")" );
                String helper = Entry.getKey ( ).substring ( first + 1 , second );
                if ( helper.equals ( entry.getKey ( ) ) ) {
                    out.put ( Entry.getKey ( ) , Entry.getValue ( ) );
                }
            }
        }


        LinkedHashMap< String, Integer > reverseSortedMap = new LinkedHashMap<> ( );
        out.entrySet ( ).stream ( ).sorted ( Map.Entry.comparingByValue ( Comparator.reverseOrder ( ) ) )
                .forEachOrdered ( x -> reverseSortedMap.put ( x.getKey ( ) , x.getValue ( ) ) );

        for ( Map.Entry< String, Integer > entry : reverseSortedMap.entrySet ( ) ) {
            System.out.printf ( "%s <-> %d%n",entry.getKey (),entry.getValue() );
        }
    }
}