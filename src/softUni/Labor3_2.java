/* A combination is a subset of elements from a given set.
 * combinations of n distinct elements in a group of size k (Java)
 * https://www.baeldung.com/java-combinatorial-algorithms
 * */


package softUni;

import java.util.*;

public class Labor3_2 {
    public static void main ( String[] args ) { // main

        List< Integer > mylist = Arrays.asList ( 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 , 21 , 22 , 23 , 24 , 25 , 26 ); //създава масив/лист от тип инт, който ще сортираме

        System.out.println ( "List of numbers: " + mylist ); //изписва масива

        Scanner in = new Scanner ( System.in ); // object type Scanner for input

        int n = mylist.size ( ); //пази размера на масива

        int k = 0; // N is row number
        do {
            System.out.print ( "Enter number of elements k (1 <= k <=" + n + "): " );//изписва съобщение
            k = in.nextInt ( );//пази броя на елементите въведени от конзолата
        } while ( k <= 0 || k > n ); // изпълнявай докато к е по-малък или равен на 0 ИЛИ к е по-гоялм от размера на масива

        List< List< Integer > > result = new ArrayList<> ( );//създаване на нов масив/лист  от тип инт

        result = combinations ( mylist , k );// в масива се записват  търсените к комбинации от масива mylist чрез метода combinations

        System.out.println ( "Number of combinations " + "C(" + n + "," + k + ") is " + result.size ( ) + ":" ); //изписва  търсения брой комбинации от н възможности чрез дължината на масива, в който те се пазят
        System.out.println ( result ); //изписва лементите на масива
    }

    private static void combinationsInternal (
            List< Integer > inputSet , int k , List< List< Integer > > results , ArrayList< Integer > accumulator , int index ) { //създава масиви и променливи от тип инт
        int needToAccumulate = k - accumulator.size ( );// създава и инициализира променлива със стойност броя търсени комбинации - размера на масива
        int canAcculumate = inputSet.size ( ) - index;//създава и инициализира променлива със стойност размера на масива - променлива индекс

        if ( accumulator.size ( ) == k ) { // ако размера на масива е равен на търсения брой к
            results.add ( new ArrayList<> ( accumulator ) );// прибавя стойност
        } else if ( needToAccumulate <= canAcculumate ) {// ако нужни акумулации е по-малко от възможни акумулации
            combinationsInternal ( inputSet , k , results , accumulator , index + 1 );//извикай метода със следните параметри и увеличи индекс с 1, рекурсия
            accumulator.add ( inputSet.get ( index ) );// прибави в масива
            combinationsInternal ( inputSet , k , results , accumulator , index + 1 );//рекурсия
            accumulator.remove ( accumulator.size ( ) - 1 );//изтрий от масива
        }
    }

    public static List< List< Integer > > combinations ( List< Integer > inputSet , int k ) {
        List< List< Integer > > results = new ArrayList<> ( );//създай нов масив от тип инт
        combinationsInternal ( inputSet , k , results , new ArrayList<> ( ) , 0 );//извикай метода с тези параметри
        return results; //върни масива
    }
}
