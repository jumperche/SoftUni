package SoftuniFundamentals;
//You will receive an unknown number of lines. On each line, you will receive an array with 3 elements. The first element will be a string and represents the name of the person. The second element will be a string and will represent the ID of the person. The last element will be an integer which represents the age of the person.
//When you receive the command "End", stop taking input and print all the people, ordered by age.
import java.util.*;
import java.util.stream.Collectors;

public class OrderByAge {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< String > input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> value )
                .collect ( Collectors.toList ( ) );
        List< Person> list = new ArrayList<> ( );
        while ( !input.get ( 0 ).equals ( "End" ) ) {
         Person persons=new Person ( input.get ( 0) , input.get ( 1) ,Integer.parseInt ( input.get ( 2) ) ) ;
           list.add ( persons );
            input = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> value )
                    .collect ( Collectors.toList ( ) );
        }
        list.sort ( Comparator.comparingInt ( Person::getAge ) );
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            System.out.println (list.get ( i ).printData () );
        }
    }
    public static class Person{
        String name;
        String id;
        int age;

        public Person ( String name , String id , int age ) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName () {
            return name;
        }

        public void setName ( String name ) {
            this.name = name;
        }

        public String getId () {
            return id;
        }

        public void setId ( String id ) {
            this.id = id;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age ) {
            this.age = age;
        }
        public String printData(){
            return String.format("%s with ID: %s is %d years old.",this.getName (),this.getId (),this.getAge ());
        }
    }
}
