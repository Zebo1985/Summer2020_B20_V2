package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate = 48;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHours = 40;
        double salary = rate * weeklyHours * 48;
        System.out.println("Salary befor tax: "+salary+" USD");
    double totalTax = salary *( stateTaxRate+federalTaxRate);
        System.out.println("Total Tax: "+totalTax+" USA");

double salaryAfterTax = salary- totalTax;
        System.out.println("Salary after tax: "+salaryAfterTax+" USA");




    }



}
