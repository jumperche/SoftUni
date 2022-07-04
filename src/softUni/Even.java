package softUni;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());

        if (a %2==0) {
            System.out.println("even");}
        else {System.out.println("odd");}
        scanner.close();
    }
}
