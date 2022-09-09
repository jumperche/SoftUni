package SoftuniFundamentals;
//Write a program, which keeps the information about students and their grades.
//On the first line, you will receive number n. After that, you will receive n pair of rows. First, you will receive the student's name, after that, you will receive his grade. Check if the student already exists and if not - add him. Keep track of all grades for each student.
//When you finish reading data, keep students with an average grade higher or equal to 4.50.
//Print the students and their average grade in the format:
//"{name} –> {averageGrade}"
//Format the average grade to the 2nd decimal place.
import java.util.*;

public class StudentAkademy {
    public static void main ( String[] args ) {
        Map< String, List< Double > > map = new LinkedHashMap<> ( );

        Scanner scan = new Scanner ( System.in );
        int n = Integer.parseInt ( scan.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            String name = scan.next ( );
            double grade = Double.parseDouble ( scan.next ( ) );
            if ( !map.containsKey ( name ) ) {
                map.put ( name , new ArrayList<> ( ) );
            }
            map.get ( name ).add ( grade );
        }
        Map< String, Double > average = new LinkedHashMap<> ( );
        for ( Map.Entry< String, List< Double > > entry : map.entrySet ( ) ) {
            double av = entry.getValue ( ).stream ( ).mapToDouble ( Double::doubleValue ).average ( ).getAsDouble ( );
            if ( av >= 4.5 ) {
                average.put ( entry.getKey ( ) , av );
            }
        }

        for ( Map.Entry< String, Double > entry : average.entrySet ( ) ) {
            System.out.printf ( "%s -> %.2f%n" , entry.getKey ( ) , entry.getValue ( ) );

        }
    }
}

