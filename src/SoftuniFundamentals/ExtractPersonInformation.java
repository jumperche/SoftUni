package SoftuniFundamentals;
//Write a program that reads n lines of strings and extracts the name and age of a given person. The person's name will be between "@" and "|". The person's age will be between "#" and "*".
//Example: "Hello my name is @Peter| and I am #20* years old."
//For each found name and age, print a line in the following format "{name} is {age} years old."
import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n=Integer.parseInt ( scanner.nextLine () );
        for ( int i = 0 ; i < n ; i++ ) {



        StringBuilder input = new StringBuilder (scanner.nextLine ( ));
        String name="";
        int age=0;
        int start=input.indexOf ( "@" );
        int end=input.indexOf ( "|" );
        name=input.substring ( start+1,end );
        start=input.indexOf ( "#" );
        end=input.indexOf ( "*" );
        age=Integer.parseInt ( input.substring ( start+1,end ));

        System.out.printf ( "%s is %d years old.%n",name,age );
        }
    }
}
