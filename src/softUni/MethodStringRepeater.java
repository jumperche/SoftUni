package softUni;

import java.util.Scanner;

//Да се напише метод repeatString(str, count), който получава като параметри променлива от тип String и
// цяло число n и връща низа, повторен n пъти. След това резултатът да се отпечата на конзолата.
public class MethodStringRepeater {
    static String repeatString(String str,int count){
        String sum="";
        for ( int i = 0; i < count ; i++ ) {

            sum=sum+str;
                    }
        return sum;
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String str = scanner.nextLine ( );
        int count = Integer.parseInt ( scanner.nextLine ( ) );
        String a = repeatString ( str , count );
        System.out.println (a );
    }
}
