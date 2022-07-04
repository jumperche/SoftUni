package softUni;


import java.util.Scanner;

import java.util.*;

public class Labor3_4 {
    public static void main ( String[] args ) {
    List<String> mylist = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");

        //System.out.println("List of numbers: " + mylist);

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


