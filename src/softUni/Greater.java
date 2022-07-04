package softUni;

import java.util.Scanner;

public class Greater {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        if (a>b) {
            System.out.println(a);}
        else {System.out.println(b);}
        scanner.close();
    }
}
