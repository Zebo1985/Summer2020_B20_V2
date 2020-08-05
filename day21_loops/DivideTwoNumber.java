package day21_loops;

public class DivideTwoNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;  //b!=0
        int count = 0;
        while (a>=b){
            a-=b;
       count++;
        }
        System.out.println(count +" with a remainder of "+a);

    }
}
