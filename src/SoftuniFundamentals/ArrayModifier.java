package SoftuniFundamentals;
//You are given an array with integers. Write a program to modify the elements after receiving the following commands:
//•	"swap {index1} {index2}" takes two elements and swap their places.
//•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
//•	"decrease" decreases all elements in the array with 1.
//Input
//On the first input line, you will be given the initial array values separated by a single space.
//On the next lines, you will receive commands until you receive the command "end". The commands are as follows:
//•	"swap {index1} {index2}"
//•	"multiply {index1} {index2}"
//•	"decrease"
import java.util.*;

public class ArrayModifier {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        //int n = Integer.parseInt ( scanner.nextLine ( ) );
        int[] arr=Arrays.stream ( scanner.nextLine ().split ( " " ) ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        String[] input=scanner.nextLine ().split ( " " );
        while ( !"end".equals ( input[0])){
            switch (input[0]){
                case "swap":
                    int first=Integer.parseInt ( input[1]);
                    int second=Integer.parseInt ( input[2]);
                    int x=arr[first];
                    arr[first]=arr[ second ];
                    arr[second]= x ;
                    break;
                case "multiply":
                    int firstM=Integer.parseInt ( input[1]);
                    int secondM=Integer.parseInt ( input[2]);
                    arr[firstM]=arr[ firstM ]*arr[ secondM ];
                    break;
                case "decrease":
                    for ( int i = 0 ; i < arr.length ; i++ ) {
                        arr[i]=arr[ i ]-1;
                    }
               break;
            }
            input=scanner.nextLine ().split ( " " );
            }
        for ( int i = 0 ; i < arr.length-1 ; i++ ) {

            System.out.print (arr[i]+", " );
        }
        System.out.print (arr[ arr.length-1] );
        }
    }

