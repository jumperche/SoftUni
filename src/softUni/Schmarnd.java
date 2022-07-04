/* Програма за пресмятане на различните подреждания на 6 от 26 букви с повторения
 * @autor Rosalina Gramatikov
 * @ver 1.0
 * @15.06.2022
 */
package softUni;

public class Schmarnd {

    public static void main ( String args[] ) {
        int count = 0;
        for ( int i = 97 ; i <= 122 ; i++ ) {
            for ( int j = 97 ; j <= 122 ; j++ ) {
                for ( int k = 97 ; k <= 122 ; k++ ) {
                    for ( int l = 97 ; l <= 122 ; l++ ) {
                        for ( int m = 97 ; m <= 122 ; m++ ) {
                            for ( int n = 97 ; n < 122 ; n++ ) {
                                count++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println ( "All possible combinations: " + count );
    }
}



