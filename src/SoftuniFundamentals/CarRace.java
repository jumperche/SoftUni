package SoftuniFundamentals;
//Write a program to calculate the winner of a car race. You will receive an array of numbers. Each array element represents the time needed to pass through that step (the index). There are going to be two cars. One of them starts from the left side, and the other one starts from the right side. The middle index of the array is the finish line. (The number of elements of the array will always be odd). Calculate the total time for each racer to reach the finish (the middle of the array) and print the winner with his total time. (The racer with less time). If you have a zero in the array, you must reduce the racer's time that reached it by 20% (from the time so far).
//Print the result in the following format "The winner is {left/right} with total time: {total time}", formatted with one digit after the decimal point.

//29 13 9 0 13 0 21 0 14 82 12
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List<Integer> list = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
int index=(list.size() - 1)/2;
double sumLeft=0;
double sumRight=0;
        for ( int i = 0 ; i < index ; i++ ) {
            if (list.get ( i )==0){
                sumLeft=sumLeft*0.8;
            }else {

                sumLeft += list.get ( i );
            }
        }
        for ( int i = list.size() - 1 ; i >index  ; i-- ) {
            if ( list.get ( i ) == 0 ) {
                sumRight = sumRight * 0.8;
            } else {
                sumRight += list.get ( i );
            }
        }
        if (sumLeft<sumRight){
            String left="left";
            System.out.printf ( "The winner is %s with total time: %.1f", left,sumLeft );
        }
        else {
            String right="right";
            System.out.printf ( "The winner is %s with total time: %.1f", right,sumRight );
        }
    }
}
