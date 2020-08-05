package day26_MultiDimensionalArray;

import java.util.Arrays;
/*  write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
 */
public class SortDescending {
    public static void main(String[] args) {

        int[]arr = {2, 1, 3, 4, 5, 6, 7};
        Arrays.sort(arr);  //  arr: {1,2,3}
        System.out.println(Arrays.toString(arr));
        int[]desc= new int[arr.length];
        desc[0] = arr[2];
        desc[1] = arr[1];
        desc[2] = arr[0];

   int k = arr.length-1;
    for(int i=0; i<=desc.length-1; i++){  // i: 0, 1, 2;
      desc[i]= arr[k];
       k--;  // k: 2, 1, 0;
    }
        System.out.println(Arrays.toString(desc));



    }
}
