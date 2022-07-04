package softUni;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double san=0;
double total=0;
        for (int i = 1; i <=n ; i++) {
            String x = scanner.nextLine();
            switch (x) {
                case "Facebook":
                    san = san + 150.00;
                    break;
                case "Instagram":
                    san = san + 100.00;
                    break;
                case "Reddit":
                    san = san + 50.00;
                    break;
            }

             total = salary - san;
            if (total <= 0) {
                System.out.printf("You have lost your salary.");
            }
        }
        if (total <= 0) {
            System.out.printf("You have lost your salary.");
        }
            else {
                int to = (int) total;
                System.out.println(to);
            }


    }
}
