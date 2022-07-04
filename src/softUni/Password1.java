package softUni;

import java.util.Scanner;

public class Password1 {
        public static void main ( String[] args ) {
            Scanner scanner = new Scanner ( System.in );
            String name = scanner.nextLine ();
            String pass = scanner.nextLine ();
            String pass1="";
            while (!pass.equals ( pass1 )) {
                           pass1 = scanner.nextLine ();
            }
            System.out.println ( "Welcome "+name+"!" );
        }

    }


