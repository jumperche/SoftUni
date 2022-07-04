package Uni;

import java.util.*;

public class IPv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipAddress = sc.nextLine();
        String range = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        if (ipAddress.matches(range + "\\." + range + "\\." + range + "\\." + range)) {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
