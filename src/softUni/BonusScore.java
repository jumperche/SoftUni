package softUni;

import java.util.Scanner;

public class BonusScore {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int x = Integer.parseInt ( scanner.nextLine () );
        double bonus=0;
        if (x<=100){
            bonus=5;
        }
        else if (x>1000){
            bonus=x*0.1;
                    }
        else {
        bonus=x*0.2;}
        if (x%2==0){
            bonus=bonus+1;
        } else if (x%10==5) {
            bonus=bonus+2;
        }
        System.out.println (bonus);
        System.out.println (x+bonus);
        double sit = Math.PI*2;
    }
}
