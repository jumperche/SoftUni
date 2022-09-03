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

        for ( Map.Entry< String, List< String > > entry : map.entrySet ( ) ) {
            System.out.printf ( "%s: %d%n%s%n",entry.getKey (),entry.getValue ().size (),String.join ( "\n-- ",entry.getValue () ));

        }


    }
}
