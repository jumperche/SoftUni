package softUni;
import java.util.Scanner;
public class FluelTank2 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double liter = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double ben = 2.22;
        double gas = 0.93;
        double diesel = 2.33;
        if ("Yes".equals(card)) {
            if (fuel.equals("Gas")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * (gas - 0.08);
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * (gas - 0.08);
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * gas;
                    System.out.printf("%.2f lv.", result);
                }
            }
            if (fuel.equals("Diesel")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * (diesel - 0.12);
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * (diesel - 0.12);
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * diesel;
                    System.out.printf("%.2f lv.", result);
                }
            }
            if (fuel.equals("Gasoline")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * (ben - 0.18);
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * (ben - 0.18);
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * ben;
                    System.out.printf("%.2f lv.", result);
                }
            }
        }
        if ("No".equals(card)) {
            if (fuel.equals("Gas")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * gas;
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * gas;
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * gas;
                    System.out.printf("%.2f lv.", result);
                }
            }
            if (fuel.equals("Diesel")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * diesel;
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * diesel;
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * diesel;
                    System.out.printf("%.2f lv.", result);
                }
            }
            if (fuel.equals("Gasoline")) {
                if (liter >= 20 && liter <= 25) {
                    double result = liter * ben;
                    result = result - (8 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter > 25) {
                    double result = liter * ben;
                    result = result - (10 * result / 100);
                    System.out.printf("%.2f lv.", result);
                }
                if (liter < 20) {
                    double result = liter * ben;
                    System.out.printf("%.2f lv.", result);
                }

            }

        }

    }
    }




