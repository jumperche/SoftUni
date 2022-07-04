package softUni;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());


    double prise=0;


        if (km>10000&&km<=20000){
            prise=1.45;
        }
        else if (season.equals("Spring")||season.equals("Autumn")&&km<=5000){
            prise=0.75;
        }
        else if (season.equals("Spring")||season.equals("Autumn")&&(km>5000)&&(km<=10000)){
            prise=0.95;
        }
        else if (season.equals("Spring")||season.equals("Autumn")&&(km>10000)&&(km<=20000)){
            prise=1.45;
        }

        if (season.equals("Summer")&&km<=5000){
            prise=0.90;
        }
        else if (season.equals("Summer")&&(km>5000)&&(km<=10000)){
            prise=1.1;
        }
        if (season.equals("Winter")&&km<=5000){
            prise=1.05;
        }
        else if (season.equals("Winter")&&(km>5000)&&(km<=10000)){
            prise=1.25;
        }
double total=(prise*km)*4;
        double tax=10*total/100;
        total=total-tax;
        System.out.printf("%.2f", total);

    }
}
