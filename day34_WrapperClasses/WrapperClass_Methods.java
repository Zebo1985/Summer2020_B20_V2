package day34_WrapperClasses;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        String str = "123";
        int a=Integer.parseInt(str);
        System.out.println(str+1);
        System.out.println(a+1);
        Double d=Double.parseDouble("7.5");
        System.out.println(d-1);
       String s1= "true";
         boolean b = Boolean.parseBoolean(s1);
        System.out.println(!b);
        System.out.println();
        System.out.println("================================================");
        String s2 = "100000.5";
        double d2 = Double.valueOf(s2); // unboxing
        System.out.println( d2*2);
        String s3= "False";
        boolean r2 = Boolean.valueOf(s3);  //unboxing
        System.out.println(r2);

    }
}