package uni1;

import java.io.*;

/* Create a blank text file called test.txt and use it to do the following exercises.
 * Open a file in write mode using the open() method, and write the following message
 * Append the following using the with open method
 * Print out each line in the file test.txt, put the file in read mode.
 * Overwrite the message in testfile.txt with a message of your own.
 * @autor Rosalina Gramatikov
 * @ver 1.0
 * @26.6.2022
 */
public class Zadacha3 {

        public static void main ( String[] args ) {
            String firstString = "I'se The B'y that builds the boat and\r\nI'se The B'y that sails her\r\n";
            String secondString = "Are the first two lyrics of the song\r\n\"I'se the B'y\" by Great Big Sea\r\n";

            try {
                File myFile = new File ( "test.txt" );

                if ( !myFile.exists ( ) ) {//check file exist
                    myFile.createNewFile ( );//make new file
                }


                myFile.setWritable ( true );// make file writable

                write ( myFile , firstString , false );// Add the first string to the beginning of the file

                write ( myFile , secondString , true );// Append the second string to the file

                myFile.setWritable ( false );// make file read-only

                print ( myFile );// print out each line of the file

                myFile.setWritable ( true ); //make file writable
                write ( myFile , "my very own message yey" , false );

                print ( myFile );// print out each line of the file
            } catch (IOException e) {
                System.out.println ( "An error occurred." );
                e.printStackTrace ( );
            }
        }

        public static void write ( File myFile , String message , boolean append ) throws IOException {//write method
            FileWriter myWriter = new FileWriter ( myFile , append );
            myWriter.write ( message );
            myWriter.close ( );
        }

        public static void print ( File myFile ) throws FileNotFoundException, IOException {//print method
            FileReader fr = new FileReader ( myFile ); // reads the file
            BufferedReader br = new BufferedReader ( fr ); // creates a buffering character input stream
            String line;
            while ( ( line = br.readLine ( ) ) != null ) {//loop while line not null
                System.out.println ( line );
            }

            fr.close ( ); // closes the stream and release the resources
        }
    }

