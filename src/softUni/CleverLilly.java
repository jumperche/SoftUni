package softUni;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double wasch = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());
double money=0;
int toy=0;
int count=0;
        for (int i = 1; i <= age; i++) {
            if (i%2==0){
                money=(money+((i*10))/2);
                   count++;
            }
            else {
                toy=toy+1;
            }
        }
double toySum=toy*toyPrice;
        double sum=(money-count)+toySum;
        double diff=sum-wasch;
        if (sum>=wasch){

            System.out.printf("Yes! %.2f",diff);
        }
        else {

            System.out.printf("No! %.2f",Math.abs(diff));
        }



    }
    }
