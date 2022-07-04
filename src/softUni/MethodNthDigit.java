package softUni;

import java.util.Scanner;

public class MethodNthDigit {
    static void findNthDigit(String number,int index){
        char cha=number.charAt ( number.length ()-index );
        System.out.println (cha );

    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String number = scanner.nextLine ( );
        int index = Integer.parseInt ( scanner.nextLine ( ) );
        findNthDigit ( number , index );
    }

}
