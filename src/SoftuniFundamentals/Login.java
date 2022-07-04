package SoftuniFundamentals;

import java.util.*;

public class Login {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String name = scanner.nextLine ( );
        String pass="";
        int count=0;
        for ( int i = name.length ()-1 ; i >=0 ; i-- ) {
            pass=pass+name.charAt ( i );

        }
        String input= scanner.nextLine ( );
        while ( !input.equals ( pass )){

            count++;
            if (count>3){
                System.out.println ("User "+name+" blocked!" );
                break;
            }
            System.out.println ("Incorrect password. Try again." );
            input= scanner.nextLine ( );
        }
        if (input.equals ( pass )){
            System.out.println ("User "+name+" logged in." );
        }
    }
}
