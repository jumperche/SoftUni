package SoftuniFundamentals;

import java.util.*;

public class FlotingEquality {
   public static void main ( String[] args ) {
      Scanner scanner = new Scanner ( System.in );
      double n = Double.parseDouble ( scanner.nextLine ( ) );
      double n1 = Double.parseDouble ( scanner.nextLine ( ) );
   double sum=Math.abs ( n-n1 );
   if (sum<0.000001) {
      System.out.println ( "True" );
   }
   else {
      System.out.println ("False" );
   }

   }
   }
