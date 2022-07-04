package softUni;

import java.util.*;

public class ManipilationArray {
    //public static int[] primitive;
    public static List< String > in = new ArrayList< String > ( );
    public static List< Integer > list = new ArrayList< Integer > ( );

    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );
        String input = scanner.nextLine ( );
        for ( String s : input.split ( "\\s" ) ) {
            list.add ( Integer.parseInt ( s ) );
        }
        list.toArray ( );
        //System.out.println (list );
        //int[] primitive = list.stream ( )
        //       .mapToInt ( i -> i ).toArray ( );
        //exchange ( 2 );
        //System.out.println ( list );
        in = List.of ( scanner.nextLine ( ).split ( "\\s+" ) );
        System.out.println ( );
        while ( !"end".equals ( in.get ( 0 ) ) ) {
            switch (in.get ( 0 )) {
                case "max":
                    max ( in.get ( 1 ) );
                    break;
                case "exchange":
                    int x = Integer.parseInt ( in.get ( 1 ) );
                    exchange ( x );
                    break;
                case "min":
                    min ( in.get ( 1 ) );
                    break;
                case "first":
                    int c = Integer.parseInt ( in.get ( 1 ) );
                    first ( in.get ( 2 ) , c );
                    break;
                case "last":
                    int d = Integer.parseInt ( in.get ( 1 ) );
                    last ( in.get ( 2 ) , d );
                    break;
            }
            in = List.of ( scanner.nextLine ( ).split ( "\\s+" ) );
        }
        System.out.println ( list );
    }
    public static List< Integer > exchange ( int index ) {
        if ( index > list.size ( ) ) {
            System.out.println ( "Invalid index" );
        } else {
            for ( int i = 0 ; i <= index ; i++ ) {
                int x = list.get ( 0 );
                list.remove ( 0 );
                list.add ( x );
            }
        }
        return list;
    }
    public static void max ( String command ) {
        int maxEv = Integer.MIN_VALUE;
        Integer maxEI = null;
        int maxOdd = Integer.MIN_VALUE;
        Integer maxOI = null;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ( list.get ( i ) % 2 == 0 ) {
                if ( maxEv < list.get ( i ) ) {
                    maxEv = list.get ( i );
                    maxEI = i;
                }
            } else {
                if ( maxOdd < list.get ( i ) ) {
                    maxOdd = list.get ( i );
                    maxOI = i;
                }
            }
        }
        if ( command.equals ( "odd" ) ) {
            if ( maxOI == null ) {
                System.out.println ( "No matches" );
            } else {
                System.out.println ( maxOI );
            }
        }
        if ( command.equals ( "even" ) ) {
            if ( maxOI == null ) {
                System.out.println ( "No matches" );

            } else {
                System.out.println ( maxEI );
            }
        }

    }
    public static void min ( String command ) {
        int maxEv = Integer.MAX_VALUE;
        Integer maxEI = null;
        int maxOdd = Integer.MAX_VALUE;
        Integer maxOI = null;
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ( list.get ( i ) % 2 == 0 ) {
                if ( maxEv > list.get ( i ) ) {
                    maxEv = list.get ( i );
                    maxEI = i;
                }
            } else {
                if ( maxOdd > list.get ( i ) ) {
                    maxOdd = list.get ( i );
                    maxOI = i;
                }
            }
        }
        if ( command.equals ( "odd" ) ) {
            if ( maxOI == null ) {
                System.out.println ( "No matches" );
            } else {
                System.out.println ( maxOI );
            }
        }
        if ( command.equals ( "even" ) ) {
            if ( maxEI == null ) {
                System.out.println ( "No matches" );
            } else {
                System.out.println ( maxEI );
            }
        }
    }
    public static void first ( String command , int index ) {
        List< Integer > firstE = new ArrayList< Integer > ( );
        List< Integer > firstO = new ArrayList< Integer > ( );
        if ( index > list.size ( ) ) {
            System.out.println ( "Invalid count" );
        }
        else {
            for ( int i = 0 ; i < list.size ( ) ; i++ ) {
                if ( list.get ( i ) % 2 == 0 ) {

                    firstE.add ( list.get ( i ) );
                } else {
                    firstO.add ( list.get ( i ) );
                }
            }
            if ( command.equals ( "odd" ) ) {
                if ( firstO.size ( ) < index ) {
                    System.out.println ( firstO );
                } else {
                    for ( int i = index ; i <= firstO.size ( ) + 1 ; i++ ) {
                        firstO.remove ( index );
                    }


                    System.out.println ( firstO );
                }
            }
            if ( command.equals ( "even" ) ) {
                if ( firstO.size ( ) < index ) {
                    System.out.println ( firstO );
                } else {
                    for ( int i = index ; i <= firstE.size ( ) + 1 ; i++ ) {
                        firstE.remove ( index );
                    }

                    System.out.println ( firstE );
                }
            }
        }
    }
    public static void last ( String command , int index ) {
        List< Integer > firstE = new ArrayList< Integer > ( );
        List< Integer > firstO = new ArrayList< Integer > ( );
        if ( index > list.size ( ) ) {
            System.out.println ( "Invalid count" );
        }
        for ( int i = 0 ; i < list.size ( ) ; i++ ) {
            if ( list.get ( i ) % 2 == 0 ) {
                firstE.add ( list.get ( i ) );
            } else {
                firstO.add ( list.get ( i ) );
            }
        }
        if ( command.equals ( "odd" ) ) {
            for ( int i = 0 ; i <= firstO.size ( ) ; i++ ) {
                if ( i <= list.size ( ) - index ) {
                    firstO.remove ( 0 );
                }
            }
            System.out.println ( firstO );
        }
        if ( command.equals ( "even" ) ) {
            for ( int i = firstO.size ( ) ; i < index ; i-- ) {
                if ( i <= list.size ( ) - index) {
                    firstO.remove ( i );
                }
            }
            System.out.println ( firstE );
        }
    }
}
