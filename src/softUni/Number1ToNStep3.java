package softUni;

import java.util.Scanner;

public class Number1ToNStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        for(    int i = 1; i<=x ;i=i+3){

            System.out.println(i);
        }
    }
}
