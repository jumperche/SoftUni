/* A combination is a subset of elements from a given set.
        * combinations of n distinct elements in a group of size k (Java)
        * https://www.baeldung.com/java-combinatorial-algorithms
        * Програмата е само модифицирана от мен
        * */
package softUni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Labor3_3 {
    public static void main ( String[] args ) {

     // main

        List<String> mylist = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

        System.out.println("List of numbers: " + mylist);

        Scanner in = new Scanner(System.in); // object type Scanner for input

        int n = mylist.size();

        int k = 0; // N is row number
        do {
            System.out.print ("Enter your string of elements k (1 <= k <="+ n +"): ");
           // k = in.nextInt();
           String x=in.nextLine ();
             k=x.length ();
        } while (k<=1 || k>n);

        List< List< String > > result = new ArrayList<> ();

        result = combinations(mylist, k);

        System.out.println("Number of combinations " + "C("+n+","+k+") is " + result.size() + ":");
        //System.out.println(result);
    }

    private static void combinationsInternal(
            List< String > inputSet, int k, List< List< String > > results, ArrayList< String > accumulator, int index) {
        int needToAccumulate = k - accumulator.size();
        int canAcculumate = inputSet.size() - index;

        if (accumulator.size() == k) {
            results.add(new ArrayList<String>(accumulator));
        } else if (needToAccumulate <= canAcculumate) {
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.add(inputSet.get(index));
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.remove(accumulator.size() - 1);
        }
    }

    public static List<List<String>> combinations( List< String > inputSet, int k) {
        List<List<String>> results = new ArrayList<>();
        combinationsInternal(inputSet, k, results, new ArrayList<>(), 0);
        return results;
    }
}
