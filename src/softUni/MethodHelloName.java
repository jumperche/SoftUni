package softUni;

import java.util.Scanner;

public class MethodHelloName {

    static void getHello(String name){
        System.out.printf ("Hello, %s!",name );
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        getHello ( name );
    }
}
