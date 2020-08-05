package day20_whileLoop;

public class reverse_WithWhileLoop {
    public static void main(String[] args) {
String str = "Cybertek";
//            01234567
        String result="";
        int n = str.length()-1;
        while (n>=0){
            result+=str.charAt(n);

            n--;
        }

        System.out.println(result);
    }
}
