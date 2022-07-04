package Uni;

import java.util.*;

public class LinkedHashmap {
    public static void main(String a[]) {
        //LinkedHashMap запазва позицията на добавените елементи.
        //Не е синхронизиран и допуска nulls
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "practice");
        lhm.put("two", "code");
        lhm.put("four", "quiz");

        // It prints the elements in same order
        // as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'one': " + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? "+ lhm.containsKey("two"));
        System.out.println("Contains value 'practice'?"+ lhm.containsValue("practice"));
        System.out.println("delete element 'one': " + lhm.remove("one"));
        System.out.println(lhm);
    }
}
