package Uni;


import java.util.*;
public class Labor3 {
    public static void main( String[] args) { // main

        List<Integer> mylist = Arrays.asList(1,2,3,4,5);

        System.out.println("List of numbers: " + mylist);

        Scanner in = new Scanner(System.in); // object type Scanner for input

        int n = mylist.size();

        int k = 5; // N is row number
        do {
            System.out.print ("Enter number of elements k (1 <= k <="+ n +"): ");
            k = in.nextInt();
        } while (k<=0 || k>n);

        List<List<Integer>> result = new ArrayList<>();

        result = combinations(mylist, k);

        System.out.println("Number of combinations " + "C("+n+","+k+") is " + result.size() + ":");
        System.out.println(result);
    }

    private static void combinationsInternal(
            List<Integer> inputSet, int k, List<List<Integer>> results, ArrayList<Integer> accumulator, int index) {
        int needToAccumulate = k - accumulator.size();
        int canAcculumate = inputSet.size() - index;

        if (accumulator.size() == k) {
            results.add(new ArrayList<>(accumulator));
        } else if (needToAccumulate <= canAcculumate) {
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.add(inputSet.get(index));
            combinationsInternal(inputSet, k, results, accumulator, index + 1);
            accumulator.remove(accumulator.size() - 1);
        }
    }

    public static List<List<Integer>> combinations(List<Integer> inputSet, int k) {
        List<List<Integer>> results = new ArrayList<>();
        combinationsInternal(inputSet, k, results, new ArrayList<>(), 0);
        return results;
    }
}
