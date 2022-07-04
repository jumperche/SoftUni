package uni1;

import java.util.*;

/* function  that takes a list and returns a new list that contains
 * all the elements of the first list without all the duplicates
 * @autor Rosalina Gramatikov
 * @ver 1.0
 * @26.6.2022
 */


public class Zadacha2 {
    public static void main ( String[] args ) {
        List< Integer > list = new ArrayList<> ( );//create list
        list.add (17 );//add elements
        list.add ( 36 );
        list.add ( 679 );
        list.add ( 789 );
        list.add ( 17 );
        list.add ( 36 );
        list.add ( 79 );
        System.out.println ("Original list: "+list );//print original list
        System.out.println ("New list without duplicates: "+ listSet ( list ) );//print new listSet
    }

    public static Set< Integer > listSet ( List< Integer > list ) {
        Set< Integer > setList = new HashSet<> ( );//create listSet
        setList.addAll ( list );//duplicate list without duplicate
        return setList;//return new list
    }
}
