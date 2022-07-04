package softUni;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenAndOddsub {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int[] numbers = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ( );
int evenSum=0;
int oddSum=0;
        for ( int number:numbers ) {
            if (number%2==0){
                evenSum +=number;
            }
            else {
                oddSum +=number;
            }


        }
        System.out.println (evenSum-oddSum );
    }
}
