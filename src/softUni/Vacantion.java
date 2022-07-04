package softUni;

import java.util.Scanner;

public class Vacantion {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String season = scanner.nextLine();
            String klass = "";
            String location = "";

            double prise=0;
            if (budget <= 1000) {
                klass = "Camp";
            } else if (budget > 1000 && budget <= 3000) {
                klass = "Hut";
            } else if (budget > 3000) {
                klass = "Hotel";
            }
            if (season.equals("Summer") && klass.equals("Camp")) {
                prise = (65 * budget) / 100;
                location = "Alaska";
            }
            if (season.equals("Winter") && klass.equals("Camp")) {
                prise = (45 * budget) / 100;
                location = "Morocco";
            }
            if (season.equals("Summer") && klass.equals("Hut")) {
                prise = (80 * budget) / 100;
                location = "Alaska";
            }
            if (season.equals("Winter") && klass.equals("Hut")) {
                prise = (60 * budget) / 100;
                location = "Morocco";
            }
            if (season.equals("Winter") && klass.equals("Hotel")) {
                prise = (90 * budget) / 100;
                location = "Morocco";
            }
            if (season.equals("Summer") && klass.equals("Hotel")) {
                prise = (90 * budget) / 100;
                location = "Alaska";
            }
            String a=" - ";
            System.out.printf(location);
            System.out.printf(a);
           System.out.printf(klass);
            System.out.printf ( " - %.2f", prise ) ;
        }
    }


