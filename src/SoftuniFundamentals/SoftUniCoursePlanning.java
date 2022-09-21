package SoftUniFundament;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).map(value -> value)
                .collect(Collectors.toList());
        List<String> input = Arrays.stream(scanner.nextLine().split(":")).map(value -> value)
                .collect(Collectors.toList());
        int indEx1 = -1;
        int indEx2 = -1;
        while (!input.get(0).equals("course start")) {

            switch (input.get(0)) {

                case "Add":
                    boolean add = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (input.get(1).equals(list.get(i))) {
                            add = true;
                            break;
                        }
                    }
                    if (!add) {
                        list.add(input.get(1));
                    }
                    break;
                case "Insert":
                    boolean insert = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (input.get(1).equals(list.get(i))) {
                            insert = true;
                            break;
                        }
                    }
                    if (!insert) {
                        list.add(Integer.parseInt(input.get(2)), input.get(1));
                    }
                    break;
                case "Remove":

                    for (int i = 0; i < list.size(); i++) {
                        if (input.get(1).equals(list.get(i))) {
                            list.remove(input.get(1));
                            break;
                        }
                    }
                    break;
                case "Swap":
                    boolean first = false;
                    boolean second = false;
                    int ind1 = -1;
                    int ind2 = -1;
                    int indexFirst = -1;
                    int indexSecond = -1;
                    String swap1 = input.get(1) + "-Exercise";
                    String swap2 = input.get(2) + "-Exercise";

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(swap1)) {
                            ind1 = i;
                        }
                        if (list.get(i).equals(swap2)) {
                            ind2 = i;
                        }

                        if (input.get(1).equals(list.get(i))) {
                            first = true;
                            indexFirst = i;
                        }
                        if (input.get(2).equals(list.get(i))) {
                            second = true;
                            indexSecond = i;
                        }
                        if (swap1.equals(list.get(i))) {
                            indEx1 = i;
                        }
                        if (swap2.equals(list.get(i))) {
                            indEx2 = i;
                        }
                    }
                    if (first && second) {
                        list.remove(indexFirst);
                        list.add(indexFirst, input.get(2));
                        list.remove(indexSecond);
                        list.add(indexSecond, input.get(1));
                    }

                    if (indEx1 != -1) {
                        list.add(indexSecond + 1, list.get(ind1));
                        list.remove(indEx1 + 1);
                    }
                    if (indEx2 != -1) {
                        list.add(indexFirst + 1, list.get(ind2));
                        list.remove(indEx2 + 1);
                    }
                    break;
                case "Exercise":
                    boolean exist = false;
                    for (int i = 0; i < list.size(); i++) {
                        if (input.get(1).equals(list.get(i))) {
                            String ex = list.get(i) + "-Exercise";
                            if (i+1<list.size ()&&list.get ( i+1 ).equals ( ex )){
                                exist=true;
                                break;
                            }
                            list.add(i + 1, ex);
                            indEx1 = i + 1;
                            exist = true;
                            break;
                        }
                    }
                    if (!exist) {
                        list.add(input.get(1));
                        list.add(input.get(1) + "-Exercise");
                    }

                    break;
            }


            input = Arrays.stream(scanner.nextLine().split(":")).map(value -> value)
                    .collect(Collectors.toList());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, list.get(i));
        }
    }
}
