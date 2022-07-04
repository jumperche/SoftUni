package Uni;

import java.util.*;

public class ArrayListShuffle {
    public static void main(String[] args) {
        int array[] = { 10, 40, 432, 543, 54, 432, 32, 65, 76, 234 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++)
            arrayList.add(array[i]);

        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
        Collections.shuffle(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
        Collections.shuffle(arrayList);
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
    }
}
