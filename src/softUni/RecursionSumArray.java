package softUni;

import java.util.*;

public class RecursionSumArray   {
    public static int sum1=0;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        int []arr=Arrays.stream ( scanner.nextLine ().split ( "\\s+" ) )
                .mapToInt ( Integer::parseInt )
                .toArray ();
sum1=sum (arr,0);
        System.out.println (sum1 );
    }
    public static int sum( int[] numbers, int index){
        if (numbers.length==index){
            return 0;
        }

        return numbers[ index ] +sum(numbers,index+1);
    }
}
