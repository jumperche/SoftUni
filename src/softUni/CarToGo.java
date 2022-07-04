package softUni;
import java.util.Scanner;
public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String klass = "";
        String auto = "";
        double prise=0;
        if (budget <= 100) {
            klass = "Economy class";
        } else if (budget > 100 && budget <= 500) {
            klass = "Compact class";
        } else if (budget > 500) {
            klass = "Luxury class";
        }
        if (season.equals("Summer") && klass.equals("Economy class")) {
            prise = (35 * budget) / 100;
            auto = "Cabrio";
        }
        if (season.equals("Winter") && klass.equals("Economy class")) {
            prise = (65 * budget) / 100;
            auto = "Jeep";
        }
        if (season.equals("Summer") && klass.equals("Compact class")) {
            prise = (45 * budget) / 100;
            auto = "Cabrio";
        }
        if (season.equals("Winter") && klass.equals("Compact class")) {
            prise = (80 * budget) / 100;
            auto = "Jeep";
        }
        if (klass.equals("Luxury class")) {
            prise = (90 * budget) / 100;
            auto = "Jeep";
        }
        System.out.println(klass);
        System.out.printf(auto);
        System.out.printf ( " - %.2f", prise ) ;
    }
}
