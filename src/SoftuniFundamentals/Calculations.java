package SoftuniFundamentals;
//Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
// and on the next two lines receives two numbers. Create four methods (for each calculation)
// and invoke the right one depending on the command. The method should also print the result
// (needs to be void).
import java.util.*;

public class Calculations {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        int a=Integer.parseInt ( scanner.nextLine () );
        int b=Integer.parseInt ( scanner.nextLine () );
        switch (name){
            case "subtract":
                subtract ( a,b );
                break;
            case "divide":
                divide ( a,b );
                break;
            case "add":
                add ( a,b );
                break;
            case "multiply":
                multiply ( a,b );
                break;
            default:
                System.out.println ("error" );
                break;
        }
    }
    public static void subtract(int a,int b){
        System.out.println (a-b );
    }
    public static void divide(int a,int b){
        System.out.println (a/b );
    }
    public static void add(int a,int b){
        System.out.println (a+b );
    }
    public static void multiply(int a,int b){
        System.out.println (a*b );
    }
}
