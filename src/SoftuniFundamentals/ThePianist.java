package SoftuniFundamentals;
// You are a pianist, and you like to keep a list of your favorite piano pieces. Create a program to help you organize it and add, change, remove pieces from it!
//On the first line of the standard input, you will receive an integer n – the number of pieces you will initially have. On the next n lines, the pieces themselves will follow with their composer and key, separated by "|" in the following format: "{piece}|{composer}|{key}".
//Then, you will be receiving different commands, each on a new line, separated by "|", until the "Stop" command is given:
//•	"Add|{piece}|{composer}|{key}":
//o	You need to add the given piece with the information about it to the other pieces and print:
//"{piece} by {composer} in {key} added to the collection!"
//o	If the piece is already in the collection, print:
//"{piece} is already in the collection!"
//•	"Remove|{piece}":
//o	If the piece is in the collection, remove it and print:
//"Successfully removed {piece}!"
//o	Otherwise, print:
//"Invalid operation! {piece} does not exist in the collection."
//•	"ChangeKey|{piece}|{new key}":
//o	If the piece is in the collection, change its key with the given one and print:
//"Changed the key of {piece} to {new key}!"
//o	Otherwise, print:
//"Invalid operation! {piece} does not exist in the collection."
//Upon receiving the "Stop" command, you need to print all pieces in your collection in the following format:
//"{Piece} -> Composer: {composer}, Key: {key}"

//3
//Fur Elise|Beethoven|A Minor
//Moonlight Sonata|Beethoven|C# Minor
//Clair de Lune|Debussy|C# Minor
//Add|Sonata No.2|Chopin|B Minor
//Add|Hungarian Rhapsody No.2|Liszt|C# Minor
//Add|Fur Elise|Beethoven|C# Minor
//Remove|Clair de Lune
//ChangeKey|Moonlight Sonata|C# Major
//Stop

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        Map< String, Piece > map = new LinkedHashMap ( );
        for ( int i = 0 ; i < n ; i++ ) {
            String[] input = scanner.nextLine ( ).split ( "\\|" );
            Piece piece = new Piece ( );
            piece.setComposer ( input[ 1 ] );
            piece.setKey ( input[ 2 ] );
            map.put ( input[ 0 ] , piece );
        }
        String[] input = scanner.nextLine ( ).split ( "\\|" );
        while ( !input[ 0 ].equals ( "Stop" ) ) {
            String piece = input[ 1 ];

            switch (input[ 0 ]) {
                case "Add":
                    String composer = input[ 2 ];
                    String key = input[ 3 ];
                    if ( map.containsKey ( piece ) ) {
                        System.out.printf ( "%s is already in the collection!%n" , piece );
                        break;
                    } else {
                        Piece newPiece = new Piece ( );
                        newPiece.setComposer ( composer );
                        newPiece.setKey ( key );
                        map.put ( input[ 1 ] , newPiece );
                        System.out.printf ( "%s by %s in %s added to the collection!%n" , piece , composer , key );
                    }


                    break;
                case "Remove":
                    if ( map.containsKey ( piece ) ) {
                        map.remove ( piece );
                        System.out.printf ( "Successfully removed %s!%n" , piece );
                        break;
                    } else {
                        System.out.printf ( "Invalid operation! %s does not exist in the collection.%n" , piece );
                    }


                    break;
                case "ChangeKey":
                    key = input[ 2 ];
                    if ( map.containsKey ( piece ) ) {
                        Piece a = new Piece ( );
                        a.setComposer ( map.get ( piece ).getComposer ( ) );
                        a.setKey ( key );
                        map.put ( piece , a );


                        System.out.printf ( "Changed the key of %s to %s!%n" , piece , key );
                        break;
                    } else {
                        System.out.printf ( "Invalid operation! %s does not exist in the collection.%n" , piece );
                    }
                    break;
            }
            input = scanner.nextLine ( ).split ( "\\|" );
        }
        map.entrySet ( ).stream ( ).forEach ( entry -> {
            System.out.printf ( "%s -> Composer: %s, Key: %s%n" , entry.getKey ( ) , entry.getValue ( ).getComposer ( ) , entry.getValue ( ).getKey ( ) );
        } );
    }

}

class Piece {
    String composer;
    String key;

    public String getComposer () {
        return composer;
    }

    public void setComposer ( String composer ) {
        this.composer = composer;
    }

    public String getKey () {
        return key;
    }

    public void setKey ( String key ) {
        this.key = key;
    }
}
