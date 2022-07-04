package softUni;

import java.util.Scanner;

public class Gymnastics {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        String country= scan.nextLine ( );
        String toy= scan.nextLine ( );
        double x=0;
        double y=0;
        double sum=0;
        double diff=0;
        double pr=0;
        String cha="%";
        switch (toy){
            case "ribbon":
                if (country.equals ( "Russia" )){
                    x=9.1;
                    y=9.4;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Bulgaria" )){
                    x=9.6;
                    y=9.4;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Italy" )){
                    x=9.2;
                    y=9.5;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
            case "hoop":
                if (country.equals ( "Russia" )){
                    x=9.3;
                    y=9.8;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Bulgaria" )){
                    x=9.55;
                    y=9.75;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Italy" )){
                    x=9.45;
                    y=9.35;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
            case "rope":
                if (country.equals ( "Russia" )){
                    x=9.6;
                    y=9.0;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Bulgaria" )){
                    x=9.5;
                    y=9.4;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }
                else if (country.equals ( "Italy" )){
                    x=9.7;
                    y=9.15;
                    sum=x+y;
                    diff=20-sum;
                    pr=diff/20*100;
                    System.out.printf ( "The team of %s get %.3f on %s.%n",country,sum,toy );
                    System.out.printf ( "%.2f%s",pr,cha );
                    break;

                }

        }


    }
}
