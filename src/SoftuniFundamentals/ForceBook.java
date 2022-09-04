package SoftuniFundamentals;
//The force users are struggling to remember which side is the different forceUsers from because they switch them too often. So you are tasked to create a web application to manage their profiles.
//You will receive several input lines in one of the following formats:
//"{force_side} | {force_user}"
//"{force_user} -> {force_side}"
//The "force_user" and "force_side" are strings, containing any character.
//If you receive "force_side | force_user":
//•	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
//•	Only if there is no such force user in any force side -> add the force user to the corresponding side.
//•	If there is such force user already -> skip the command and continue to the next operation.
//If you receive a "force_user -> force_side":
//•	If there is such force user already -> change their side.
//•	If there is no such force user in any force side -> add the force user to the corresponding force side.
//•	If there is no such force user and no such force side -> create new force side and add the force user to the corresponding side.
//•	Then you should print on the console: "{force_user} joins the {force_side} side!".
//You should end your program when you receive the command "Lumpawaroo". At that point, you should print each force side. For each side, print the force users.
//In case there are no force users on a side, you shouldn't print the side information.
import java.util.*;

public class ForceBook {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        Map< String, List< String > > map = new LinkedHashMap<> ( );
        while ( !input.equals ( "Lumpawaroo" ) ) {
            if ( input.contains ( "|" ) ) {
                String[] in = input.split ( " \\| " );

                if ( !map.containsKey ( in[ 0 ] ) ) {
                    map.put ( in[ 0 ] , new ArrayList<> ( ) );
                    map.get ( in[ 0 ] ).add ( in[ 1 ] );
                } else {
                    List< String > players = map.get ( in[ 0 ] );
                    if ( !players.contains ( in[ 1 ] ) ) {
                        map.get ( in[ 0 ] ).add ( in[ 1 ] );
                    }
                }

            } else {
                String[] in = input.split ( " -> " );

                map.entrySet ( ).forEach ( entry -> entry.getValue ( ).remove ( in[ 0 ] ) );

                if ( map.containsKey ( in[ 1 ] ) ) {
                    map.get ( in[ 1 ] ).add ( in[ 0 ] );
                    System.out.printf ( "%s joins the %s side!%n" , in[ 0 ] , in[ 1 ] );
                } else {
                    map.put ( in[ 1 ] , new ArrayList<> ( ) );
                    map.get ( in[ 1 ] ).add ( in[ 0 ] );
                }

            }
            input = scanner.nextLine ( );
        }
        map.entrySet ( ).stream ( ).filter ( entry -> entry.getValue ( ).size ( ) > 0 )
                .forEach ( entry -> {
                    System.out.printf ( "Side: %s, Members: %d%n" , entry.getKey ( ) , entry.getValue ( ).size ( ) );
                    entry.getValue ( ).forEach ( player -> System.out.println ( "! " + player ) );
                } );
    }
}
