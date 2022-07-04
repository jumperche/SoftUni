package Uni;

import java.util.Scanner;

public class one {

    public static void main ( String[] args ) {
     Scanner scan = new Scanner (System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int counterMin=0;
        int counterMax=0;
        // Asking the user for array size
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        // Creating the array
        String product[] = new String[size];

        int quantity[] = new int[size];

        // Takes the string as input from the user
        for(int i = 0;i<size;i++){

            product[i] = scan.nextLine ( );



                System.out.println ( "Enter product elements : " );
                product[i] = scan.nextLine ( );
                System.out.println ( "Enter quantity elements : " );
                quantity[i] = Integer.parseInt ( scan.nextLine ( ) );
            }
        for ( int i = 0; i <size ; i++ ) {
                           if (min>quantity[i]){
                               min=quantity[i];
counterMin=i;
                           }
                           if (max<quantity[i]){
max=quantity[i];
counterMax=i;
                           }

            System.out.print (product[i] +" ");
            System.out.println (quantity[i] );
        }


        System.out.println ("Min is: "+min +" "+ product[counterMin] );
        System.out.println ("Max is: "+max + " "+product[counterMax] );
        //System.out.println("The array elements are : ");
        // Array elements printed using Stream API
        //Arrays.stream(product).forEach(System.out::println);
        //Arrays.stream(quantity).forEach(System.out::println);
    }
}


