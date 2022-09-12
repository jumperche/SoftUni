package SoftuniFundamentals;
//As a MOBA challenger player, Peter has the bad habit of trashing his PC when he loses a game and rage quits. His gaming setup consists of a headset, mouse, keyboard, and display. You will receive Peter's lost games count.
//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time when he trashes his keyboard, he also trashes his display.
//You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment.
import java.util.*;

public class RageExpenses {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        double headset=Double.parseDouble ( scanner.nextLine ( ) );
        double mouse=Double.parseDouble ( scanner.nextLine ( ) );
        double keyboard=Double.parseDouble ( scanner.nextLine ( ) );
        double display=Double.parseDouble ( scanner.nextLine ( ) );
        double head=(n/2)*headset;
int mous=(n/3);
int both=(n/6);
int dis=(n/12);
double sum=mous*mouse+both*keyboard+dis*display+head;

        System.out.printf ( "Rage expenses: %.2f lv.%n",sum );
    }
}
