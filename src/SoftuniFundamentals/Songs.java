package SoftuniFundamentals;
//Define a class Song, which holds the following information about songs: Type List, Name, and Time.
//On the first line, you will receive the number of songs - N.
//On the next N-lines you will be receiving data in the following format: "{typeList}_{name}_{time}".
//On the last line, you will receive "Type List" / "all". Print only the names of the songs which are from that Type List / All songs.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        List< Song > songs = new ArrayList<> ( );
        for ( int i = 0 ; i < n ; i++ ) {
            List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( "_" ) ).map ( value -> value )
                    .collect ( Collectors.toList ( ) );
            Song song = new Song ( input.get ( 0 ) , input.get ( 1 ) , input.get ( 2 ) );
            songs.add ( song );
        }
        String wanted = scanner.nextLine ( );
        if ( wanted.equals ( "all" ) ) {
            for ( Song song :
                    songs ) {
                System.out.println ( song.getName ( ) );
            }

        } else {
            for ( Song song :
                    songs ) {
                if ( song.typeList.equals ( wanted ) ) {
                    System.out.println ( song.getName ( ) );
                }
            }
        }
    }

    public static class Song {
        private String typeList;
        private String name;
        private String time;

        Song ( String typeList , String name , String time ) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList () {
            return typeList;
        }

        public String getName () {
            return name;
        }

        public String getTime () {
            return time;
        }

        public void setTypeList ( String typeList ) {
            this.typeList = typeList;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public void setTime ( String time ) {
            this.time = time;
        }
    }
}
