package SoftuniFundamentals;
//You are given a list of words in one line. Randomize their order and print each word on a separate line.

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).map( value -> value)
                .collect( Collectors.toList());
        Random random=new Random ();
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
int pos=random.nextInt ( list.size ( ));
String temp= list.get ( i);
list.set ( i, list.get ( pos) );
list.set ( pos,temp );
        }
        System.out.println (String.join ( System.lineSeparator (),list ) );
    }
}
