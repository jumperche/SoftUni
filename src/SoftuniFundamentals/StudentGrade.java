package SoftuniFundamentals;
//Write a program that receives n count of students and orders them by grade (in descending).
// Each student should have a first name (string), last name (string), and grade (a floating-point number).
import java.util.*;

public class StudentGrade {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        List<Student>list=new ArrayList<> ();
        for ( int i = 0 ; i < n ; i++ ) {
            String input=scanner.nextLine ();
            String first=input.split ( " " )[0];
            String last=input.split ( " " )[1];
            double grad=Double.parseDouble ( input.split ( " " )[2] );
            Student student=new Student ( first,last,grad );
            list.add ( student );
                    }
        list.sort ( Comparator.comparingDouble (Student::getGrade  ) .reversed ());
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            System.out.println (list.get ( i ).printData () );
        }
    }
    public static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student ( String firstName , String lastName , double grade ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName ( String firstName ) {
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName ( String lastName ) {
            this.lastName = lastName;
        }

        public double getGrade () {
            return grade;
        }

        public void setGrade ( double grade ) {
            this.grade = grade;
        }
        public String printData(){

            return String.format ("%s %s: %.2f", this.getFirstName(),this.getLastName() ,this.getGrade ());
        }
    }
}
