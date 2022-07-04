package softUni;

import java.util.Scanner;

public class Coins {
    public static void main ( String[] args ) {
        Scanner scanner= new Scanner ( System.in );
        double rest=Double.parseDouble ( scanner.nextLine ( ) );
        int count=0;
        double r=rest*100;

        while (r!=0){
            if (r>=200){
                r=r-200;
                count++;
            }
            else if (r>=100){
                r=r-100;
                count++;
            }
            else if (r>=50){
                r=r-50;
                count++;
            }
            else if (r>=20){
                r=r-20;
                count++;
            }
            else if (r>=10){
                r=r-10;
                count++;
            }
            else if (r>=5){
                r=r-5;
                count++;
            }
            else if (r>=2){
                r=r-2;
                count++;
            }
            else if (r>=1){
                r=r-1;
                count++;
            }
            else {break;}
        }
        System.out.printf ( "%d",count );
    }
}
