package SoftuniFundamentals;

import java.util.*;

//Write a method that receives a single string and prints the count of the vowels.
// Use an appropriate name for the method.
public class VolwelsCount {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String word = scanner.nextLine ( );
        System.out.println ( countVolwels ( word ));
    }
    public static int countVolwels(String word){
        int count=0;
        word=word.toLowerCase ();
        for ( int i = 0 ; i < word.length () ; i++ ) {
if (word.charAt ( i )=='a'||word.charAt ( i )=='e'||word.charAt ( i )=='i'
        ||word.charAt ( i )=='o'||word.charAt ( i )=='u'){
    count++;
}

        }
        return count;
    }
}
