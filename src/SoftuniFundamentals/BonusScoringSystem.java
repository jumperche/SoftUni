package SoftuniFundamentals;
//Create a program that calculates bonus points for each student enrolled in a course. On the first line, you are going to receive the number of the students. On the second line, you will receive the total number of lectures in the course. The course has an additional bonus, which you will receive on the third line. On the following lines, you will be receiving the count of attendances for each student.
//The bonus is calculated with the following formula:
//{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
//Find the student with the maximum bonus and print them, along with his attendances, in the following format:
//"Max Bonus: {max bonus points}."
//"The student has attended {student attendances} lectures."
//Round the bonus points at the end to the nearest larger number.

//5
//25
//30
//12
//19
//24
//16
//20
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int student = Integer.parseInt ( scanner.nextLine ( ) );
        int lectures = Integer.parseInt ( scanner.nextLine ( ) );
        int bonus = Integer.parseInt ( scanner.nextLine ( ) );
        double max=0;
        double attend=0;
        for ( int i = 0 ; i < student ; i++ ) {
          double attendance=Double.parseDouble (scanner.nextLine());
double helper=attendance/lectures;
          double total=helper*(5+bonus);
          if (max<total){
              max=total;
              attend=attendance;
          }
        }
        System.out.printf ( "Max Bonus: %.0f.%n",Math.ceil ( max));
        System.out.printf ("The student has attended %.0f lectures.%n",attend );
    }
}
