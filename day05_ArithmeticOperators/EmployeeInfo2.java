package day05_ArithmeticOperators;

public class EmployeeInfo2 {

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
        String fullname = firstname+" " + lastname;

        System.out.println("Employee' full name is: "+ fullname);
        System.out.println(fullname+ "'s gender is: " + gender);
        System.out.println(fullname+ "'s age is: "+ age + " years old");
        System.out.println(fullname + "work at: " +companyName  );
        System.out.println(fullname+ " job title is: " + jobTitle);
        System.out.println(fullname+ " salary is: $" + salary);
        System.out.println(fullname+" is full time employee: " + isFullTime);
        System.out.println(fullname+" is married: " + isMarried);



    }







    }



