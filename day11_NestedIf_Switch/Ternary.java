package day11_NestedIf_Switch;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String res= "";
        if(num%2==0){
            res = "Even";
        }else{
            res = "Odd";
        }
        System.out.println(res);
        System.out.println("=============================");
       String res2= (num%2==0)?"Even":"Odd";
        System.out.println(res2);
        System.out.println("=================================");
int num1= 100;
int num2 = 20;
int max1 =0;
if(num1>num2) {
    max1 = num1;
}else {
    max1 = num2;
}
        System.out.println(max1);
int max2 =(num1>num2) ? num1 : num2;
        System.out.println(max2);
        System.out.println("===============================");
int age = 20;
boolean eligible = false;
if(age>=21){
    eligible = true;
}else{
    eligible = false;
}
        System.out.println(eligible);
        System.out.println("================================");
        boolean eligible1 = (age>=21)? true :false;
        System.out.println(eligible1);



    }
}
