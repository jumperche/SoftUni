package softUni;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());


        if (a<100) {
            System.out.println("Less than 100");}
        else if (a>200)  {
            System.out.println("Greater than 200");}
        else {
            System.out.println("Between 100 and 200");}
        scanner.close();
    }
}
