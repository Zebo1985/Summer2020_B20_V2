package day13_Scanner;

import java.util.Scanner;

/*  write a program that can calculate the state tax, federal tax and salary after tax
                needed informations:
                                annual salaray
                                state tax rate
                                federal tax rate
 */
public class SalaryAfterTex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = input.nextInt(); //100000
        System.out.println("Enter your state rate: ");
         double stateTaxRate = input.nextDouble();//0.08
          double stateTax = salary * stateTaxRate;
        System.out.println("Enter your federal tax rate: ");

        double federalTaxRate = input.nextDouble();
        double federalTax = salary * federalTaxRate;//0,2
        double salaryAfterTax = salary-stateTax-federalTax;
        System.out.println("Your annual salary: $ "+salary);
        System.out.println("Your state tax: $ "+stateTax);
        System.out.println("Federal tax: $ "+federalTax);
        System.out.println("Your salary after tax: $ "+salaryAfterTax );

    }
}
