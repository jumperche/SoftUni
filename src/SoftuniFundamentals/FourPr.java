package SoftuniFundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class FourPr {
    public static void main ( String[] args ) {

            Scanner scanner = new Scanner(System.in);

            String enoughInput = "Go Shopping";

            Map<String, List<String>> mapStores = new LinkedHashMap<>();
            List<String> listImportantItems = new ArrayList<>();

            String input = scanner.nextLine();

            while (!input.equals(enoughInput)) {
                String[] arrayCurrentInput = input.split("->");
                String currentCommand = arrayCurrentInput[0];
                String currentStore = arrayCurrentInput[1];

                switch (currentCommand) {
                    case "Add": // Add->{Store}->{Item},{Item1},…{ItemN}
                        List<String> listItems = Arrays.stream(arrayCurrentInput[2].split(",")).collect(Collectors.toList());

                        for (Map.Entry<String, List<String>> entry : mapStores.entrySet()) {
                            for (String element : entry.getValue()) {
                                if (listItems.contains(element)) {
                                    listItems.remove(element);
                                }
                            }
                        }

                        mapStores.putIfAbsent(currentStore, new ArrayList<>());

                        List<String> newList = new ArrayList<String>(mapStores.get(currentStore));

                        for (String entry : listItems) {
                            if (!newList.contains(entry)) {
                                newList.add(entry);
                            }
                        }

                        mapStores.put(currentStore, newList);
                        break;
                    case "Important": // Important->{Store}->{Item}
                        String importantItem = arrayCurrentInput[2];
                        listImportantItems.add(importantItem);

                        boolean addItem = true;

                        for (Map.Entry<String, List<String>> entry : mapStores.entrySet()) {
                            if (entry.getValue().contains(importantItem)) {
                                addItem = false;
                                break;
                            }
                        }

                        if (addItem && !mapStores.containsKey(currentStore)) {
                            mapStores.put(currentStore, new ArrayList<>(Arrays.asList(importantItem)));
                        } else if (addItem) {
                            List<String> currentStoreItems = new ArrayList<>(mapStores.get(currentStore));
                            currentStoreItems.add(0, importantItem);
                            mapStores.put(currentStore, currentStoreItems);
                        }
                        break;
                    case "Remove": // Remove->{Store}
                        if (mapStores.containsKey(currentStore)) {
                            List<String> currentStoreItems = new ArrayList<>(mapStores.get(currentStore));
                            boolean removeStore = true;

                            for (String entry : listImportantItems) {
                                if (currentStoreItems.contains(entry)) {
                                    removeStore = false;
                                    break;
                                }
                            }

                            if (removeStore) {
                                mapStores.remove(currentStore);
                            }
                        }
                        break;
                    default:
                        System.out.println("Wrong Command!");
                        break;
                }

                input = scanner.nextLine();
            }

            mapStores.forEach((key, value) -> {
                System.out.printf("%s:\n", key);
                value.forEach(item -> System.out.printf(" - %s\n", item));

            });
    }
}


