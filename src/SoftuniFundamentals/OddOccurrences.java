package SoftuniFundamentals;

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
