package SoftuniFundamentals;
//Using the Person class, write a program that reads from the console N lines of personal
// information and then prints all people whose age is more than 30 years.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionRoll {
    public static void main ( String[] args ) {
        List< Person > persons = new ArrayList<> ( );
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        for ( int i = 0 ; i < n ; i++ ) {
            String input = scanner.nextLine ( );
            String name = input.split ( " " )[ 0 ];
            int age = Integer.parseInt ( input.split ( " " )[ 1 ] );
            if ( age > 30 ) {
                Person per = new Person ( name , age );
                System.out.println ( per.printPerson ( ) );
            }
           // persons.stream ( ).filter ( person -> person.getAge ( ) > 30 )
             //       .sorted ( ( p1 , p2 ) -> p1.getName ( ).compareTo ( p2.getName ( ) ) )
             //       .forEach ( person -> System.out.println ( person.printPerson ( ) ) );
        }

    }

    public static class Person {
        String name;
        int age;

        public Person ( String name , int age ) {
            this.name = name;
            this.age = age;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age ) {
            this.age = age;
        }

        public String printPerson () {

            return this.getName ( ) + " - " + this.getAge ( );

        }
    }
}

