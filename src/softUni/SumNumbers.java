package softUni;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        for(    int i = 0; i<=x ;i=i+2){

            System.out.println(2^i);
        }
    }
}

