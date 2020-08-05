package day23_Arrays;
/* int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array*/
public class MaxAndMin {
    public static void main(String[] args) {
 int[] arr= {10, 20, 3, 4, 5, 6, 7, -10, -100, 300, 400};
 int max= arr[0];  //11
int min= arr[0];
 for(int i=1; i<=arr.length-1; i++) { //compares the arrey' and assign
     // the maximum number to variable max
     if (arr[i] > max) {
         max = arr[i];
     }
         if (arr[i] < min) {
             min = arr[i];
         }
     }
     System.out.println(max);

     System.out.println(min);

 }

    }

