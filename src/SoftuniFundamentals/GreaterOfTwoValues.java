package SoftuniFundamentals;

import java.util.*;

//You are given two values of the same type as input. The values can be of type int, char of String.
// Create a method getMax() that returns the greater of the two values:
public class GreaterOfTwoValues {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        switch (name){
            case "string":
            String a=scanner.nextLine ();
            String b=scanner.nextLine ();
                System.out.println ( getMax ( a,b ));
                break;
            case "char":
                String in=scanner.nextLine ();
                String in1=scanner.nextLine ();
                char inp=in.charAt ( 0 );
                char inp1=in1.charAt ( 0 );
                System.out.println ( getMax ( inp,inp1 ));
                break;
            case "int":
                int x=Integer.parseInt ( scanner.nextLine ());
                int y=Integer.parseInt ( scanner.nextLine ());
                System.out.println (getMax ( x,y ) );
        }
    }
    static String getMax(String a,String b){
        if (a.compareTo ( b )>=0){
            return a;
        }
        return b;
    }
    static int getMax(int a,int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }

    }
    static char getMax(char a,char b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
}
