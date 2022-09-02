package SoftuniFundamentals;
//Write a program that extracts from a given sequence of words all elements that are present in it an odd number of times (case-insensitive).
//•	Words are given in a single line, space-separated.
//•	Print the result elements in lowercase in their order of appearance.
import java.util.*;
import java.util.stream.Collectors;


public class OddOccurrences {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String []input= scanner.nextLine ( ).split ( " " )    ;
        List <String> result=new ArrayList<> ();
        Map<String,Integer> count=new LinkedHashMap<> (  );
        for ( int i = 0 ; i < input.length ; i++ ) {
            String helper=input[ i ].toLowerCase( Locale.ROOT );
            count.putIfAbsent ( helper,0 );
            count.put ( helper, count.get ( helper)+1 );
        }
        for ( Map.Entry< String, Integer > entry : count.entrySet ( ) ) {
            if(entry.getValue ()%2==1){
                result.add ( entry.getKey ());
            }
        }
        System.out.println (String.join ( ", ",result ) );


    }
}
