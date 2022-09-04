package SoftuniFundamentals;

import java.util.*;
//You will receive input until you receive "END". Find what data type is the input. Possible data types are:
//•	Integer
//•	Floating point
//•	Characters
//•	Boolean
//•	Strings
//Print the result in the following format: "{input} is {data type} type".
public class DataTypeFinder {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        char ch = name.charAt ( 0 );
        int x = -1;

        while ( !name.equals ( "END" ) ) {
            if ( name.charAt ( 0 ) >= 58 || name.charAt (0 ) <48&&name.charAt ( 0 )!=45&&(name.charAt ( 1 )>= 58 || name.charAt (1 ) <48)){
                if ( name.length ( ) == 1 ) {
                    System.out.println ( name + " is character type" );
                } else if ( name.equals ( "true" ) || name.equals ( "false" ) ) {
                    System.out.println ( name + " is boolean type" );
                }else
                {
                    System.out.println ( name + " is string type" );
                }
            }
            if ( name.charAt ( 0 ) >= 48 && name.charAt ( 0 ) <= 57 || name.charAt ( 0 ) == 45 ) {
                for ( int i = 0 ; i < name.length ( ) - 1 ; i++ ) {
                    if ( name.charAt ( i ) == '.' || name.charAt ( i ) == ',' ) {
                        x = i;
                        //System.out.println (name+" is Floating point type");
                        break;
                    }

                }
                if ( x == -1 ) {
                    System.out.println ( name + " is integer type" );
                } else {
                    System.out.println ( name + " is floating point type" );
                }

            }

            name=scanner.nextLine ();
        }
    }
}


