package SoftuniFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam3 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] input = scanner.nextLine ( ).split ( ": " );
        Map< String, People > map = new LinkedHashMap<> ( );
        while ( !input[ 0 ].equals ( "Log out" ) ) {
            switch (input[ 0 ]) {
                case "New follower":
                    String name = input[ 1 ];
                    People newOne = new People ( name , 0 , 0 );
                    map.putIfAbsent ( name , newOne );

                    break;
                case "Like":
                    name = input[ 1 ];
                    int count = Integer.parseInt ( input[ 2 ] );
                    if ( map.containsKey ( name ) ) {
                        int helper = map.get ( name ).like + count;
                        newOne = new People ( name , helper , map.get ( name ).comment );
                        map.put ( name , newOne );
                    } else {
                        newOne = new People ( name , count , 0 );
                        map.put ( name , newOne );
                    }
                    break;
                case "Comment":
                    name = input[ 1 ];

                    if ( map.containsKey ( name ) ) {
                        int helper = map.get ( name ).comment + 1;
                        newOne = new People ( name , map.get ( name ).like , helper );
                        map.put ( name , newOne );
                    } else {
                        newOne = new People ( name , 0 , 1 );
                        map.put ( name , newOne );
                    }
                    break;
                case "Blocked":
                    name = input[ 1 ];
                    if ( map.containsKey ( name ) ) {
                        map.remove ( name );
                    } else {
                        System.out.println ( name + " doesn't exist." );
                    }
                    break;
            }


            input = scanner.nextLine ( ).split ( ": " );
        }
        System.out.println ( map.size ( ) + " followers" );
        map.entrySet ( ).stream ( ).forEach ( e -> {
            int x = e.getValue ( ).comment + e.getValue ( ).like;
            System.out.println ( e.getKey ( ) + ": " + x );
        } );
    }


    public static class People {
        String name;
        int like;
        int comment;

        public People ( String name , int like , int comment ) {
            this.name = name;
            this.like = like;
            this.comment = comment;
        }
    }
}

