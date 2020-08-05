package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1);
        boolean r2 = 100<9000;
        System.out.println(r2);
    boolean r3 = 87>=85;
        System.out.println(r3);
        boolean r4 = 877>=878;
        System.out.println(r4);
        boolean r5 = 200<=300;
        System.out.println(r5);

        boolean r6 =900==800;
        System.out.println(r6);
        boolean r7 = true==false;
        System.out.println(r7);
        boolean r8= "muhtar"=="Good gay";
        System.out.println(r8);
//  !=
        boolean r11= "muhtar" != "bad gay";
        System.out.println(r11);
        boolean r12 =true!=false;
        System.out.println(r12);
        boolean result1 = 'A'==65;
        System.out.println(result1);
        boolean result2 = 100==100.0;
        System.out.println(result2);
        boolean result3 = 10==10.999999999;
        System.out.println(result3);
        boolean result4 = "100"=="100.0";
        System.out.println(result4);
        boolean n1 = 100%2==0;
        System.out.println(n1);

        int number = 100;
        boolean even = number%2==0;
        System.out.println(even);
        boolean odd = number%2 !=0;
        System.out.println(odd);
        int x = 1000;
        boolean divisible1 = x%3==0;
        boolean divisible2 = x%5==0;
        boolean divisible3 = x%10==0;
        System.out.println(divisible1);
        System.out.println(divisible2);
        System.out.println(divisible3);





    }
}
