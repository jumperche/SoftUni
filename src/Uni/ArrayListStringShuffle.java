package Uni;

import java.util.*;

public class ArrayListStringShuffle {
    public static ArrayList<String> names = new ArrayList<String>();
    public static Scanner scan = new Scanner(System.in);

    public static void addNames() {
        System.out.println("Добавяне на имена");
        for (int i = 0; i < 10; i++) {
            System.out.println("Име:");
            names.add(scan.nextLine());
        }
    }

    public static void printNames() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Име: " + names.get(i));
        }
    }

    public static void swap(ArrayList<String> arr, int i, int j) {
        String temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void shuffleArray() {
        int n = names.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(names, i, change);
        }
    }

    public static void getRandomName() {
        Random random = new Random();
        if (names.size() != 0) {
            int randomIndex = random.nextInt(names.size() - 1);
            //System.out.println(randomIndex);
            System.out.println("Изтегленото име е: " + names.get(randomIndex));
            names.remove(randomIndex);
        }
        else
            System.out.println("Няма имена в ArrayList.");
    }
    /*
    Georgi Ivanov
    Anelia Petkova
    Ivan Ivanov
    Ana Marinova
    Stoyan Stoyanov
    Ivan Petrov
    Dimitar Dimitrov
    Maria Ivanova
    Petur Petrov
    Antonia Stefanova

     */
    public static void main(String[] args) {
        int choice = 0;
        while (true) {
            System.out.println("1. Добавяне на имена.");
            System.out.println("2. Принтиране на ArrayList.");
            System.out.println("3. Разбъркване.");
            System.out.println("4. Изтегляне на 3 имена.");
            System.out.println("5. Изход.");
            System.out.print("--> ");
            choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    addNames();
                    break;
                case 2:
                    printNames();
                    break;
                case 3:
                    shuffleArray();
                    break;
                case 4:
                    for (int i = 0; i < 3; i++) {
                        shuffleArray();
                        getRandomName();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such option.");
                    break;
            }
        }
    }
}
