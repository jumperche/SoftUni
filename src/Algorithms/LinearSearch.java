package Algorithms;

public class LinearSearch {
    public static void main ( String[] args ) {
        int[]arr={13,2,34,73,24,86};
        System.out.println (indexOf(arr,73) );
    }
    public static int indexOf(int[]arr,int key){
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }
}
