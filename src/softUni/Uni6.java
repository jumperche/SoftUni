package softUni;

public class Uni6 {
    public static void main ( String[] args ) {

        double x = -2;
        double y = -12;
        double z = 277;
        if ( (x > 0 && y <= 0 && z <= 0 )||(y > 0 && x <= 0 && z <= 0)||( !(y > 0) && x <= 0 && z > 0)) {
            System.out.println ( "Yes" );
        } else {
            System.out.println ( "No" );
        }

    }
}
