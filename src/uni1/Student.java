/** subclass student from person with id and gpa
 * @autor Rosalina Gramatikov
 * @ver 1.1
 * @14.6.2022
 */

package uni1;

public class Student extends Person {

    private int studentId;
    private double gpa;
    //default constructor
    Student () {
        super ( );
        this.studentId = 0;
        this.gpa = 0;
    }
    //overloaded constructor
    public Student ( String name , double weight , double height , String eye , int studentId , double gpa ) {
        super ( name , weight , height , eye );
        this.studentId = studentId;
        this.gpa = gpa;
    }
    //overloaded constructor
    public Student ( String name , double weight , double height , String eye , int studentId ) {
        super ( name , weight , height , eye );
        this.studentId = studentId;
        this.gpa = 0;
    }
    //setter, mutator
    public int setStudentId ( int studentId ) {
        return this.studentId= studentId;
    }
    //setter, mutator
    public double setGpa ( double gpa ) {
        return this.gpa = gpa;
    }
    //getter, accessor
    public int getStudentId (  ) {
        return studentId = studentId;
    }
    //getter, accessor
    public double getGpa ( ) {
        return gpa = gpa;
    }

    //print method
    public void displayStudent () {
        super.displayAll ();//print name, weght, height, eyecolor
        System.out.println ( "Student id: " + studentId );//print id
        System.out.println ( "Student gpa: " + gpa );//print gpa
    }
    //print method
    public void displayAll () {
        System.out.println ( "Student info: Name " + getName () + " ID: " + studentId + " Gpa: " + gpa );//print name, id and gpa
    }



}
