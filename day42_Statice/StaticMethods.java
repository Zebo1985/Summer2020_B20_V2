package day42_Statice;

public class StaticMethods {
    int a =200;
    static int b=300;

    public static void main(String[] args) {
        System.out.println(b);
       // System.out.println(a);
        //System.out.println(this.a);
        StaticMethods obj=new StaticMethods();
        System.out.println(obj.a);
    staticMethod();
    StaticMethods.staticMethod();
   //  instanceMethod();
   //StaticMethods.instanceMethod();
    obj.instanceMethod();
    }
    public static void staticMethod(){

    }
    public void instanceMethod(){

    }
}
