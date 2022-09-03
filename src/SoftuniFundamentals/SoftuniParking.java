package SoftuniFundamentals;
//SoftUni just got a new parking lot. It's so fancy, it even has online parking validation. Except, the online service doesn't work. It can only receive users' data but doesn't know what to do with it. Good thing you're on the dev team and know how to fix it, right?
//Write a program, which validates parking for an online service. Users can register to park and unregister to leave.
//The program receives 2 commands:
//•	"register {username} {licensePlateNumber}":
//o	The system only supports one car per user at the moment, so if a user tries to register another license plate, using the same username, the system should print:
//"ERROR: already registered with plate number {licensePlateNumber}"
//o	If the aforementioned checks pass successfully, the plate can be registered, so the
//the system should print:
// "{username} registered {licensePlateNumber} successfully"
//•	"unregister {username}":
//o	If the user is not present in the database, the system should print:
//"ERROR: user {username} not found"
//o	If the aforementioned check passes successfully, the system should print:
//"{username} unregistered successfully"
//After you execute all of the commands, print all the currently registered users and their license plates in the format:
//•	"{username} => {licensePlateNumber}"
import java.util.*;
import java.util.stream.Collectors;

public class SoftuniParking {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );

        Map<String,String> map=new LinkedHashMap<> (  );
        for ( int i = 0 ; i < n ; i++ ) {
           List< String > input = (List< String >) Arrays.stream ( scanner.nextLine ( ).split ( " " ) ).collect ( Collectors.toList ( ) );
        switch (input.get ( 0 )){
            case "register":
                if ( map.containsKey ( input.get ( 1 )) ){
                    System.out.printf ( "ERROR: already registered with plate number %s%n",map.get ( input.get ( 1 ) ) );
                    break;
                }
                else {
                    System.out.printf ( "%s registered %s successfully%n",input.get ( 1 ), input.get ( 2 ) );
                    map.put ( input.get ( 1 ), input.get ( 2 ) );
                    break;
                }



            case "unregister":
                if ( map.containsKey ( input.get ( 1 )) ){
                    System.out.printf ( "%s unregistered successfully%n",input.get ( 1 )  );
                    map.remove ( input.get ( 1 ) );
                    break;
                }
                else {
                    System.out.printf ( "ERROR: user %s not found%n",input.get ( 1 ) );

                    break;
                }
        }
        }
        for ( Map.Entry< String, String > entry : map.entrySet ( ) ) {
            System.out.printf ( "%s => %s%n",entry.getKey (),entry.getValue () );
        }


    }
}
