package Uni;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Hash {
    public static void main( String[] args) {
        Hashtable< Integer, java.lang.String > hashMap = new Hashtable<> (); //Синхронизиран и не допуска nulls
        hashMap.put(0, "John");
        hashMap.put(1, "Steve");
        hashMap.put(2, "Ana");
        hashMap.put(3, "Peter");
        hashMap.put(4, "Peter2");
        hashMap.put(5, "Peter3");
        hashMap.put(6, "Peter4");
        hashMap.put(7, "Peter5");
        hashMap.put(8, "Peter6");
        hashMap.put(9, "Peter8");
        hashMap.put(10, "Peter8");
        hashMap.put(11, "Peter8");
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("John"));
        System.out.println(hashMap.size());
        Collection< java.lang.String > coll = hashMap.values(); //Връща колекция от стойностите Values
        String[] valArray = coll.toArray(new String[coll.size()]);
        Set<Integer> set = hashMap.keySet(); //Връща сет от ключове Keys
        Integer[] setArray = set.toArray(new Integer[set.size()]);
    }
}
