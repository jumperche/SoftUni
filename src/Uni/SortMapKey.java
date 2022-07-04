package Uni;
import java.util.*;
public class SortMapKey {
    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<> ();
    // Function to sort map by Key
    public static void sortbykey()
    {
        // TreeMap to store values of HashMap
        TreeMap<String, Integer> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(map);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("" + entry.getKey() );
    }
    public static void addMap(String input) {
        int in= Integer.valueOf ( input.substring ( 0 , 1 ) );
        if ( in ==2) {
            map.put ( "Sofia" , 2 );
            return;
        }
        in = Integer.valueOf ( input.substring ( 0 , 2 ) );

        if ( in == 52 ) {
            map.put ( "Varna" , 52 );
        } else if ( in == 58 ) {
            map.put ( "Dobrich" , 58 );
        } else if ( in == 32 ) {
            map.put ( "Plowdiv" , 32 );
        } else if ( in == 56 ) {
            map.put ( "Burgas" , 56 );
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        //map.put("Jayant", 80);
        Scanner scanner = new Scanner ( System.in );
        int number=Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i <  number; i++ ) {
            String input = scanner.nextLine ( );
            addMap ( input );
        }
        // Calling the function to sortbyKey
        sortbykey();
    }
}
