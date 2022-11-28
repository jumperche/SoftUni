package SoftuniFundamentals;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class FivePr {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        LinkedHashMap< String, List< Integer > > map = new LinkedHashMap< String, List< Integer > > ( );
        String[] input = scanner.nextLine ( ).split ( "=" );
        while ( !input[ 0 ].equals ( "Statistics" ) ) {
            String user = input[ 1 ];

            switch (input[ 0 ]) {
                case "Add":
                    int sent = Integer.parseInt ( input[ 2 ] );
                    int received = Integer.parseInt ( input[ 3 ] );
                    if ( !map.containsKey ( user ) ) {
                        map.put ( user , new ArrayList<> ( ) );
                        map.get ( user ).add ( sent );
                        map.get ( user ).add ( received );

                    }

                    break;
                case "Message":
                    String sender = input[ 1 ];
                    String receiver = input[ 2 ];
                    if ( map.containsKey ( sender ) & map.containsKey ( receiver ) ) {
                        List< Integer > current = map.get ( sender );
                        current.set ( 0 , current.get ( 0 ) + 1 );
                        map.put ( sender , current );
                        if ( current.get ( 0 ) + current.get ( 1)>= n ) {
                            map.remove ( sender );
                            System.out.printf ( "%s reached the capacity!%n" , sender );
                        }

                        current = map.get ( receiver );
                        current.set ( 0 , current.get ( 0 ) + 1 );
                        map.put ( receiver , current );
                        if ( current.get ( 0 )+ current.get ( 1) >= n ) {
                            map.remove ( receiver );
                            System.out.printf ( "%s reached the capacity!%n" , receiver );
                        }
                    }
                    break;
                case "Empty":
                    if ( user.equals ( "ALL" ) ) {
                        map.clear ( );
                    } else {
                        map.remove ( user );
                    }
                    break;
            }
            input=scanner.nextLine ().split ( "=" );
        }
        System.out.printf ("Users count: %d%n",map.size () );
       map.forEach (( key,value )->{
           AtomicInteger sum= new AtomicInteger ( );
           value.forEach ( val->{
               sum.set ( sum.get ( ) + val );
           } );
           System.out.println (key+" - "+sum );
       });
    }

}
