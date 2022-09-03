package SoftuniFundamentals;
//Until you receive the "stop" command, you will be given a sequence of strings, each on a new line. Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, etc.) and every even - quantity. Your task is to collect the resources and print them each on a new line.
//Print the resources and their quantities in format: "{resource} –> {quantity}".
//The quantities inputs will be in the range [1 … 2 000 000 000].

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        String input = "";
        int in;
        Map <String,Integer> map=new LinkedHashMap<> (  );
        input=scanner.nextLine ();
        in=Integer.parseInt ( scanner.nextLine ());
        while ( !input.equals ( "stop" ) ){

            map.putIfAbsent ( input,0);
            map.put ( input, map.get ( input)+in );
            input=scanner.nextLine ();
            if (input.equals ( "stop" )){
                continue;
            }
            in=Integer.parseInt ( scanner.nextLine ());
        }
        for ( Map.Entry< String, Integer > entry : map.entrySet ( ) ) {
            System.out.printf ( "%s -> %d%n",entry.getKey (),entry.getValue () );
        }

    }
}
