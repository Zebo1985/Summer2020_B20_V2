package day32_Recap;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int[]arr = {9,8,7};
        Arrays.sort(arr);
        String[]name = {"D", "A","C"};
        Arrays.sort(name);
    }

    public static void method(int a) {
    }
    public static void method(int a, int b) {

    }
}