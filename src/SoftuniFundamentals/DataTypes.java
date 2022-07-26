package SoftuniFundamentals;

import java.util.*;

//Write a program that, depending on the first line of the input, reads an int, double, or string.
//•	If the data type is int, multiply the number by 2.
//•	If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
//•	If the data type is a string, surround the input with "$".
//Print the result on the console.
public class DataTypes {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        switch (name){
            case "int":
                int n=Integer.parseInt ( scanner.nextLine () );
                data(n);
                break;
            case "real":
                double a=Double.parseDouble (  scanner.nextLine ( ));
                data ( a );
                break;
            case "string":
                String str=scanner.nextLine ();
                data ( str );
                break;
            default:
                break;
        }
    }
    public static void data(int n){
        System.out.println (n*2 );
    }
    public static void data(double n){
        System.out.printf ("%.2f",(n*1.5) );
    }
    public static void data(String n){
        System.out.println ("$"+n+"$" );
    }
}
