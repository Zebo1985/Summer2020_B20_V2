package day24_Arrays;

import java.util.Arrays;

public class Arrays_Utility {
    public static void main(String[] args) {
     String[]name= {"Zebo", "Sabrina", "Dilnura", "Behruz", "Abdolloh"};
        System.out.println(Arrays.toString(name));
        System.out.println("=============================================");
int[] nums= {5, 4, 6, 3, 7, 10};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Maximum number: "+nums[nums.length-1]);
        System.out.println("Minimum number: "+nums[0] );
String students[]={"Mehdi", "Elkem", "Trump", "Zebo" };
Arrays.sort(students);
System.out.println(Arrays.toString(students));
        System.out.println("=================================================");
int[] arr1 = {1, 2, 3, };
int[] arr2 = {1, 2, 3, };
boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);
        int[] arr3= {3, 1, 2};
        Arrays.sort(arr3);

     boolean r2 = Arrays.equals(arr2,arr3);

        System.out.println(r2);
int[] arr4= {1, 2, 3, 4};
 boolean r3 = Arrays.equals(arr3,arr4);
        System.out.println(r3);




    }
}
