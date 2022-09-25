package SoftuniFundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );

        List< String > list = Arrays.stream ( scanner.nextLine ( ).split ( ", " ) )
                .collect ( Collectors.toList ( ) );
        String input = scanner.nextLine ( );
        String regex = "[A-Za-z]";


        Map< String, Integer > map = new LinkedHashMap<> ( );

        String distanceR = "";
        while ( !input.equals ( "end of race" ) ) {
            Pattern pattern = Pattern.compile ( regex );
            Matcher matcher = pattern.matcher ( input );
            int n = 0;
            String nameR = "";
            while ( matcher.find ( ) ) {
                nameR = nameR + matcher.group ( );
            }


            String regexN = "\\d";
            pattern = Pattern.compile ( regexN );
            matcher = pattern.matcher ( input );
            while ( matcher.find ( ) ) {
                n = n + ( Integer.parseInt ( matcher.group ( ) ) );
            }
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                if ( list.get ( i ).equals ( nameR ) ) {
                    map.putIfAbsent ( nameR , n );
                }

            }


            input = scanner.nextLine ( );
        }
        LinkedHashMap< String, Integer > reverseSortedMap = new LinkedHashMap<> ( );

        map.entrySet ( )
                .stream ( )
                .sorted ( Map.Entry.comparingByValue ( Comparator.reverseOrder ( ) ) )
                .forEachOrdered ( x -> reverseSortedMap.put ( x.getKey ( ) , x.getValue ( ) ) );
        List< String > out = new ArrayList<> ( );
        for ( Map.Entry< String, Integer > entry : reverseSortedMap.entrySet ( ) ) {
            out.add ( entry.getKey ( ) );
        }
        for ( int i = 1 ; i < 4 ; i++ ) {

            switch (i) {
                case 1:
                    String help = out.get ( 0 );
                    System.out.printf ( "1st place: %s%n" , help );
                    break;
                case 2:

                    help = out.get ( 1 );
                    System.out.printf ( "2nd place: %s%n" , help );
                    break;
                case 3:
                    help = out.get ( 2 );
                    System.out.printf ( "3rd place: %s%n" , help );
            }

        }

    }
}
