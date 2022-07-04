package softUni;

import java.util.Scanner;

public class WordSwimmingRecord {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double record = Double.parseDouble ( scanner.nextLine () );
        double meter = Double.parseDouble ( scanner.nextLine () );
        double time = Double.parseDouble ( scanner.nextLine () );
double timeMeter=time*meter;
double delay=Math.floor (meter/15);
delay=delay*12.5;
timeMeter=timeMeter+delay;
if (record<=timeMeter){
    System.out.printf ( "No, he failed! He was %.2f seconds slower.",Math.abs(record-timeMeter) );
}
else {
    System.out.printf ( "Yes, he succeeded! The new world record is %.2f seconds.",timeMeter );
}
    }
}
