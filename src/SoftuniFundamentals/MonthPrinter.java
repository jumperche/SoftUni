package SoftuniFundamentals;

import java.util.*;

public class MonthPrinter {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        String name="";
switch (n){
    case 1:
        name="Januar";
        break;
    case 2:
        name="Februar";
        break;
    case 3:
        name="March";
        break;
    case 4:
        name="April";
        break;
    case 5:
        name="May";
        break;
        case 6:
        name="Juny";
        break;
        case 7:
        name="July";
        break;
        case 8:
        name="August";
        break;
    case 9:
        name="September";
        break;
    case 10:
        name="Oktober";
        break;
    case 11:
        name="November";
        break;
    case 12:
        name="Dezember";
        break;
    default:
        System.out.println ("Error!" );
        break;


}
        System.out.println (name );
    }
}
