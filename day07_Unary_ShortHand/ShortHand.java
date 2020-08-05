package day07_Unary_ShortHand;

public class ShortHand {
    public static void main(String[] args) {
    int a = 100;
    // a= a*a;
        a *=a;
        System.out.println("==========================================");
        //+=;
        int z = 300;
        z  += 200;
        System.out.println(z);
        String schoolName = "Cybertek";
        System.out.println(schoolName);
        schoolName += "School";

        String fulName = "Zebo";
        fulName += " Ubaydullaeva";
        System.out.println(fulName);

String bookName = "Algebra";
  bookName += " geometriya";
        System.out.println(bookName);

        int budget = 10000;
        budget /=4;
        System.out.println(budget);
   int q = 100;
        System.out.println(q/2); //50
        System.out.println(q);  //100

        int x = 100;
        x /= 2; //50
        System.out.println(x);
        x *= 2;
        System.out.println(x);

        ///%=
        int num =100;
        num %= 3;
        System.out.println(num);

        double num2 = 400.5;
        num2 %=2;
        System.out.println(num2);









    }
}
