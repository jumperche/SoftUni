package softUni;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        //ChangeThis12andThis56k
        //1Beware72ForThe4End88888
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        int chars = 0;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count = i;
                while (i < str.length()) {
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                        i++;
                    else {
                        i--;
                        break;
                    }
                }
                System.out.println("Count:" + count + " i: " + i + " chars:" + chars);
                if (chars == 0) {
                    output = output + str.charAt(i + 1);
                }
                else {
                    output = output + str.substring(i - chars + 1, i - 1);
                }
                System.out.println(output);
                chars = 0;
            }
            else
                chars++;
        }
    }
}
