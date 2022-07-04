/*
        * Next lexicographical permutation algorithm (Java)
        * by Project Nayuki, 2014. Public domain.
        * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
        */

package softUni;

import java.util.Arrays;

public class Labor3_1 {
    public static void main(String[] args) { // main

        int[] myarray = {4, 1, 1, 4};//нов масив със стойности
        do {  // Must start at lowest permutation
            System.out.println( Arrays.toString(myarray));//показва масива
        } while (nextPermutation(myarray));// извиква метода nextPermutation до достигане на base case на рекурсията
    }


    public static boolean nextPermutation(int[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;//нова променлива със стойност дължината на масива -1, движението ще е отдясно на ляво
        while (i > 0 && array[i - 1] >= array[i]) // изпълнявай докато i е по-голямо от 0 И с елемент индекс i -1 е по-голямо или равно на елемент индекс i
            i--;//намали стойността на i s 1
        // Now i is the head index of the suffix

        // Are we at the last permutation already?
        if (i <= 0)//ako i е по-малко или равно на 0, base case
            return false;//върни невярно

        // Let array[i - 1] be the pivot
        // Find rightmost element greater than the pivot
        int j = array.length - 1;//нова променлива j със стойностдължината на масива -1
        while (array[j] <= array[i - 1])// изпълнявай докато елемент j е по-малък или равен на елемент i
            j--;//намали j с 1
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with j
        int temp = array[i - 1];//нова променлива със стойност елемент i - 1
        array[i - 1] = array[j]; // елемент i-1 равен на елемент j
        array[j] = temp;//temp получава стойността на елемент j

        // Reverse the suffix
        j = array.length - 1;//j получава стойността дължината на масива -1
        while (i < j) {//изпълнявай докато i е по-малко от j
            temp = array[i];//temp получава стойността на елемент i
            array[i] = array[j];//елемент i е равен на елемент j
            array[j] = temp;//елемент j e равен на temp
            i++;//увеличи i с 1
            j--;//намали j с 1
        }

        // Successfully computed the next permutation
        return true;//върни истина
    }
}
