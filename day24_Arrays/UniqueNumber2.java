package day24_Arrays;

public class UniqueNumber2 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 5, 7, 8, 9, 7, 5, 2};
        for( int a: arr) {

            int num1 = a; // 1
            int count = 0;
            for (int b : arr) { //only calculates the frequnecy of num
             
                if (a==b) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println(a+" ");
            }

        }



    }
}
