package day20_whileLoop;

import java.util.Scanner;

/*
    4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120*/
public class factorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

        int result = 1; // 5*4*3*2*1
for(int i =n; i>=1; i--){
  result *= i;
}
        System.out.println(result);



    }
}
