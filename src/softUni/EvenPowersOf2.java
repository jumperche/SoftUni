package softUni;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());

        for(    int i = 0; i<=x ;i=i+2){
double result = Math.pow(2,i);
            System.out.printf("%.0f%n",result);
        }
    }
}
