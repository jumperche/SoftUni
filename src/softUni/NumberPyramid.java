package softUni;

import java.util.Scanner;

public class NumberPyramid {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
int input=Integer.parseInt ( scanner.nextLine ( ) );
int count=1;
boolean isBigger=false;
        for ( int row = 1 ; row <= input ; row++ ) {
            for ( int col = 1 ; col <= row ; col++ ) {
                if (count>input){
                    isBigger=true;
                    break;}
                    System.out.print ( count+ " " );
                    count++;


            }
            if (isBigger){
                break;
            }
            System.out.println ( );
        }

    }
}
