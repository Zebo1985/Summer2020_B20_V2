package day43_Statik;

public class Variable {

    int d;
    static int s;
    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }
    public static void main(String[] args) {
        //System.out.println(a);
        System.out.println(s);
        Variable obj=new Variable();
        System.out.println(obj.d);
        //System.out.println(d);
    }
    public static void method1(){
        int a;
        if(true){
            int b =20;
            //System.out.println(a);
            System.out.println(b);
        }
    }
}
