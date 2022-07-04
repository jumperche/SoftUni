package Uni;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (!stop) {
            System.out.println("1. Read data.");
            System.out.println("2. Write data.");
            System.out.println("3. Input data.");
            System.out.println("4. Quit.");
            input = scan.nextInt();
            switch (input) {
                case 1:
                {
                    System.out.println("Read data.");
                    //more code
                    break;
                }
                case 2:
                {
                    System.out.println("Write data.");
                    //more code
                    break;
                }
                case 3:
                {
                    System.out.println("Input data.");
                    //more code
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    stop = true;
                    break;
                }
                default:
                {
                    System.out.println("No such option.");
                    break;
                }
            }
        }
    }
}
