package SoftuniFundamentals;
//Write a program, which keeps the information about courses. Each course has a name and registered students.
//You will receive the course name and student name until you receive the command "end". Check if such a course already exists
// and if not - add the course. Register the user into the course. When you do receive the command "end",
// print the courses with their names and total registered users. For each contest, print the registered users.
import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " : " ) ).collect ( Collectors.toList ( ) );
    Map<String,List <String>> map = new LinkedHashMap<> (  );


        while ( !input.get (0 ).equals ( "end" ) ){
        map.putIfAbsent ( input.get ( 0) ,new ArrayList<> () );
        map.get ( input.get ( 0 ) ).add ( input.get ( 1 ) );
            input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " : " ) ).collect ( Collectors.toList ( ) );
    }

//        map.entrySet ( ).stream ( )
//                .forEach ( entry -> {
//                    System.out.printf ( "%s: %d%n" , entry.getKey ( ) , entry.getValue ( ).size ( ) );
//                    entry.getValue ( ).forEach ( player -> System.out.println ( "-- " + player ) );
//                } );
        map.entrySet ().stream ().sorted ((e1,e2)->Integer.compare ( e2.getValue ().size (),e1.getValue().size()) )
        .forEach(entry-> {
            System.out.printf ( "%s: %d%n" , entry.getKey ( ) , entry.getValue ( ).size ( ) );
            entry.getValue ( ).stream ( ).sorted ( ( String::compareTo ) )
                    .forEach ( student -> System.out.println ( "-- " + student ) );
        });

    }
}
