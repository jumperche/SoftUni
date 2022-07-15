package SoftuniFundamentals;

import java.util.*;
//You will receive input until you receive "END". Find what data type is the input. Possible data types are:
//•	Integer
//•	Floating point
//•	Characters
//•	Boolean
//•	Strings
//Print the result in the following format: "{input} is {data type} type".
public class DataTypeFinder1 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );

        String input=scanner.nextLine ();
        while ( !input.equals ( "END" ) ){
            if (input.toLowerCase ().equals ( "true" )||input.toLowerCase ().equals ( "false" )){
                System.out.println (input+" is boolean type" );
            } else if ( input.length ()==1&&(input.charAt ( 0 )<48 ||input.charAt ( 0 )>57)) {
                System.out.println (input+" is character type" );
            }else try {
                int x=Integer.parseInt ( input );
                System.out.println (input+" is integer type" );
            }catch (Exception e){
                try {

                    double x = Double.parseDouble ( input );
                    System.out.println ( input + " is floating point type" );
                }
                catch (Exception exception){

                    System.out.println (input+" is string type" );
                }
            }



            input=scanner.nextLine ();
        }

    }
}
