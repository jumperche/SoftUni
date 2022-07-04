package uni1;

import java.util.*;
/* Write a program that runs the naive string searching algorithm,
 * searching for the string BRA, on the following input: ABARACATABRAAB
 * @autor Rosalina Gramatikov
 * @ver 1.0
 * @26.6.2022
 */
public class Zadacha5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("String to find: ");//print message
        String tofind = scanner.nextLine();//input
        System.out.println("Sequence: ");//print message
        String sequence = scanner.nextLine();//input


        int index = find(sequence, tofind);//call find function

        if (index == -1) {//index number or -1 for not found
            System.out.println("The search string was NOT found in the sequence" );//when not found print
        } else {
            System.out.println("The search string was found in the sequence at index: "+index);//found print
        }

    }

    public static int find(String text, String pattern) {
        int patLength = pattern.length();//lenght from pattern
        int textLength = text.length();//lenght from text
        for (int i = 0; i <= (textLength - patLength); i++) {//loop to end-pattern lenght
            for (int j = 0; j < patLength; j++) {//loop pattern char
                if (text.charAt(i + j) != pattern.charAt(j)) {//not equals
                    break;
                }

                if (j == patLength - 1) {//equals
                    return i;
                }
            }
        }

        return -1;//return
    }
}
