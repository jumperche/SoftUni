package SoftuniFundamentals;
//Every day, thousands of students pass by the reception at SoftUni with different questions to ask. The employees have to help everyone by providing all the information and answering all of the questions.
//Three employees are working on the reception all day. Each of them can handle a different number of students per hour. Your task is to calculate how much time it will take to answer all the questions of a given number of students.
//First, you will receive 3 lines with integers, representing the number of students that each employee can help per hour. On the following line, you will receive students count as a single integer.
//Every fourth hour, all employees have a break, so they don't work for an hour. It is the only break for the employees, because they don't need rest, nor have a personal life. Calculate the time needed to answer all the student's questions and print it in the following format: "Time needed: {time}h."

//5
//6
//4
//20
import java.util.Scanner;

public class SoftUniReception {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int e1 = Integer.parseInt ( scanner.nextLine ( ) );
        int e2 = Integer.parseInt ( scanner.nextLine ( ) );
        int e3 = Integer.parseInt ( scanner.nextLine ( ) );
        int ask = Integer.parseInt ( scanner.nextLine ( ) );
        int hour=0;
        int count=0;
        int perHour=e1+e2+e3;
        while ( ask>0 ){
                       ask-=perHour;
            hour++;
            count++;
            if (ask==0){
                break;
            }
            if (count==3){
                hour++;
                count=0;
            }

        }
        System.out.printf ( "Time needed: %dh.",hour );
    }
}
