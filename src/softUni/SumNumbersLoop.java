package softUni;

import java.util.Scanner;

public class SumNumbersLoop {

        public static void main ( String[] args ) {
            Scanner scanner = new Scanner ( System.in );
            int x = Integer.parseInt ( scanner.nextLine () );
            int sum= 0;
            while (x>sum) {
                int a = Integer.parseInt (scanner.nextLine ());
                sum=sum+a;
            }
            System.out.println ( sum );
        }

    }




