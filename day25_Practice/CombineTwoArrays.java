package day25_Practice;

import java.util.Arrays;

/*
    6. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
 */
public class CombineTwoArrays {
    public static void main(String[] args) {
int[]arr1={1,2,3,7,34,67,12,};
int[]arr2={4,5,43,5,2,65,24,};
        int size=arr1.length+arr2.length;
int[]arr3= new int[size]; //5
        /*arr3[0]=arr1[0];
         arr3[1]=arr1[1];
         arr3[2]=arr1[2];

        arr3[3]=arr2[0];
        arr3[4]=arr1[1];*/
int index=0;
for(int each:arr1){
    arr3[index]=each;
    index+=1;
}
for(int each:arr2){
    arr3[index]=each;
    index++;
}
       Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3[arr3.length-1]);
    }
}
