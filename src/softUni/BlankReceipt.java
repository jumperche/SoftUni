package softUni;

public class BlankReceipt {
    static void printHeader(){
        System.out.println ("CASH RECEIPT" );
        System.out.println ("------------------------------" );
    }
    static void printBody(){
        System.out.println ("Charged to____________________" );
        System.out.println ("Received by___________________" );
    }
    static void printFooter(){
        System.out.println ("------------------------------" );
        System.out.println ("(c) SoftUni" );
    }
static void printReceipt(){
        printHeader ();
        printBody ();
        printFooter ();
}
    public static void main ( String[] args ) {
        printReceipt ();
    }
}
