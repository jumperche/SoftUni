package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class Z2Z1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
int count=0;
       int areaA= scanner.nextInt ( );
       int areaB= scanner.nextInt ( );
        int[] numbers = Arrays.stream ( " ".split ( scanner.nextLine ( ) ) ).mapToInt ( e -> Integer.parseInt ( e ) ).toArray ( );
        int[] num=new int[numbers.length];
        for ( int i = 0; i < numbers.length; i++ ) {
            if (numbers[i]>=areaA && numbers[i]<=areaB){
                num=numbers;
                count++;

            }
        }
        System.out.println (count );
    }
}
