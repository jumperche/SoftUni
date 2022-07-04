package softUni;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
String inp= sc.nextLine ( );
        int detergent=0;
        int countdish=0;
        int countPot=0;
        int count=1;
       int sum=0;
        int sumP=0;
        int sumD=0;
        int input=Integer.parseInt ( inp );
        inp= sc.nextLine ( );
        detergent=input*750;
        while ( !"End".equals ( inp ) ){

            input=Integer.parseInt ( inp );


          if (count%3==0){
              sumP=input*15;
              countPot+=input;
              sum=sum+sumP;
          }else{
            sumD=input*5;
          countdish+=input;
          sum=sum+sumD;}
          if (detergent-sum<0){
              System.out.printf ( "Not enough detergent, %d ml more necessary!",Math.abs ( detergent-sum));
          }


count++;
            inp= sc.nextLine ( );
        }
        System.out.printf ( "Detergent was enough!%n" );
        System.out.printf ( "%d dishes and %d pots were washed.%n",countdish,countPot );
        System.out.printf ( "Leftover detergent %d ml.", detergent-sum );

    }
}
