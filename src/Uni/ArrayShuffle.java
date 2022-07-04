package Uni;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shuffleArray(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    public static void main( String[] args) {
        int array[] = { 10, 40, 432, 543, 54, 432, 32, 65, 76, 234 };
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        shuffleArray(array);
        System.out.println(Arrays.toString(array));
        shuffleArray(array);
        System.out.println(Arrays.toString(array));
    }
}
