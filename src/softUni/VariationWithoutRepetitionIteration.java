package softUni;

public class VariationWithoutRepetitionIteration {
    public static void main ( String[] args ) {

        int n=5;
        int k=3;
        int[] arr=new int[k];
        while ( (true) ){
            printE ( arr );
            int index=k-1;
            while ( index>=0&&arr[index]==n-1 ){
                index--;
                if (index<0){
                    break;
                   // arr[index]=arr[ index+1 ];
                    //for ( int i = index+1 ; i <k  ; i++ ) {
                     //   arr[i]=0;
                   // }

                }
            }
        }


    }
    private static void printE ( int[] arr ) {

        System.out.println (arr ) ;
    }
}
