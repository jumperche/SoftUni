package Uni;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String output = "";
        input = scan.nextLine();
        String cardPower = input.substring(0, input.length() - 1);
        String cardType = input.substring(input.length() - 1, input.length());
        /*
        A Асо
        2 ... 10 Число
        J Вале
        Q Дама
        K Поп

        S Пика
        C Спатия
        H Купа
        D Каро
         */

        switch (cardPower) {
            case "J":
                output = "Вале";
                break;
            case "Q":
                output = "Дама";
                break;
            case "K":
                output = "Поп";
                break;
            case "A":
                output = "Асо";
                break;
            case "2":
                output = "Двойка";
                break;
            case "3":
                output = "Тройка";
                break;
            case "4":
                output = "Четворка";
                break;
            case "5":
                output = "Петица";
                break;
            case "6":
                output = "Шестица";
                break;
            case "7":
                output = "Седмица";
                break;
            case "8":
                output = "Осмица";
                break;
            case "9":
                output = "Девятка";
                break;
            case "10":
                output = "Десятка";
                break;
            default:
                output = "unknown";
                break;
        }

        if (!output.equals("unknown")) {
            switch (cardType) {
                case "S":
                    output = output + " Пика";
                    break;
                case "C":
                    output = output + " Спатия";
                    break;
                case "H":
                    output = output + " Купа";
                    break;
                case "D":
                    output = output + " Каро";
                    break;
                default:
                    output = "unknown";
                    break;
            }
        }
        System.out.println(output);
    }
}
