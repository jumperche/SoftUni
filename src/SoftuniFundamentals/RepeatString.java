package SoftuniFundamentals;
//Write a method that receives a string and a repeat count n (integer).
// The method should return a new string (the old one repeated n times).
import java.util.*;

public class RepeatString {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String str=scanner.nextLine ();
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        System.out.println (repeatstring ( str,n ));
    }
    public static String repeatstring(String str,int n){
        String st=str;
        for ( int i = 1 ; i < n ; i++ ) {
            st=st+str;
        }
        return st;
    }
}
