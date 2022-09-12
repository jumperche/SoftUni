package SoftuniFundamentals;
//You will be given a string representing a username. The password will be that username reversed. Until you receive the correct password, print on the console "Incorrect password. Try again.". When you receive the correct password, print "User {username} logged in." However, on the fourth try, if the password is still not correct, print "User {username} blocked!" and end the program.
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
