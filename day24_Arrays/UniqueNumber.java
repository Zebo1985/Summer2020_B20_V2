package day24_Arrays;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 5, 7, 8, 9, 7, 5, 2};
        for( int j= 0; j<=arr.length-1; j++) {

            int num1 = arr[j]; // 1
            int count = 0;
            for (int i = 0; i <= arr.length - 1; i++) { //only calculates the frequnecy of num
                int each = arr[i];  // 1  1   2  3  3
                if (each == num1) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(num1);
            }

        }

    }
}