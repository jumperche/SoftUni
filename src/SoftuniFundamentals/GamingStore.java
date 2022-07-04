package SoftuniFundamentals;

import java.util.*;

public class GamingStore {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        double n = Double.parseDouble ( scanner.nextLine ( ) );
        String input= scanner.nextLine ( );
        double sum=0;
        while (!input.equals ( "Game Time" ) ){
            switch (input){
                case "OutFall 4":
                    if (sum+39.99<=n){
                    sum=sum+39.99;
                        System.out.println ("Bought "+input );
                        break;
            }
                    else {
                        System.out.println ("Too Expensive" );
                        break;
                    }
                case "CS: OG":
                    if (sum+15.99<=n){
                        sum=sum+15.99;
                        System.out.println ("Bought "+input );
                    break;
                    }
                    else {
                        System.out.println ("Too Expensive" );
                        break;
                    }

            case "Zplinter Zell":
                if (sum+19.99<=n){
                    sum=sum+19.99;
                    System.out.println ("Bought "+input );
                break;
                }
                else {
                    System.out.println ("Too Expensive" );
                    break;
                }
                case "Honored 2":
                if (sum+59.99<=n){
                    sum=sum+59.99;
                    System.out.println ("Bought "+input );

                break;
                }
                else {
                    System.out.println ("Too Expensive" );
                    break;
                }
                case "RoverWatch":
                    if (sum+29.99<=n){
                        sum=sum+29.99;
                        System.out.println ("Bought "+input );
                        break;
                    }
                    else {
                        System.out.println ("Too Expensive" );
                        break;
                    }
                case "RoverWatch Origins Edition":
                    if (sum+39.99<=n){
                        sum=sum+39.99;
                        System.out.println ("Bought "+input );
                break;
                    }
                    else {
                        System.out.println ("Too Expensive" );
                        break;
                    }
                default:
                    System.out.println ("Not Found" );
                    break;
            }
            if (n-sum==0){
                System.out.println ("Out of money!" );
                break;
            }
            input= scanner.nextLine ( );
        }
        if (n-sum!=0){
            System.out.printf ("Total spent: $%.2f. Remaining: $%.2f",sum,n-sum );

        }
    }
}
