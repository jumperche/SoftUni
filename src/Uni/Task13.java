package Uni;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] userpass = new String[3][2];
        for (int i = 0; i < userpass.length; i++) {
            for (int j = 0; j < userpass[0].length; j++) {
                if (j == 0) {
                    System.out.println("Enter username:");
                    userpass[i][j] = scan.nextLine();
                }
                else if (j == 1) {
                    System.out.println("Enter password:");
                    userpass[i][j] = scan.nextLine();
                }
            }
        }
        String user = "";
        String pass = "";
        boolean correct = false;
        while (true) {
            System.out.println("Testing username and password.");
            System.out.println("Write start to continue.");
            if (scan.nextLine().equals("start")) {
                System.out.println("Username:");
                user = scan.nextLine();
                System.out.println("Password:");
                pass = scan.nextLine();

                for (int i = 0; i < userpass.length; i++) {
                    if (userpass[i][0].equals(user) && userpass[i][1].equals(pass)) {
                        correct = true;
                    }
                }
                if (correct) {
                    System.out.println("Username and password correct!");
                    correct = false;
                }
                else
                    System.out.println("Username or password incorrect!");
            }
            else
                break;
        }
    }
}
