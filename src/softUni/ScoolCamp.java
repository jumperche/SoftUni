package softUni;

import java.util.Scanner;

public class ScoolCamp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String season = sc.nextLine();
        String group = sc.nextLine();
        int students = Integer.parseInt(sc.nextLine());
        int nights = Integer.parseInt(sc.nextLine());
        double money = 0;
        String sport=null;

        switch (season) {
            case "Winter":
                if (group.equals("mixed")) {
                    money = nights * 10*students;
                    sport = "Ski";
                } else if (group.equals("boys")) {
                    money = nights * 9.6*students;
                    sport = "Judo";
                } else if (group.equals("girls")){
                    money = nights * 9.6*students;
                    sport = "Gymnastics";
                }
                break;
            case "Spring":
                if (group.equals("mixed")) {
                    money = nights * 9.5*students;
                    sport = "Cycling";
                } else if (group.equals("boys")) {
                    money = nights * 7.2*students;
                    sport = "Tennis";
                } else if (group.equals("girls")){
                    money = nights * 7.2*students;
                    sport = "Athletics";
                }
                break;
            case "Summer":
                if (group.equals("mixed")) {
                    money = nights * 20*students;
                    sport = "Swimming";
                } else if (group.equals("boys")) {
                    money = nights * 15*students;
                    sport = "Football";
                } else if (group.equals("girls")){
                    money = nights * 15*students;
                    sport = "Volleaball";
                }
                break;

        }

        if (students >= 10 && students < 20) {
            money = money * 0.95;
        } else if (students>=20&&students < 50) {
            money = money * 0.85;
        } else if (students>=50){
            money = money * 0.5;
        }

        System.out.printf("%s %.2f lv.",sport,money);
    }
}


