package SoftuniFundamentals;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int[]arr= Arrays.stream ( scanner.nextLine ().split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
   int index=0;
   int max=0;
   int count=1;
   int indexBest=0;
        for ( int i = 1 ; i < arr.length  ; i++ ) {
            if(arr[i]==arr[ i-1 ]){
                count++;
            }
            else {
                count=1;
                index = i;
            }
            if(count>max){
                max = count;
                indexBest= index;
            }
        }
        for (int i = indexBest; i < indexBest + max; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
