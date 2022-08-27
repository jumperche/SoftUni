package SoftuniFundamentals;
//Define a class Student, which holds the following information about students: first name, last name, age, and hometown.
//Read the list of students until you receive the "end" command. After that, you will receive a city name. Print only students
// which are from the given city, in the following format: "{firstName} {lastName} is {age} years old".
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).map( value -> value)
                .collect( Collectors.toList());
        List <Student> students=new ArrayList<> ();
        while ( !input.get ( 0 ).equals ( "end" ) ) {
            Student student = new Student ( input.get ( 0 ) , input.get ( 1 ) , Integer.parseInt ( input.get ( 2 ) ) , input.get ( 3 ) );
Student exist=Student.findStudent ( students, input.get ( 0) , input.get ( 1) );
if (exist==null) {
    students.add ( student );
}
else {
    exist.setAge (Integer.parseInt ( input.get ( 2 )));
    exist.setCity ( input.get ( 3) );
}




             input = Arrays.stream(scanner.nextLine().split(" ")).map( value -> value)
                    .collect( Collectors.toList());
        }
        String in=scanner.nextLine ();
        for ( int i = 0 ; i < students.size ( ) ; i++ ) {
            if (students.get ( i ).city.equals ( in )){
                System.out.println (students.get (i ).getAll ());
            }
        }
    }
    public static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String city;
        public Student (String firstName,String lastName,int age,String city){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.city=city;
        }

        public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public int getAge () {
            return age;
        }

        public String getCity () {
            return city;
        }
public String getAll(){
            return this.firstName+" "+this.lastName+" is "+this.age+" years old";
}


        //public boolean isFrom( String city ) {
         //   return this.city.equals ( city );
        //}
        public static Student findStudent(List<Student>students,String firstName,String lastName){
            for ( int i = 0 ; i < students.size ( ) ; i++ ) {
                Student s=students.get ( i );
                if (s.getFirstName ().equals ( firstName )&&s.getLastName ().equals ( lastName )){
                    return s;
                }

            }
            return null;
        }

        public void setAge (int age ) {
            this.age=age;
        }
        public void setCity ( String citye ) {
            this.city=city;
        }
    }
}
