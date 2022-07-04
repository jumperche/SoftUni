package softUni;

import java.util.Scanner;

public class Moving {
    public static void main ( String[] args ) {



        Scanner scanner= new Scanner ( System.in );
        int wide = Integer.parseInt (   scanner.nextLine ());

        int length = Integer.parseInt (   scanner.nextLine ());

        int hight = Integer.parseInt (   scanner.nextLine ());

        int space = wide * length * hight;
        int spaceLeft = 0;
        String box =  scanner.nextLine ();


        while (!box.equals ( "Done") )
        {
            int boxes=Integer.parseInt ( box );
            spaceLeft += boxes;

            if (spaceLeft >= space)
            {
                break;
            }
            box =  scanner.nextLine ();
        }

        if (spaceLeft >= space)
        {
            System.out.printf ("No more free space! You need %d Cubic meters more.",Math.abs(spaceLeft-space));
        }
        else        {
            System.out.printf ("%d Cubic meters left.",Math.abs(spaceLeft-space));
        }



    }
}
