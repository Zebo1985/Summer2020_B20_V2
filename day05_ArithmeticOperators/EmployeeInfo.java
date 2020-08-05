package day05_ArithmeticOperators;
/*
create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
 */
public class EmployeeInfo {
    public static void main(String[] args) {
// firstname, lastname, gender, age, companyname, jobTitle
        String firstname = "John";
        String lastname = "Daniel";
        byte age = 35;
        String companyName = "CapitalOne";
        char gender = 'M';
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120_000.50;
        System.out.println("Employee' full name is: John Daniel");
        System.out.println(firstname+" "+lastname+ "' gender is: " + gender);
        System.out.println(firstname+" "+lastname+ "' age is: "+ age + " years old");
        System.out.println(firstname+" "+lastname + "work at: " +companyName  );
        System.out.println(firstname+" "+lastname+ " job title is: " + jobTitle);
        System.out.println(firstname+" "+lastname+ " salary is: $" + salary);
        System.out.println(firstname+" "+lastname+" is full time employee: " + isFullTime);
        System.out.println(firstname+" "+lastname+" is married: " + isMarried);



    }









}
