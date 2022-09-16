package SoftuniFundamentals;
//Write a program that reads the path to a file and subtracts the file name and its extension.
import java.util.Scanner;

public class ExtractFile {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String[] name = scanner.nextLine ( ).split ( "\\\\");
        String file=name[ name.length-1];
       String[]f=file.split ( "\\." );
        System.out.println ("File name: "+f[0] );
        System.out.println ("File extension: "+f[1] );


    }
}
