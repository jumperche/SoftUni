package softUni;
import java.util.*;
public class PermutationString {
    public static int count=0;
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {

            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            System.out.println (ros );
            // Recursive call
            printPermutn(ros, ans + ch);
count++;
        }

    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String s = scan.nextLine ( );

        printPermutn(s, "");
        System.out.println (count );
    }
}
