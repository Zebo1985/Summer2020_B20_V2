package day11_NestedIf_Switch;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = 100;
        String res = "";
        if(num>0){
            res = "positive";
        }else if(num<0){
            res = "negative";
        }else{
            res = "zero";
        }
        String res2= (num>0)?"positive":(num<0)?"negative":"zero";
        System.out.println(res);
        System.out.println(res2);
        System.out.println("=========================================");
        /*
        Write a program that can compare two number
        a = 10, b=20
        output: b is bigger
        a = 30, b= 10.
        output: a is bigger
         */
int a = 100;
int b = 100;
String r = (a>b)?"a is bigger":(b>a)?"b is bigger":"a is equal to b";
        System.out.println(r);

    }
}
