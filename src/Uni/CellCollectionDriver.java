package Uni;

import java.util.ArrayList;
import java.util.HashSet;

public class CellCollectionDriver {
    public static void main( String[] args) {
        CellCollection cells = new CellCollection(5);

        cells.add(new Cell());
        cells.add(new Cell());

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));

        cells.get(0).setValue("First Cell");
        cells.get(1).setValue("Second Cell");

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));

        // using Java's ArrayList
        ArrayList< java.lang.String > languages = new ArrayList<>();

        // insert element to the ArrayList
        languages.add("Java");
        languages.add("Python");

        System.out.println("ArrayList: " + languages);

        HashSet<Integer> evenNumber = new HashSet<>();

        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();

        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

    }//end method main
}
