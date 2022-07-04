package softUni;

import java.util.Scanner;

public class Shopping {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double budge = Double.parseDouble ( scanner.nextLine () );
        int video = Integer.parseInt ( scanner.nextLine () );
        int cpu = Integer.parseInt ( scanner.nextLine () );
        int ram = Integer.parseInt ( scanner.nextLine () );
        double videoP=250;
        double sumVideo=video*videoP;
        double cpuP=sumVideo*0.35;
        double ramP=sumVideo*0.1;
        double total=sumVideo+cpuP*cpu+ramP*ram;
        if (video>cpu){
            total=total-(total*0.15);
        }
        if (total<=budge){
            System.out.printf ( "You have %.2f leva left!",budge-total );
        }
        else {
            System.out.printf ( "Not enough money! You need %.2f leva more!",total-budge );
        }

    }
}
