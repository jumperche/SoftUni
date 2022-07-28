package SoftuniFundamentals;

import java.util.*;
import java.util.stream.*;

//Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
//Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
//Print even – print all the numbers that are even separated by a space
//Print odd – print all the numbers that are oddly separated by a space
//Get sum – print the sum of all the numbers
//Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
public class ListManipulationAdvanced {

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        List< Integer > list = Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).map ( value -> Integer.parseInt ( value ) )
                .collect ( Collectors.toList ( ) );
        String[] command=new String[3];
        command=scanner.nextLine ().split ( " " );
        while ( !command[0].equals ( "end" ) ){
            switch (command[0]){
                case "Contains":
                    contains (Integer.parseInt ( command[ 1 ] ),list);
                    break;
                case "Print":
                    if (command[1].equals ( "even" )){
                        printEven (list);
                    }
                    else {
                        printOdd (list);
                    }

                    break;
                case "Get":
                    getsum (list);
                    break;
                case "Filter":
                    filter(command[1],Integer.parseInt ( command[ 2 ] ),list);
                    break;
            }
            command=scanner.nextLine ().split ( " " );
        }
        //System.out.println (list.toString ().replaceAll ( "[\\[\\],]","" ) );
    }

    private static void filter ( String sign , int number , List< Integer > list ) {
        String out="";
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {

            switch (sign){
                case "<":
                    if (list.get ( i )<number){
                        out=out+list.get ( i )+" ";
                    }
                    break;
                case "<=":
                    if (list.get ( i )<=number){
                        out=out+list.get ( i )+" ";
                    }
                    break;
                case ">":
                    if (list.get ( i )>number){
                        out=out+list.get ( i )+" ";
                    }
                    break;
                case ">=":
                    if (list.get ( i )>=number){
                        out=out+list.get ( i )+" ";
                    }
                    break;
            }
            }
        out=out.substring ( 0,out.length ()-1 );
        System.out.println (out );
    }

    private static void getsum ( List list ) {
        int sum=0;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            sum=sum+(int)list.get ( i );
        }
        System.out.println (sum );
    }

    private static void printOdd ( List list ) {
        String out="";
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ((int)list.get(i)%2==1){
                out=out+list.get ( i )+" ";
            }
        }
out=out.substring ( 0,out.length ()-1 );
        System.out.println (out );
    }

    private static void printEven (  List list ) {
        String out="";
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ((int)list.get ( i )%2==0){
                out=out+list.get ( i )+" ";
            }
        }
        out=out.substring ( 0,out.length ()-1 );
        System.out.println (out );
    }

    private static void contains ( int number, List list ) {
        boolean contains=list.contains ( number );
        if (contains){
            System.out.println ("Yes");
        }
        else {
            System.out.println ("No such number" );
        }

    }
}
