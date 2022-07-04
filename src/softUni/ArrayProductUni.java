package softUni;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayProductUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<String>();
        ArrayList<Integer> productQuantities = new ArrayList<Integer>();
        ArrayList<Integer> minQuantityIndices = new ArrayList<Integer>();
        int minQuantity = Integer.MAX_VALUE;
        int maxQuantity = Integer.MIN_VALUE;
        String productNameInput;

        // Gather user input
        do {
            System.out.println("Enter product name: ");
            productNameInput = scanner.nextLine();

            if (productNameInput != "") {
                System.out.println("Enter product quantity: ");

                productNames.add(productNameInput);
                productQuantities.add(Integer.parseInt(scanner.nextLine()));
            }
        } while (productNameInput != "");

        // Calculate min and max values
        for (int i = 0; i < productNames.size(); i++) {
            String currentName = productNames.get(i);
            Integer currentQuantity = productQuantities.get(i);

            System.out.println(currentName + " - " + currentQuantity);

            if (currentQuantity < minQuantity) {
                minQuantity = currentQuantity;
            }

            if (currentQuantity > maxQuantity) {
                maxQuantity = currentQuantity;
            }
        }

        System.out.println();
        System.out.println("Min quantity is: " + minQuantity);
        System.out.println("Max quantity is: " + maxQuantity);
        System.out.println();
        System.out.println("Products with min quantity:");

        // Print products with min quantity
        for (int i = 0; i < productNames.size(); i++) {
            String currentName = productNames.get(i);
            Integer currentQuantity = productQuantities.get(i);

            if (currentQuantity == minQuantity) {
                System.out.println(currentName + " - " + currentQuantity);
                minQuantityIndices.add(i);
            }
        }

        System.out.println();
        System.out.println("Indices of products with min quantities: " + minQuantityIndices.toString());

        scanner.close();
    }
}
