package SoftuniFundamentals;
//Create a method that takes two strings as arguments and returns the sum of their character codes multiplied (multiply str1[0] with str2[0] and add to the total sum). Then continue with the next two characters. If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
import java.util.Scanner;

public class CharakterMultiplier {
    public static int sum=0;
    public static String [] input;
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        input = scanner.nextLine ( ).split ( " " );
sum=multy ( input[ 0 ] ,input[ 1 ] );
        System.out.println (sum);
    }
    public static int multy(String a,String b){
        boolean first=false;
        int min=0;
        if (a.length ()>b.length ()){
            first=true;
            min=b.length ();
        }
        else {
            min=a.length ();
        }
        for ( int i = 0 ; i < Math.min ( a.length (),b.length () ) ; i++ ) {
            sum=sum+(a.charAt ( i )*b.charAt ( i ));
        }
        for ( int i = min ; i <Math.max ( a.length (),b.length () )  ; i++ ) {
            if (first){
                sum=sum+a.charAt ( i );
            }else {
                sum = sum +b.charAt ( i );
            }
        }

        return sum;
    }
}
