package SoftuniFundamentals;

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

