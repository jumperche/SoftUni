package softUni;

import java.util.Scanner;

public class ArrayDayOfWeek {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
String[] day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };
int x=Integer.parseInt ( scanner.nextLine ( ) );
if (x>=1&&x<= day.length){
    System.out.println ( day[x-1]);
}
else {
    System.out.println ( "Invalid day!");
}
    }
}