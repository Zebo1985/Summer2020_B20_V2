package day33_LocalDateTime;
/*      1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
*/
public class Calculate {
    public static void main(String[] args) {
       long l1 =20;
       long l2=30;
        float n1 = 10;
        float n2 = 9;
        System.out.println(Multiplication((int)l1, (int)l2)); // long l=(int)l
        System.out.println(Addition(10,20)); //19 casting float to int
        System.out.println(Addition(2.8,8.2)); // 19.0
        System.out.println(Multiplication(5,8));
        System.out.println( Multiplication(5.5,3.5));
    }
    public static int Addition(int a, int b) {
       return a + b;

    }
    public static double Addition(double d1, double d2) {
        return d1 + d2;
    }
    public static int Multiplication(int a, int b){
      return a*b;

    }
    public static double Multiplication(double d1, double d2){
      return d1*d2;

    }
}