package day28_Recap;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        int[]arr1D = {1,2,3};
        int[][] arr2D = { { 1,2,3,}, {4,5,6,7,8}, {9,10,11,12,13}};

        System.out.println( Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][3]);
        System.out.println("==============================================");
        for(int i = 0; i<=arr2D.length-1; i++){ //gets each 1D array
            int[] each1D= arr2D[i];
            System.out.println(Arrays.toString(each1D));
        for(int j=0;j<=each1D.length-1; j++) { //iterates the element of each 1D array from arr2D
            int eachNum = each1D[j];
            if (eachNum % 2 == 0) {
                System.out.print(eachNum + " ");
            }
        }
            System.out.println();
            System.out.println("=======================================");
            for (int[] each1DArray :arr2D){
                for(int eachElement:each1DArray) {
                    if (eachElement % 2 != 0) {
                        System.out.print(eachElement + " ");
                    }
                }
                System.out.println();
            }



        }

    }
}
