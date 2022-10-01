package SoftuniFundamentals;
//On the first line, you will be given a string containing all of your stops. Until you receive the command "Travel", you will be given some commands to manipulate that initial string. The commands can be:
//•	"Add Stop:{index}:{string}":
//o	Insert the given string at that index only if the index is valid
//•	"Remove Stop:{start_index}:{end_index}":
//o	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
//•	"Switch:{old_string}:{new_string}":
//o	If the old string is in the initial string, replace it with the new one (all occurrences)
//Note: After each command, print the current state of the string if it is valid!
//After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"
//Input / Constraints
//•	JavaScript: you will receive a list of strings
//•	An index is valid if it is between the first and the last element index (inclusive) (0 ….. Nth) in the sequence.


//Hawai::Cyprys-Greece
//Add Stop:7:Rome
//Remove Stop:11:16
//Switch:Hawai:Bulgaria
//Travel
import java.util.Scanner;

public class WorldTour {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        StringBuilder stops = new StringBuilder ( scanner.nextLine ( ));
        String[] input=scanner.nextLine ().split ( ":");
        while ( !input[0].equals ( "Travel" ) ){
            switch (input[0]){
                case "Add Stop":
                    int index=Integer.parseInt ( input[1]);
                    if (index<stops.length ()&&index>=0) {
                        String helper = input[ 2 ];
                        stops.insert ( index , helper );
                    }

                    break;
                case "Remove Stop":
                    int start=Integer.parseInt ( input[1]);
                    int end=Integer.parseInt ( input[2]);
                    if (start>=0&&start<stops.length ()&&end<stops.length ()&&end>=0) {

                        stops.replace ( start,end +1,"");
                    }

                    break;
                case "Switch":

                    String helper=input[ 1 ];
                    start=stops.indexOf ( helper );
                    end=helper.length ();
                    if(stops.toString ().contains (  helper)) {
                        stops.replace ( start,start+end,input[ 2 ] );
                    }
                    break;
            }
            System.out.println (stops );
            input=scanner.nextLine ().split ( ":");

        }
        System.out.printf ( "Ready for world tour! Planned stops: %s",stops);

    }
}
