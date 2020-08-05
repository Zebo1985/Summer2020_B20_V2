package day32_Recap;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum= scan.nextDouble();
        System.out.println("Operator: ");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number: ");
        double secondtNum= scan.nextDouble();
        double result= calculator(firstNum, secondtNum,operator);
        System.out.println(result);
    }


    public static double calculator(double num1, double num2, char operator){
        double result = (operator=='+')? num1+num2:(operator=='-')? num1-num2: (operator=='*')? num1*num2:
                (operator=='/')? num1/num2:(operator=='%')? num1%num2:0;
     return result;
    }
}
