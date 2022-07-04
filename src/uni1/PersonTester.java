
/** Java program that uses a class to store information about a person,
* including name, height, weight, and eye color and class for student with id and gpa.
 * @autor Rosalina Gramatikov
 * @ver 1.1
 * @14.6.2022
 */
package uni1;
public class PersonTester {
    public static void main ( String[] args ) {
//main

        Person person1 = new Person ( "Jahn" , 85.5 , 193 );//new person
        Person person2 = new Person ( "Mary" , 45 , 162.5 , "green" );//new person
        person1.getName ( );// get name from person1
        person1.displayAll ( );//print all information for person1
        person2.displayAll ( );//print all information for person2
        Student student1 = new Student ( "Alex" , 73.2 , 184 , "blue" , 001 , 5.5 );//new student
        student1.displayStudent ( );//print all information for student1


    }
}
