package SoftuniFundamentals;
//Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.
import java.util.*;

public class Elevator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int people = Integer.parseInt ( scanner.nextLine ( ) );
        int cap = Integer.parseInt ( scanner.nextLine ( ) );
        int sum=0;
        sum=(int)Math.ceil (( double )people/cap);
        System.out.println (sum );
    }
}
