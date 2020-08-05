package day14_Recap;

import java.util.Scanner;
/*   1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )*/
public class Scanner_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your gender: ");
       String gander= input.next();

       System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your Country name: ");
        String countryName = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name: ");
        String fulName = input.nextLine();

        System.out.println("Enter your full company name: ");
        String fulcompanyName = input.nextLine();




    }

}
