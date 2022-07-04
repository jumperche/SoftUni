package Uni;

import java.util.Scanner;

public class MultiTable {
    public static void main (String args[]){
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        int m = Integer.parseInt ( scanner.nextLine ( ) );
        int MulTable[][]=new int[n][m];
        int row=1,column=1;
        for(int i=0; i<MulTable.length; i++){
            for(int j=0; j<MulTable[i].length; j++){
                MulTable[i][j]=row*column;
                column=column+1;
            }
            row=row+1;
            column=1;
        }
      ;
        for(int i=0; i<MulTable.length; i++){
            for(int j=0; j<MulTable[i].length; j++){

                System.out.print(" "+Integer.toBinaryString(MulTable[i][j])+" ");
            }
            System.out.print("\n");
        }
    }
}
