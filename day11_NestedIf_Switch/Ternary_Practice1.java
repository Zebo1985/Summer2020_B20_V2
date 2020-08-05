package day11_NestedIf_Switch;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 23;
        String citizen = "USA";
        String res = "";
        if(age>=18&&citizen=="USA"){
            res = "Can Vote";
        }else{
            res ="Can Not Vote";
        }
        System.out.println(res);
String res1 =(age>=18&&citizen=="USA")?"Can Vote":"Can Not Vote";
        System.out.println(res1);
        System.out.println("==========================================");
int n1 = 100;
int n2 = 200;
String r= (n1==n2)?"Equal":"Not Equal";
        System.out.println(r);





    }
}
