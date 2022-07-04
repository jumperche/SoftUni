package softUni;

import java.util.Scanner;

public class FlowerShop {



        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner scanner=new Scanner(System.in);
            int mag=Integer.parseInt(scanner.nextLine());
            int z=Integer.parseInt(scanner.nextLine());
            int rose=Integer.parseInt(scanner.nextLine());
            int kak=Integer.parseInt(scanner.nextLine());
            double price=Double.parseDouble(scanner.nextLine());
            double result=mag*3.25+z*4+rose*3.5+kak*8;
            double tax=result*5/100;
            double total=result-tax;



            if (total<price) {
                double x=Math.ceil(price-total);
                int value1 =(int)x;
                System.out.println("She will have to borrow "+ value1+" leva." );}
            else {double x=Math.floor(total-price);
                int value2 =(int)x;
                System.out.println("She is left with "+ value2+" leva." );}



        }

    }

