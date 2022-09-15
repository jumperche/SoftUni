package SoftuniFundamentals;
//You are playing a game, and your goal is to win a legendary item - any legendary item will be good enough. However, it's a tedious process, and it requires quite a bit of farming. The possible items are:
//•	"Shadowmourne" - requires 250 Shards
//•	"Valanyr" - requires 250 Fragments
//•	"Dragonwrath" - requires 250 Motes
//"Shards", "Fragments", and "Motes" are the key materials 	(case-insensitive), and everything else is junk.
//You will be given lines of input in the format:
//"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
//Keep track of the key materials - the first one that reaches 250, wins the race. At that point, you have to print that the corresponding legendary item is obtained.
//In the end, print the remaining shards, fragments, motes in the format:
//"shards: {numberOfShards}
//fragments: {numberOfFragments}
//motes: {numberOfMotes}"
//Finally, print the collected junk items in the order of appearance.
import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main ( String[] args ) throws InterruptedException {
        Scanner scanner = new Scanner ( System.in );
        //List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
        Map< String, Integer > keyMaterials = new LinkedHashMap<> ( );
        Map< String, Integer > junkMaterials = new LinkedHashMap<> ( );
        keyMaterials.put ( "shards" , 0 );
        keyMaterials.put ( "fragments" , 0 );
        keyMaterials.put ( "motes" , 0 );

        while ( true ) {
            List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
            for ( int i = 0 ; i <= input.size ( ) + 1 ; i++ ) {

                String help = input.get ( 1 ).toLowerCase ( Locale.ROOT );
                int helper = Integer.parseInt ( input.get ( 0 ) );
                if ( help.equals ( "shards" ) || help.equals ( "fragments" ) || help.equals ( "motes" ) ) {
                    //keyMaterials.putIfAbsent ( help , 0 );
                    keyMaterials.put ( help , keyMaterials.get ( help ) + helper );
                    input.remove ( 0 );
                    input.remove ( 0 );

                } else {
                    junkMaterials.putIfAbsent ( help , 0 );
                    junkMaterials.put ( help , junkMaterials.get ( help ) + helper );
                    input.remove ( 0 );
                    input.remove ( 0 );
                }
                if ( keyMaterials.get ( "shards" ) >= 250 ) {
                    break;
                } else if ( keyMaterials.get ( "fragments" ) >= 250 ) {
                    break;
                } else if ( keyMaterials.get ( "motes" ) >= 250 ) {
                    break;
                }
            }
            if ( keyMaterials.get ( "shards" ) >= 250 ) {
                keyMaterials.put ( "shards" , keyMaterials.get ( "shards" ) - 250 );
                System.out.println ( "Shadowmourne obtained!" );
                break;
            } else if ( keyMaterials.get ( "fragments" ) >= 250 ) {
                keyMaterials.put ( "fragments" , keyMaterials.get ( "fragments" ) - 250 );
                System.out.println ( "Valanyr obtained!" );
                break;
            } else if ( keyMaterials.get ( "motes" ) >= 250 ) {
                keyMaterials.put ( "motes" , keyMaterials.get ( "motes" ) - 250 );
                System.out.println ( "Dragonwrath obtained!" );
                break;
            }
        }
        for ( Map.Entry< String, Integer > entry : keyMaterials.entrySet ( ) ) {
            System.out.printf ( "%s: %d%n" , entry.getKey ( ) , entry.getValue ( ) );
        }
        for ( Map.Entry< String, Integer > entry : junkMaterials.entrySet ( ) ) {
            System.out.printf ( "%s: %d%n" , entry.getKey ( ) , entry.getValue ( ) );
        }
    }
}
