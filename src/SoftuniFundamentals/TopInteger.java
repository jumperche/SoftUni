package SoftuniFundamentals;

import java.util.*;
//Write a program to find all the top integers in an array. A top integer is an integer
// that is bigger than all the elements to its right.
public class TopInteger {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String[] n =  scanner.nextLine ( ).split ( " " ) ;
        int []arr=Arrays.stream ( n ).mapToInt ( value -> Integer.parseInt ( value ) ).toArray ();
        int []arra=new int[n.length];
        boolean bigger=true;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            for ( int j = i+1 ; j < arr.length ; j++ ) {
                if (arr[i]>arr[ j ]){                                   }
                else {
                    bigger=false;
                    continue;
                }
            }
            if (bigger==true){
            System.out.print (arr[i]+" " );}
            else {
            }
            bigger=true;
        }
    }
}
