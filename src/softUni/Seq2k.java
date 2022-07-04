package softUni;

import java.util.Scanner;

public class Seq2k {
        public static void main ( String[] args ) {
            Scanner scanner = new Scanner ( System.in );
            int x = Integer.parseInt ( scanner.nextLine () );
            int n= 1;
            while (x>=n) {
                System.out.println ( n );
                n=n*2+1;
            }

        }

    }






